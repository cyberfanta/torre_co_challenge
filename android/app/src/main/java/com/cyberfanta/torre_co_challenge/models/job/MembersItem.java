package com.cyberfanta.torre_co_challenge.models.job;

public class MembersItem{
	private boolean visible;
	private boolean manager;
	private Person person;
	private boolean member;
	private String id;
	private boolean poster;
	private String status;

	public void setVisible(boolean visible){
		this.visible = visible;
	}

	public boolean isVisible(){
		return visible;
	}

	public void setManager(boolean manager){
		this.manager = manager;
	}

	public boolean isManager(){
		return manager;
	}

	public void setPerson(Person person){
		this.person = person;
	}

	public Person getPerson(){
		return person;
	}

	public void setMember(boolean member){
		this.member = member;
	}

	public boolean isMember(){
		return member;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setPoster(boolean poster){
		this.poster = poster;
	}

	public boolean isPoster(){
		return poster;
	}

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return status;
	}

	@Override
 	public String toString(){
		return 
			"MembersItem{" + 
			"visible = '" + visible + '\'' + 
			",manager = '" + manager + '\'' + 
			",person = '" + person + '\'' + 
			",member = '" + member + '\'' + 
			",id = '" + id + '\'' + 
			",poster = '" + poster + '\'' + 
			",status = '" + status + '\'' + 
			"}";
		}
}
