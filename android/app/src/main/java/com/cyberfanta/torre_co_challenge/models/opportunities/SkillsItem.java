package com.cyberfanta.torre_co_challenge.models.opportunities;

public class SkillsItem{
	private String name;
	private String experience;

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setExperience(String experience){
		this.experience = experience;
	}

	public String getExperience(){
		return experience;
	}

	@Override
 	public String toString(){
		return 
			"SkillsItem{" + 
			"name = '" + name + '\'' + 
			",experience = '" + experience + '\'' + 
			"}";
		}
}
