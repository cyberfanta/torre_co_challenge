package com.cyberfanta.torre_co_challenge.models.bio;

import java.util.List;

public class Bio{
	private List<ProjectsItem> projects;
	private List<EducationItem> education;
	private List<LanguagesItem> languages;
	private List<JobsItem> jobs;
	private List<ExperiencesItem> experiences;
	private List<OpportunitiesItem> opportunities;
	private Stats stats;
	private Person person;
	private List<StrengthsItem> strengths;
	private List<Object> awards;
	private ProfessionalCultureGenomeResults professionalCultureGenomeResults;
	private PersonalityTraitsResults personalityTraitsResults;
	private List<InterestsItem> interests;
	private List<PublicationsItem> publications;

	public void setProjects(List<ProjectsItem> projects){
		this.projects = projects;
	}

	public List<ProjectsItem> getProjects(){
		return projects;
	}

	public void setEducation(List<EducationItem> education){
		this.education = education;
	}

	public List<EducationItem> getEducation(){
		return education;
	}

	public void setLanguages(List<LanguagesItem> languages){
		this.languages = languages;
	}

	public List<LanguagesItem> getLanguages(){
		return languages;
	}

	public void setJobs(List<JobsItem> jobs){
		this.jobs = jobs;
	}

	public List<JobsItem> getJobs(){
		return jobs;
	}

	public void setExperiences(List<ExperiencesItem> experiences){
		this.experiences = experiences;
	}

	public List<ExperiencesItem> getExperiences(){
		return experiences;
	}

	public void setOpportunities(List<OpportunitiesItem> opportunities){
		this.opportunities = opportunities;
	}

	public List<OpportunitiesItem> getOpportunities(){
		return opportunities;
	}

	public void setStats(Stats stats){
		this.stats = stats;
	}

	public Stats getStats(){
		return stats;
	}

	public void setPerson(Person person){
		this.person = person;
	}

	public Person getPerson(){
		return person;
	}

	public void setStrengths(List<StrengthsItem> strengths){
		this.strengths = strengths;
	}

	public List<StrengthsItem> getStrengths(){
		return strengths;
	}

	public void setAwards(List<Object> awards){
		this.awards = awards;
	}

	public List<Object> getAwards(){
		return awards;
	}

	public void setProfessionalCultureGenomeResults(ProfessionalCultureGenomeResults professionalCultureGenomeResults){
		this.professionalCultureGenomeResults = professionalCultureGenomeResults;
	}

	public ProfessionalCultureGenomeResults getProfessionalCultureGenomeResults(){
		return professionalCultureGenomeResults;
	}

	public void setPersonalityTraitsResults(PersonalityTraitsResults personalityTraitsResults){
		this.personalityTraitsResults = personalityTraitsResults;
	}

	public PersonalityTraitsResults getPersonalityTraitsResults(){
		return personalityTraitsResults;
	}

	public void setInterests(List<InterestsItem> interests){
		this.interests = interests;
	}

	public List<InterestsItem> getInterests(){
		return interests;
	}

	public void setPublications(List<PublicationsItem> publications){
		this.publications = publications;
	}

	public List<PublicationsItem> getPublications(){
		return publications;
	}

	@Override
 	public String toString(){
		return 
			"Bio{" + 
			"projects = '" + projects + '\'' + 
			",education = '" + education + '\'' + 
			",languages = '" + languages + '\'' + 
			",jobs = '" + jobs + '\'' + 
			",experiences = '" + experiences + '\'' + 
			",opportunities = '" + opportunities + '\'' + 
			",stats = '" + stats + '\'' + 
			",person = '" + person + '\'' + 
			",strengths = '" + strengths + '\'' + 
			",awards = '" + awards + '\'' + 
			",professionalCultureGenomeResults = '" + professionalCultureGenomeResults + '\'' + 
			",personalityTraitsResults = '" + personalityTraitsResults + '\'' + 
			",interests = '" + interests + '\'' + 
			",publications = '" + publications + '\'' + 
			"}";
		}
}