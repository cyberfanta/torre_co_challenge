package com.cyberfanta.torre_co_challenge.models.bio;

import java.util.List;

public class JobsItem{
	private String toYear;
	private boolean highlighted;
	private String toMonth;
	private int weight;
	private List<Object> media;
	private int verifications;
	private int recommendations;
	private List<Object> responsibilities;
	private String fromYear;
	private String name;
	private List<OrganizationsItem> organizations;
	private String fromMonth;
	private int rank;
	private String id;
	private String category;
	private boolean remote;
	private String additionalInfo;

	public void setToYear(String toYear){
		this.toYear = toYear;
	}

	public String getToYear(){
		return toYear;
	}

	public void setHighlighted(boolean highlighted){
		this.highlighted = highlighted;
	}

	public boolean isHighlighted(){
		return highlighted;
	}

	public void setToMonth(String toMonth){
		this.toMonth = toMonth;
	}

	public String getToMonth(){
		return toMonth;
	}

	public void setWeight(int weight){
		this.weight = weight;
	}

	public int getWeight(){
		return weight;
	}

	public void setMedia(List<Object> media){
		this.media = media;
	}

	public List<Object> getMedia(){
		return media;
	}

	public void setVerifications(int verifications){
		this.verifications = verifications;
	}

	public int getVerifications(){
		return verifications;
	}

	public void setRecommendations(int recommendations){
		this.recommendations = recommendations;
	}

	public int getRecommendations(){
		return recommendations;
	}

	public void setResponsibilities(List<Object> responsibilities){
		this.responsibilities = responsibilities;
	}

	public List<Object> getResponsibilities(){
		return responsibilities;
	}

	public void setFromYear(String fromYear){
		this.fromYear = fromYear;
	}

	public String getFromYear(){
		return fromYear;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setOrganizations(List<OrganizationsItem> organizations){
		this.organizations = organizations;
	}

	public List<OrganizationsItem> getOrganizations(){
		return organizations;
	}

	public void setFromMonth(String fromMonth){
		this.fromMonth = fromMonth;
	}

	public String getFromMonth(){
		return fromMonth;
	}

	public void setRank(int rank){
		this.rank = rank;
	}

	public int getRank(){
		return rank;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setCategory(String category){
		this.category = category;
	}

	public String getCategory(){
		return category;
	}

	public void setRemote(boolean remote){
		this.remote = remote;
	}

	public boolean isRemote(){
		return remote;
	}

	public void setAdditionalInfo(String additionalInfo){
		this.additionalInfo = additionalInfo;
	}

	public String getAdditionalInfo(){
		return additionalInfo;
	}

	@Override
 	public String toString(){
		return 
			"JobsItem{" + 
			"toYear = '" + toYear + '\'' + 
			",highlighted = '" + highlighted + '\'' + 
			",toMonth = '" + toMonth + '\'' + 
			",weight = '" + weight + '\'' + 
			",media = '" + media + '\'' + 
			",verifications = '" + verifications + '\'' + 
			",recommendations = '" + recommendations + '\'' + 
			",responsibilities = '" + responsibilities + '\'' + 
			",fromYear = '" + fromYear + '\'' + 
			",name = '" + name + '\'' + 
			",organizations = '" + organizations + '\'' + 
			",fromMonth = '" + fromMonth + '\'' + 
			",rank = '" + rank + '\'' + 
			",id = '" + id + '\'' + 
			",category = '" + category + '\'' + 
			",remote = '" + remote + '\'' + 
			",additionalInfo = '" + additionalInfo + '\'' + 
			"}";
		}
}