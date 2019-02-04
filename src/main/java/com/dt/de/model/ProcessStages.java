package com.dt.de.model;

public class ProcessStages {

	int processId;
	String stageDescription;
	
	public int getProcessId() {
		return processId;
	}
	public void setProcessId(int processId) {
		this.processId = processId;
	}
	public String getStageDescription() {
		return stageDescription;
	}
	public void setStageDescription(String stageDescription) {
		this.stageDescription = stageDescription;
	}
	@Override
	public String toString() {
		return "ProcessStages [processId=" + processId + ", stageDescription=" + stageDescription + "]";
	}
	
}
