package com.dt.de.model;

public class ProcessStageStatus {
	
	String processId;
	int noOfSteps;
	String stepsCompleted;
	String stepsToBeCompleted;
	String nextStepofAction;
	int noOfStepsToBeCompleted;
	int noOfStepsCompleted;
	String receivedDate;
	String processStatus;
	String requirement;
	public String getProcessId() {
		return processId;
	}
	public void setProcessId(String processId) {
		this.processId = processId;
	}
	public int getNoOfSteps() {
		return noOfSteps;
	}
	public void setNoOfSteps(int noOfSteps) {
		this.noOfSteps = noOfSteps;
	}
	public String getStepsCompleted() {
		return stepsCompleted;
	}
	public void setStepsCompleted(String stepsCompleted) {
		this.stepsCompleted = stepsCompleted;
	}
	public String getStepsToBeCompleted() {
		return stepsToBeCompleted;
	}
	public void setStepsToBeCompleted(String stepsToBeCompleted) {
		this.stepsToBeCompleted = stepsToBeCompleted;
	}
	public String getNextStepofAction() {
		return nextStepofAction;
	}
	public void setNextStepofAction(String nextStepofAction) {
		this.nextStepofAction = nextStepofAction;
	}
	public int getNoOfStepsToBeCompleted() {
		return noOfStepsToBeCompleted;
	}
	public void setNoOfStepsToBeCompleted(int noOfStepsToBeCompleted) {
		this.noOfStepsToBeCompleted = noOfStepsToBeCompleted;
	}
	public int getNoOfStepsCompleted() {
		return noOfStepsCompleted;
	}
	public void setNoOfStepsCompleted(int noOfStepsCompleted) {
		this.noOfStepsCompleted = noOfStepsCompleted;
	}
	public String getReceivedDate() {
		return receivedDate;
	}
	public void setReceivedDate(String receivedDate) {
		this.receivedDate = receivedDate;
	}
	public String getProcessStatus() {
		return processStatus;
	}
	public void setProcessStatus(String processStatus) {
		this.processStatus = processStatus;
	}
	public String getRequirement() {
		return requirement;
	}
	public void setRequirement(String requirement) {
		this.requirement = requirement;
	}
	@Override
	public String toString() {
		return "ProcessStageStatus [processId=" + processId + ", noOfSteps=" + noOfSteps + ", stepsCompleted="
				+ stepsCompleted + ", stepsToBeCompleted=" + stepsToBeCompleted + ", nextStepofAction="
				+ nextStepofAction + ", noOfStepsToBeCompleted=" + noOfStepsToBeCompleted + ", noOfStepsCompleted="
				+ noOfStepsCompleted + ", receivedDate=" + receivedDate + ", processStatus=" + processStatus
				+ ", requirement=" + requirement + "]";
	}
	
}