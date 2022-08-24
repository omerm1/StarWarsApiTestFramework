package com.sparta.om.framework.peopledto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ResultsItem{

	@JsonProperty("films")
	private List<String> films;

	@JsonProperty("homeworld")
	private String homeworld;

	@JsonProperty("gender")
	private String gender;

	@JsonProperty("skin_color")
	private String skinColor;

	@JsonProperty("edited")
	private String edited;

	@JsonProperty("created")
	private String created;

	@JsonProperty("mass")
	private String mass;

	@JsonProperty("vehicles")
	private List<String> vehicles;

	@JsonProperty("url")
	private String url;

	@JsonProperty("hair_color")
	private String hairColor;

	@JsonProperty("birth_year")
	private String birthYear;

	@JsonProperty("eye_color")
	private String eyeColor;

	@JsonProperty("species")
	private List<Object> species;

	@JsonProperty("starships")
	private List<String> starships;

	@JsonProperty("name")
	private String name;

	@JsonProperty("height")
	private String height;

	public List<String> getFilms(){
		return films;
	}

	public String getHomeworld(){
		return homeworld;
	}

	public String getGender(){
		return gender;
	}

	public String getSkinColor(){
		return skinColor;
	}

	public String getEdited(){
		return edited;
	}

	public String getCreated(){
		return created;
	}

	public String getMass(){
		return mass;
	}

	public List<String> getVehicles(){
		return vehicles;
	}

	public String getUrl(){
		return url;
	}

	public String getHairColor(){
		return hairColor;
	}

	public String getBirthYear(){
		return birthYear;
	}

	public String getEyeColor(){
		return eyeColor;
	}

	public List<Object> getSpecies(){
		return species;
	}

	public List<String> getStarships(){
		return starships;
	}

	public String getName(){
		return name;
	}

	public String getHeight(){
		return height;
	}

	@Override
 	public String toString(){
		return 
			"ResultsItem{" + 
			"films = '" + films + '\'' + 
			",homeworld = '" + homeworld + '\'' + 
			",gender = '" + gender + '\'' + 
			",skin_color = '" + skinColor + '\'' + 
			",edited = '" + edited + '\'' + 
			",created = '" + created + '\'' + 
			",mass = '" + mass + '\'' + 
			",vehicles = '" + vehicles + '\'' + 
			",url = '" + url + '\'' + 
			",hair_color = '" + hairColor + '\'' + 
			",birth_year = '" + birthYear + '\'' + 
			",eye_color = '" + eyeColor + '\'' + 
			",species = '" + species + '\'' + 
			",starships = '" + starships + '\'' + 
			",name = '" + name + '\'' + 
			",height = '" + height + '\'' + 
			"}";
		}
}