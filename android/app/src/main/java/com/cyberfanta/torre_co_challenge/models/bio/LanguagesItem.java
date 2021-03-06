package com.cyberfanta.torre_co_challenge.models.bio;

public class LanguagesItem{
	private String code;
	private String fluency;
	private String language;

	public void setCode(String code){
		this.code = code;
	}

	public String getCode(){
		return code;
	}

	public void setFluency(String fluency){
		this.fluency = fluency;
	}

	public String getFluency(){
		return fluency;
	}

	public void setLanguage(String language){
		this.language = language;
	}

	public String getLanguage(){
		return language;
	}

	@Override
 	public String toString(){
		return 
			"LanguagesItem{" + 
			"code = '" + code + '\'' + 
			",fluency = '" + fluency + '\'' + 
			",language = '" + language + '\'' + 
			"}";
		}
}
