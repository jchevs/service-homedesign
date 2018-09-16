package com.chevs.homedesign.service.model.sequence;

public enum SequenceType {

	PROJECT_SEQUENCE("PR","project_sequence");
	
	private String prefix;
	
	private String sequenceName;

	SequenceType(String prefix, String sequenceName) {
		this.prefix = prefix;
		this.sequenceName = sequenceName;
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public String getSequenceName() {
		return sequenceName;
	}

	public void setSequenceName(String sequenceName) {
		this.sequenceName = sequenceName;
	}
	
}
