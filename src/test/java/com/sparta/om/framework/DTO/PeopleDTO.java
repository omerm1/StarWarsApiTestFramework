package com.sparta.om.framework.DTO;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PeopleDTO {

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
			"PeopleWithNDTO{" + 
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

	public boolean NameReturnsAString(){
		return getName() instanceof String;
	}

	public boolean NameIsNotNull(){
		return getName() != null;
	}

	public boolean NameIsNotEmpty(){
		return !getName().isEmpty();
	}

	//The string can be returned as unknown
	public boolean HeightReturnsInteger(){
		return Integer.valueOf(getHeight()) instanceof Integer;
	}

	public boolean HeightIsNotNull(){
		return getHeight() != null;
	}

	public boolean HeightIsNotEmpty(){
		return !getHeight().isEmpty();
	}

	public boolean MassReturnsInteger(){
		return Integer.valueOf(getMass()) instanceof  Integer;
	}

	public boolean MassIsNotNull(){
		return getMass() != null;
	}

	public boolean MassIsNotEmpty(){
		return !getMass().isEmpty();
	}

	public boolean HairColourReturnsAString(){
		return getHairColor() instanceof String;
	}

	public boolean HairColourIsNotNull() {
		return getHairColor() != null;
	}

	public boolean HairColourIsNotEmpty() {
		return !getHairColor().isEmpty();
	}

	public boolean SkinColourReturnsAString(){
		return getSkinColor() instanceof String;
	}

	public boolean SkinColourIsNotNull(){
		return getSkinColor() != null;
	}

	public boolean SkinColourIsNotEmpty(){
		return getSkinColor().isEmpty();
	}

	public boolean EyeColourReturnsAString(){
		return getEyeColor() instanceof String;
	}

	public boolean EyeColourIsNotNull(){
		return getEyeColor() != null;
	}

	public boolean EyeColourIsNotEmpty(){
		return !getEyeColor().isEmpty();
	}


	public boolean BirthYearIsValid(){
		if (getBirthYear().contains("unknown")
			|| getBirthYear().matches("[+-]?([0-9]*[.])?[0-9]+.{0,1}[B,Y,A]{3}")) {
			return true;
		}else{
			return false;
		}
	}
	public boolean BirthYearIsNotNull(){
		return getBirthYear() != null;
	}
	public boolean BirthYearIsNotEmpty(){
		return !getBirthYear().isEmpty();
	}
	public boolean GenderIsValid(){
		return getGender().equals("Male")
				|| getGender().equals("Female")
				|| getGender().equals("none")
				|| getGender().equals("n/a");
	}

	public boolean GenderIsNotNull(){
		return getGender() != null;
	}
	public boolean GenderIsNotEmpty(){
		return !getGender().isEmpty();
	}
	public boolean HomeWorldIsAString(){
		return getHomeworld()instanceof String;
	}
	public boolean HomeWorldReturnsURL(){
		return getHomeworld().matches("https?:\\/\\/(www\\.)?[-a-zA-Z0-9@:%._\\+~#=]{1,256}\\.[a-zA-Z0-9()]{1,6}\\b([-a-zA-Z0-9()@:%_\\+.~#?&//=]*)");
	}
	public boolean HomeWorldIsNotEmpty(){
		return !getHomeworld().isEmpty();
	}

	public boolean HomeWorldIsNotNull(){
		return getHomeworld() != null;
	}
	public boolean FilmsReturnsAnArrayOfStrings(){
		return getFilms() instanceof ArrayList<String>;
	}
	public boolean FilmsIsNotEmpty(){
		return !getFilms().isEmpty();
	}
	public boolean FilmsIsNotNull(){
		return getFilms() != null;
	}
	public boolean SpeciesReturnsAnObject(){
		return getSpecies() instanceof Object;
	}
	public boolean SpeciesIsNotEmpty(){
		return !getSpecies().isEmpty();
	}
	public boolean SpeciesIsNotNull(){
		return getSpecies() != null;
	}
	public boolean VehiclesReturnsAnArrayOfStrings(){
		return getVehicles() instanceof ArrayList<String>;
	}
	public boolean VehiclesIsNotEmpty(){ return !getVehicles().isEmpty();}
	public boolean VehiclesIsNotNull(){
		return getVehicles() != null;
	}
	public boolean StarshipsReturnsAnArrayOfStrings(){ return getStarships() instanceof ArrayList<String>;}
	public boolean StarshipsIsNotEmpty(){ return !getStarships().isEmpty();}
	public boolean StarshipsIsNotNull(){
		return getStarships() != null;
	}
}