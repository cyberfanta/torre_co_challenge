package com.cyberfanta.torre_co_challenge.models.bio;

import java.util.List;

public class PersonalityTraitsResults{
	private List<AnalysesItem> analyses;
	private List<GroupsItem> groups;

	public void setAnalyses(List<AnalysesItem> analyses){
		this.analyses = analyses;
	}

	public List<AnalysesItem> getAnalyses(){
		return analyses;
	}

	public void setGroups(List<GroupsItem> groups){
		this.groups = groups;
	}

	public List<GroupsItem> getGroups(){
		return groups;
	}

	@Override
 	public String toString(){
		return 
			"PersonalityTraitsResults{" + 
			"analyses = '" + analyses + '\'' + 
			",groups = '" + groups + '\'' + 
			"}";
		}
}