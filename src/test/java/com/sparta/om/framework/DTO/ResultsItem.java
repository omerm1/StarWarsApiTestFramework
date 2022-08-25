package com.sparta.om.framework.DTO;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ResultsItem{

	@JsonProperty("max_atmosphering_speed")
	private String maxAtmospheringSpeed;

	@JsonProperty("cargo_capacity")
	private String cargoCapacity;

	@JsonProperty("films")
	private List<String> films;

	@JsonProperty("passengers")
	private String passengers;

	@JsonProperty("pilots")
	private List<Object> pilots;

	@JsonProperty("edited")
	private String edited;

	@JsonProperty("consumables")
	private String consumables;

	@JsonProperty("MGLT")
	private String mGLT;

	@JsonProperty("created")
	private String created;

	@JsonProperty("length")
	private String length;

	@JsonProperty("starship_class")
	private String starshipClass;

	@JsonProperty("url")
	private String url;

	@JsonProperty("manufacturer")
	private String manufacturer;

	@JsonProperty("crew")
	private String crew;

	@JsonProperty("hyperdrive_rating")
	private String hyperdriveRating;

	@JsonProperty("cost_in_credits")
	private String costInCredits;

	@JsonProperty("name")
	private String name;

	@JsonProperty("model")
	private String model;

	@JsonProperty("homeworld")
	private String homeworld;

	@JsonProperty("gender")
	private String gender;

	@JsonProperty("skin_color")
	private String skinColor;

	@JsonProperty("mass")
	private String mass;

	@JsonProperty("vehicles")
	private List<String> vehicles;

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

	@JsonProperty("height")
	private String height;

	@JsonProperty("climate")
	private String climate;

	@JsonProperty("rotation_period")
	private String rotationPeriod;

	@JsonProperty("population")
	private String population;

	@JsonProperty("orbital_period")
	private String orbitalPeriod;

	@JsonProperty("surface_water")
	private String surfaceWater;

	@JsonProperty("diameter")
	private String diameter;

	@JsonProperty("gravity")
	private String gravity;

	@JsonProperty("residents")
	private List<String> residents;

	@JsonProperty("terrain")
	private String terrain;

	@JsonProperty("vehicle_class")
	private String vehicleClass;

	@JsonProperty("director")
	private String director;

	@JsonProperty("opening_crawl")
	private String openingCrawl;

	@JsonProperty("title")
	private String title;

	@JsonProperty("characters")
	private List<String> characters;

	@JsonProperty("episode_id")
	private Integer episodeId;

	@JsonProperty("planets")
	private List<String> planets;

	@JsonProperty("release_date")
	private String releaseDate;

	@JsonProperty("producer")
	private String producer;

	@JsonProperty("skin_colors")
	private String skinColors;

	@JsonProperty("eye_colors")
	private String eyeColors;

	@JsonProperty("language")
	private String language;

	@JsonProperty("classification")
	private String classification;

	@JsonProperty("people")
	private List<String> people;

	@JsonProperty("hair_colors")
	private String hairColors;

	@JsonProperty("average_height")
	private String averageHeight;


	@JsonProperty("designation")
	private String designation;

	@JsonProperty("average_lifespan")
	private String averageLifespan;

	public String getMaxAtmospheringSpeed(){
		return maxAtmospheringSpeed;
	}

	public String getCargoCapacity(){
		return cargoCapacity;
	}

	public List<String> getFilms(){
		return films;
	}

	public String getPassengers(){
		return passengers;
	}

	public List<Object> getPilots(){
		return pilots;
	}

	public String getEdited(){
		return edited;
	}

	public String getConsumables(){
		return consumables;
	}

	public String getMGLT(){
		return mGLT;
	}

	public String getCreated(){
		return created;
	}

	public String getLength(){
		return length;
	}

	public String getStarshipClass(){
		return starshipClass;
	}

	public String getUrl(){
		return url;
	}

	public String getManufacturer(){
		return manufacturer;
	}

	public String getCrew(){
		return crew;
	}

	public String getHyperdriveRating(){
		return hyperdriveRating;
	}

	public String getCostInCredits(){
		return costInCredits;
	}

	public String getName(){
		return name;
	}

	public String getModel(){
		return model;
	}

	@Override
 	public String toString(){
		return 
			"ResultsItem{" + 
			"max_atmosphering_speed = '" + maxAtmospheringSpeed + '\'' + 
			",cargo_capacity = '" + cargoCapacity + '\'' + 
			",films = '" + films + '\'' + 
			",passengers = '" + passengers + '\'' + 
			",pilots = '" + pilots + '\'' + 
			",edited = '" + edited + '\'' + 
			",consumables = '" + consumables + '\'' + 
			",mGLT = '" + mGLT + '\'' + 
			",created = '" + created + '\'' + 
			",length = '" + length + '\'' + 
			",starship_class = '" + starshipClass + '\'' + 
			",url = '" + url + '\'' + 
			",manufacturer = '" + manufacturer + '\'' + 
			",crew = '" + crew + '\'' + 
			",hyperdrive_rating = '" + hyperdriveRating + '\'' + 
			",cost_in_credits = '" + costInCredits + '\'' + 
			",name = '" + name + '\'' + 
			",model = '" + model + '\'' + 
			"}";
		}
}