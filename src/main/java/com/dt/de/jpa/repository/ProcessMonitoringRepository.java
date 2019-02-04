package com.dt.de.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.dt.de.model.ProcessMonitoring;


public interface ProcessMonitoringRepository extends JpaRepository<ProcessMonitoring, Integer>{
	
	@Query(value = "SELECT * FROM DT_TBL_PROCESS_MONITORING PM INNER JOIN DT_TBL_PROCESS_STAGE_MASTER PS ON PM.PROCESSSTAGEID = PS.PROCESSSTAGEID WHERE PM.PROCESSID=?1", nativeQuery = true)
	List<ProcessMonitoring> fetchByPROCESSID(int processId);
	
}
