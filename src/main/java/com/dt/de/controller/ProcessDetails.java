package com.dt.de.controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dt.de.jpa.repository.ProcessMasterRepository;
import com.dt.de.jpa.repository.ProcessMonitoringRepository;
import com.dt.de.jpa.repository.ProcessRepository;
import com.dt.de.model.Process;
import com.dt.de.model.ProcessMaster;
import com.dt.de.model.ProcessMonitoring;
import com.dt.de.model.ProcessStageStatus;
import com.dt.de.model.ProcessStages;

@RestController
@RequestMapping(path = "/dtProcess")
@CrossOrigin
public class ProcessDetails {
	
	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	@Autowired 
	ProcessRepository processRepository;
	
	@Autowired 
	ProcessMasterRepository processMasterRepository;
	
	@Autowired 
	ProcessMonitoringRepository processMonitoringRepository; 
	
	@Autowired
	private EntityManager entityManager;

	
	@GetMapping("/getProcess")
	public @ResponseBody List<Process> getProcess(@RequestParam("staffID") String staffid) {
		return processRepository.fetchOpenAndActiveProcess(staffid);
	}

	@PostMapping("/createProcess")
	public String insertProcess(@RequestBody Process process) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		process.setCREATEDDATE(sdf.format(new Date()));
		process.setPROCESSSTATUS("O");
		System.out.println("Process : "+process);
		Process response = processRepository.save(process);
		return String.valueOf(response.getPROCESSID());
		
	}

	@PostMapping("/updateProcessMonitoring")
	public String updateProcessMonitor(@RequestBody ProcessStages processStages) {
		int processId = processStages.getProcessId();
		String stageDescriptions = processStages.getStageDescription();
		System.out.println("Process ID: "+processId+" : Stage Descriptions :"+stageDescriptions);
		List<Integer> processMonitorIds = new ArrayList<Integer>();
		List<ProcessMaster> procesStageIdList = processMasterRepository.findByPROCESSSTAGEDESCRIPTIONS(Arrays.asList(stageDescriptions.split(",")));
		System.out.println("Process Master list : "+procesStageIdList);
		System.out.println("Process Stage Id List : "+procesStageIdList);
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		for(ProcessMaster processStageMaster : procesStageIdList) {
			ProcessMonitoring processMonitoring = new ProcessMonitoring();
			processMonitoring.setPROCESSID(processId);
			processMonitoring.setPROCESSSTAGEID(processStageMaster.getPROCESSSTAGEID());
			processMonitoring.setSTAGINGDATE(dateFormat.format(new Date()));
			ProcessMonitoring updatedProcessMonitoring = processMonitoringRepository.save(processMonitoring);
			processMonitorIds.add(updatedProcessMonitoring.getPROCESSMONITORINGID());
			System.out.println("updatedProcessMonitoring : "+updatedProcessMonitoring);
		}
		if(processMonitorIds.isEmpty()) {
			return "FAIL";
		}else {
			return "SUCCESS";
		}
	}
	
	@GetMapping("/getProcessStages/{processId}")
	public List<ProcessMonitoring> getProcessStages(@PathVariable("processId") int processId){
		System.out.println("Process ID : "+processId);
		List<ProcessMonitoring> processMonitoringList = new ArrayList<ProcessMonitoring>();
		processMonitoringList = processMonitoringRepository.fetchByPROCESSID(processId);
		System.out.println("processMonitoring : "+processMonitoringList);
		return processMonitoringList;
	}
	
	@GetMapping("/getProcessByUserId/{userId}")
	public List<Process> getProcessWithUserid(@PathVariable("userId") String userId) {
		List<Process> processList = new ArrayList<Process>();
		System.out.println("MyAppController : getProcessWithUserid : User ID :" + userId);
		processList = processRepository.findBySTAFFID(userId);
		return processList;
	}
	
	@GetMapping("/getProcessStageDetails")
	public ProcessStageStatus getProcessStageDetails(@RequestParam("processId") String processId) {
		System.out.println("ProcessDetails : getProcessStageDetails() : processId : " + processId);
		ProcessStageStatus processStageStatus = new ProcessStageStatus();
		StringBuilder stepsCompleted = new StringBuilder();
		StringBuilder stepsToBeCompleted = new StringBuilder();
		StringBuilder nextStepToBeCompleted = new StringBuilder(); 
		List<ProcessMaster> processStagesList = new ArrayList<ProcessMaster>();
		processStagesList = processMasterRepository.fetchByPROCESSID(processId);
		processStageStatus.setProcessId(processId);
		for (ProcessMaster processStage : processStagesList) {
			if (processStage.getpROCESSID() != null) {
				if (stepsCompleted.length() == 0) {
					stepsCompleted.append(processStage.getPROCESSSTAGEDESCRIPTION());
				} else {
					stepsCompleted.append("," + processStage.getPROCESSSTAGEDESCRIPTION());
				}
			} else {
				if(nextStepToBeCompleted.length() == 0) {
					nextStepToBeCompleted.append(processStage.getPROCESSSTAGEDESCRIPTION());
				}else {
					if (stepsToBeCompleted.length() == 0) {
						stepsToBeCompleted.append(processStage.getPROCESSSTAGEDESCRIPTION());
					} else {
						stepsToBeCompleted.append("," + processStage.getPROCESSSTAGEDESCRIPTION());
					}
				}
			}
		}
		processStageStatus.setNextStepofAction(nextStepToBeCompleted.toString());
		processStageStatus.setNoOfSteps(processStagesList.size());
		processStageStatus.setStepsCompleted(stepsCompleted.toString());
		processStageStatus.setStepsToBeCompleted(stepsToBeCompleted.toString());
		System.out.println("ProcessDetails : ProcessStageStatus : "+processStageStatus);
		return processStageStatus;
	}
	
	@CrossOrigin
	@GetMapping("/getProcessStageStatusByUserId/{userId}")
	public List<ProcessStageStatus> getAllProcessStageStatusByUserid(@PathVariable("userId") String userId) {
		LOGGER.info("getProcessWithUserid : User ID :" + userId);
		List<Process> processList = new ArrayList<Process>();
		processList = processRepository.findBySTAFFID(userId);

		List<ProcessStageStatus> processStageStatusList = new ArrayList<ProcessStageStatus>();

		for (Process processData : processList) {
			LOGGER.info("getProcessWithUserid : Process Id :" + processData.getPROCESSID());
			ProcessStageStatus processStageStatus = new ProcessStageStatus();

			StringBuilder stepsCompleted = new StringBuilder();
			StringBuilder stepsToBeCompleted = new StringBuilder();
			int noOfStepsToBeCompleted = 0;
			int noOfStepsCompleted = 0;

			List<ProcessMaster> processStagesList = new ArrayList<ProcessMaster>();
			entityManager.clear();
			processStagesList = processMasterRepository.fetchByPROCESSID(Integer.toString(processData.getPROCESSID()));
			processStageStatus.setProcessId(Integer.toString(processData.getPROCESSID()));
			processStageStatus.setProcessStatus(processData.getPROCESSSTATUS());
			processStageStatus.setRequirement(processData.getREQUIREMENT());
			for (ProcessMaster processStage : processStagesList) {
				if (processStage.getpROCESSID() != null) {
					LOGGER.info("getProcessWithUserid : Process Id :" + processData.getPROCESSID() + " : count");
					++noOfStepsCompleted;
					if (stepsCompleted.length() == 0) {
						stepsCompleted.append(processStage.getPROCESSSTAGEDESCRIPTION());
					} else {
						stepsCompleted.append("," + processStage.getPROCESSSTAGEDESCRIPTION());
					}
				} else {
					++noOfStepsToBeCompleted;
					if (stepsToBeCompleted.length() == 0) {
						stepsToBeCompleted.append(processStage.getPROCESSSTAGEDESCRIPTION());
					} else {
						stepsToBeCompleted.append("," + processStage.getPROCESSSTAGEDESCRIPTION());
					}
				}
			}
			LOGGER.info("getProcessWithUserid : stepsCompleted :" + stepsCompleted.toString());
			LOGGER.info("getProcessWithUserid : stepsToBeCompleted :" + stepsToBeCompleted.toString());
			processStageStatus.setReceivedDate(processData.getCREATEDDATE());
			processStageStatus.setNoOfSteps(processStagesList.size());
			processStageStatus.setStepsCompleted(stepsCompleted.toString());
			processStageStatus.setStepsToBeCompleted(stepsToBeCompleted.toString());
			processStageStatus.setNoOfStepsCompleted(noOfStepsCompleted);
			processStageStatus.setNoOfStepsToBeCompleted(noOfStepsToBeCompleted);
			LOGGER.info("getAllProcessStageStatusByUserid : ProcessStageStatus : " + processStageStatus);
			processStageStatusList.add(processStageStatus);
			
		}
		LOGGER.info("getAllProcessStageStatusByUserid : processStageStatusList : " + processStageStatusList.size());
		return processStageStatusList;
	}

}

