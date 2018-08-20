package com.datasphere.ui.wrapper;

import java.util.ArrayList;

public class CreateObjectiveWrapper {
	
	private boolean isObjectiveAlreadyExists;
	private boolean isClonedObjective;
	
	private String objectiveName;
	private String objectiveDescription;
	private String ifAttribute;
	private String ifComparator;
	private String ifCondition;
	
	private ArrayList<String> createdObjectiveList = new ArrayList<String>();

	CreateObjectiveWrapper(String objectiveName, String description, String ifAttribute, String ifComparator, String ifCondition) {
	}
	
	public boolean isObjectiveAlreadyExists(String objectiveName) {
		if(createdObjectiveList.contains(objectiveName)) {
			return true;
		}
		else return false;
	}
	
}