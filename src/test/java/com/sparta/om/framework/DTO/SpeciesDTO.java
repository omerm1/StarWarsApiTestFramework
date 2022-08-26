package com.sparta.om.framework.DTO;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SpeciesDTO{

	@JsonProperty("films")
	private List<String> films;

	@JsonProperty("skin_colors")
	private String skinColors;

	@JsonProperty("homeworld")
	private String homeworld;

	@JsonProperty("edited")
	private String edited;

	@JsonProperty("created")
	private String created;

	@JsonProperty("eye_colors")
	private String eyeColors;

	@JsonProperty("language")
	private String language;

	@JsonProperty("classification")
	private String classification;

	@JsonProperty("people")
	private List<String> people;

	@JsonProperty("url")
	private String url;

	@JsonProperty("hair_colors")
	private String hairColors;

	@JsonProperty("average_height")
	private String averageHeight;

	@JsonProperty("name")
	private String name;

	@JsonProperty("designation")
	private String designation;

	@JsonProperty("average_lifespan")
	private String averageLifespan;

	public List<String> getFilms(){
		return films;
	}

	public String getSkinColors(){
		return skinColors;
	}

	public String getHomeworld(){
		return homeworld;
	}

	public String getEdited(){
		return edited;
	}

	public String getCreated(){
		return created;
	}

	public String getEyeColors(){
		return eyeColors;
	}

	public String getLanguage(){
		return language;
	}

	public String getClassification(){
		return classification;
	}

	public List<String> getPeople(){
		return people;
	}

	public String getUrl(){
		return url;
	}

	public String getHairColors(){
		return hairColors;
	}

	public String getAverageHeight(){
		return averageHeight;
	}

	public String getName(){
		return name;
	}

	public String getDesignation(){
		return designation;
	}

	public String getAverageLifespan(){
		return averageLifespan;
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

	public boolean ClassificationReturnsAString(){
		return getClassification() instanceof String;
	}

	public boolean ClassificationIsNotNull(){
		return getClassification() != null;
	}

	public boolean ClassificationIsNotEmpty(){
		return !getClassification().isEmpty();
	}

	public boolean AverageHeightReturnsAString(){
		return getAverageHeight() instanceof String;
	}

	public boolean AverageHeightIsNotNull(){
		return getAverageHeight() != null;
	}

	public boolean AverageHeightIsNotEmpty(){
		return !getAverageHeight().isEmpty();
	}

	public boolean SkinColourReturnsAString(){
		return getSkinColors() instanceof String;
	}

	public boolean SkinColourIsNotNull(){
		return getSkinColors() != null;
	}

	public boolean SkinColourIsNotEmpty(){
		return !getSkinColors().isEmpty();
	}

	public boolean HairColorReturnsAString(){
		return getSkinColors() instanceof String;
	}

	public boolean HairColorIsNotNull(){
		return getHairColors() != null;
	}

	public boolean HairColorIsNotEmpty(){
		return !getHairColors().isEmpty();
	}

	public boolean EyeColorReturnsAString(){
		return getEyeColors() instanceof String;
	}

	public boolean EyeColorIsNotNull(){
		return getEyeColors() != null;
	}

	public boolean EyeColorIsNotEmpty(){
		return !getEyeColors().isEmpty();
	}

	public boolean AverageLifeSpanReturnsAString(){
		return getAverageLifespan() instanceof String;
	}

	public boolean AverageLifeSpanIsNotNull(){
		return getAverageLifespan() != null;
	}

	public boolean AverageLifeSpanIsNotEmpty(){
		return !getAverageLifespan().isEmpty();
	}

	public boolean HomeLandReturnsAString(){
		return getHomeworld() instanceof String;
	}

	public boolean HomeLandIsNotNull(){
		return getHomeworld() != null;
	}

	public boolean HomeLandIsNotEmpty(){
		return !getHomeworld().isEmpty();
	}

	public boolean LanguageReturnsAString(){
		return getLanguage() instanceof String;
	}

	public boolean LanguageIsNotNull(){
		return getLanguage() != null;
	}

	public boolean LanguageIsNotEmpty(){
		return !getLanguage().isEmpty();
	}

	public boolean PeopleReturnsAString(){
		return getPeople() instanceof List<String>;
	}

	public boolean PeopleIsNotNull(){
		return getPeople() != null;
	}

	public boolean PeopleIsNotEmpty(){
		return !getPeople().isEmpty();
	}

	public boolean FilmsReturnsAString(){
		return getFilms() instanceof List<String>;
	}

	public boolean FilmsIsNotNull(){
		return getFilms() != null;
	}

	public boolean FilmsIsNotEmpty(){
		return !getFilms().isEmpty();
	}

	public boolean CreatedReturnsAString(){
		return getCreated() instanceof String;
	}

	public boolean CreatedIsNotNull(){
		return getCreated() != null;
	}

	public boolean CreatedIsNotEmpty(){
		return !getCreated().isEmpty();
	}

	public boolean EditedReturnsAString(){
		return getEdited() instanceof String;
	}

	public boolean EditedIsNotNull(){
		return getEdited() != null;
	}

	public boolean EditedIsNotEmpty(){
		return !getCreated().isEmpty();
	}

	public boolean UrlReturnsAString(){
		return getUrl() instanceof String;
	}

	public boolean UrlIsNotNull(){
		return getUrl() != null;
	}

	public boolean UrlIsNotEmpty(){
		return !getUrl().isEmpty();
	}

	public boolean DoesSpeciesGetURL() {
		return getUrl().matches("https?:\\/\\/(www\\.)?[-a-zA-Z0-9@:%._\\+~#=]{1,256}\\.[a-zA-Z0-9()]{1,6}\\b([-a-zA-Z0-9()@:%_\\+.~#?&//=]*)");
	}


	@Override
 	public String toString(){
		return 
			"SpeciesDTO{" + 
			"films = '" + films + '\'' + 
			",skin_colors = '" + skinColors + '\'' + 
			",homeworld = '" + homeworld + '\'' + 
			",edited = '" + edited + '\'' + 
			",created = '" + created + '\'' + 
			",eye_colors = '" + eyeColors + '\'' + 
			",language = '" + language + '\'' + 
			",classification = '" + classification + '\'' + 
			",people = '" + people + '\'' + 
			",url = '" + url + '\'' + 
			",hair_colors = '" + hairColors + '\'' + 
			",average_height = '" + averageHeight + '\'' + 
			",name = '" + name + '\'' + 
			",designation = '" + designation + '\'' + 
			",average_lifespan = '" + averageLifespan + '\'' + 
			"}";
		}
}