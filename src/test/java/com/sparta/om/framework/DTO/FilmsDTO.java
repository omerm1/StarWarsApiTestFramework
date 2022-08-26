package com.sparta.om.framework.DTO;

import java.time.LocalDate;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class FilmsDTO{

	@JsonProperty("edited")
	private String edited;

	@JsonProperty("director")
	private String director;

	@JsonProperty("created")
	private String created;

	@JsonProperty("vehicles")
	private List<String> vehicles;

	@JsonProperty("opening_crawl")
	private String openingCrawl;

	@JsonProperty("title")
	private String title;

	@JsonProperty("url")
	private String url;

	@JsonProperty("characters")
	private List<String> characters;

	@JsonProperty("episode_id")
	private Integer episodeId;

	@JsonProperty("planets")
	private List<String> planets;

	@JsonProperty("release_date")
	private String releaseDate;

	@JsonProperty("starships")
	private List<String> starships;

	@JsonProperty("species")
	private List<String> species;

	@JsonProperty("producer")
	private String producer;

	public String getEdited(){
		return edited;
	}

	public String getDirector(){
		return director;
	}

	public String getCreated(){
		return created;
	}

	public List<String> getVehicles(){
		return vehicles;
	}

	public String getOpeningCrawl(){
		return openingCrawl;
	}

	public String getTitle(){
		return title;
	}

	public String getUrl(){
		return url;
	}

	public List<String> getCharacters(){
		return characters;
	}

	public Integer getEpisodeId(){
		return episodeId;
	}

	public List<String> getPlanets(){
		return planets;
	}

	public String getReleaseDate(){
		return releaseDate;
	}

	public List<String> getStarships(){
		return starships;
	}

	public List<String> getSpecies(){
		return species;
	}

	public String getProducer(){
		return producer;
	}

	@Override
 	public String toString(){
		return 
			"FilmsDTO{" + 
			"edited = '" + edited + '\'' + 
			",director = '" + director + '\'' + 
			",created = '" + created + '\'' + 
			",vehicles = '" + vehicles + '\'' + 
			",opening_crawl = '" + openingCrawl + '\'' + 
			",title = '" + title + '\'' + 
			",url = '" + url + '\'' + 
			",characters = '" + characters + '\'' + 
			",episode_id = '" + episodeId + '\'' + 
			",planets = '" + planets + '\'' + 
			",release_date = '" + releaseDate + '\'' + 
			",starships = '" + starships + '\'' + 
			",species = '" + species + '\'' + 
			",producer = '" + producer + '\'' + 
			"}";
	}

	public boolean editedIsNotNull() {
		return getEdited() != null;
	}

	public boolean editedIsNotEmpty() {
		return getEdited() != "";
	}

	public boolean editedIsInThePast() {
		LocalDate date = LocalDate.parse(getEdited());
		return LocalDate.now().isAfter(date);
	}

	public boolean directorIsNotNull() {
		return getDirector() != null;
	}

	public boolean directorIsNotEmpty() {
		return !getDirector().equals("");
	}

	public boolean titleIsNotNull() {
		return getTitle() != null;
	}

	public boolean titleIsNotEmpty() {
		return getTitle() != "";
	}

	public boolean createdIsInThePast() {
		LocalDate date = LocalDate.parse(getCreated());
		return LocalDate.now().isAfter(date);
	}

	public boolean createdIsNotNull() {
		return getCreated() != null;
	}

	public boolean createdIsNotEmpty() {
		return getCreated() != "";
	}

	public boolean vehiclesIsNotNull() {
		return getVehicles() != null;
	}

	public boolean vehiclesIsNotEmpty() {
		return !getVehicles().equals("");
	}

	public boolean openingCrawlIsNotEmpty() {
		return !getOpeningCrawl().equals("");
	}

	public boolean openingCrawlIsNotNull() {
		return getOpeningCrawl() != null;
	}

	public boolean urlIsNotEmpty() {
		return !getUrl().equals("");
	}

	public boolean urlIsNotNull() {
		return getUrl() != null;
	}

	public boolean UrlReturnsValidUrl() {
		return getUrl().matches("https?:\\/\\/(www\\.)?[-a-zA-Z0-9@:%._\\+~#=]{1,256}\\.[a-zA-Z0-9()]{1,6}\\b([-a-zA-Z0-9()@:%_\\+.~#?&//=]*)");
	}

	public boolean charactersIsNotEmpty() {
		return !getCharacters().equals("");
	}

	public boolean charactersIsNotNull() {
		return getCharacters() != null;
	}

	public boolean episodeIdIsNotEmpty() {
		return !getEpisodeId().equals("");
	}

	public boolean isEpisodeIdAnInt() {
		return getEpisodeId()instanceof Integer;
	}

	public boolean episodeIdIsNotNull() {
		return getEpisodeId() != null;
	}

	public boolean planetsIsNotEmpty() {
		return !getPlanets().equals("");
	}

	public boolean planetsIsNotNull() {
		return getPlanets() != null;
	}

	public boolean releaseDateIsNotEmpty() {
		return !getReleaseDate().equals("");
	}

	public boolean releaseDateIsNotNull() {
		return getReleaseDate() != null;
	}

	public boolean releaseDateIsInThePast() {
		LocalDate date = LocalDate.parse(getReleaseDate());
		return LocalDate.now().isAfter(date);
	}

	public boolean starshipsIsNotEmpty() {
		return !getStarships().equals("");
	}

	public boolean starshipsIsNotNull() {
		return getStarships() != null;
	}

	public boolean speciesIsNotEmpty() {
		return !getSpecies().equals("");
	}

	public boolean speciesIsNotNull() {
		return getSpecies() != null;
	}

	public boolean producerIsNotEmpty() {
		return !getProducer().equals("");
	}

	public boolean producerIsNotNull() {
		return getProducer() != null;
	}
}