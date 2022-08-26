package com.sparta.om.framework.DTO;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class VehicleDTO{

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

	@JsonProperty("created")
	private String created;

	@JsonProperty("length")
	private String length;

	@JsonProperty("url")
	private String url;

	@JsonProperty("manufacturer")
	private String manufacturer;

	@JsonProperty("crew")
	private String crew;

	@JsonProperty("vehicle_class")
	private String vehicleClass;

	@JsonProperty("cost_in_credits")
	private String costInCredits;

	@JsonProperty("name")
	private String name;

	@JsonProperty("model")
	private String model;

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

	public String getCreated(){
		return created;
	}

	public String getLength(){
		return length;
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

	public String getVehicleClass(){
		return vehicleClass;
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
			"VehicleDTO{" + 
			"max_atmosphering_speed = '" + maxAtmospheringSpeed + '\'' + 
			",cargo_capacity = '" + cargoCapacity + '\'' + 
			",films = '" + films + '\'' + 
			",passengers = '" + passengers + '\'' + 
			",pilots = '" + pilots + '\'' + 
			",edited = '" + edited + '\'' + 
			",consumables = '" + consumables + '\'' + 
			",created = '" + created + '\'' + 
			",length = '" + length + '\'' + 
			",url = '" + url + '\'' + 
			",manufacturer = '" + manufacturer + '\'' + 
			",crew = '" + crew + '\'' + 
			",vehicle_class = '" + vehicleClass + '\'' + 
			",cost_in_credits = '" + costInCredits + '\'' + 
			",name = '" + name + '\'' + 
			",model = '" + model + '\'' + 
			"}";
		}

	public boolean nameReturnsAString(){
		return getName() instanceof String;
	}

	public boolean nameIsNotNull(){
		return getName() != null;
	}

	public boolean nameIsNotEmpty(){
		return !getName().isEmpty();
	}

	public boolean ModelReturnsAString() {
		return getModel() instanceof String;
	}

	public boolean ModelIsNotNull(){
		return getModel() != null;
	}

	public boolean ModelIsNotEmpty() {
		return !getModel().isEmpty();
	}

	public boolean ManufacturerReturnsAString() {
		return getManufacturer() instanceof String;
	}

	public boolean ManufacturerIsNotNull(){
		return getManufacturer() != null;
	}

	public boolean ManufacturerIsNotEmpty() {
		return !getManufacturer().isEmpty();
	}

	public boolean CostInCreditsReturnsAnInteger(){
		return Integer.valueOf(getCostInCredits()) instanceof Integer;
	}

	public boolean CostInCreditsIsNotNull(){
		return getCostInCredits() != null;
	}

	public boolean CostInCreditsIsNotEmpty(){
		return !getCostInCredits().isEmpty();
	}

	public boolean LengthReturnADouble(){
		return Double.valueOf(getLength()) instanceof Double ;
	}

	public boolean LengthIsNotNull(){
		return getLength() != null;
	}

	public boolean lengthIsNotEmpty(){
		return !getLength().isEmpty();
	}

	public boolean MaxAtmospheringSpeedingReturnsAnInteger(){
		return Integer.valueOf(getMaxAtmospheringSpeed()) instanceof Integer;
	}

	public boolean MaxAtmospheringSpeedingIsNotNull(){
		return getMaxAtmospheringSpeed() != null;
	}

	public boolean MaxAtmospheringSpeedingIsNotEmpty(){
		return !getMaxAtmospheringSpeed().isEmpty();
	}

	public boolean CrewReturnsAnInt(){
		return Integer.valueOf(getCrew()) instanceof Integer;
	}
	public boolean CrewIsNotNull(){
		return getCrew() != null;
	}

	public boolean CrewIsNotEmpty(){
		return !getCrew().isEmpty();
	}

	public boolean PassengersReturnsAnInteger(){
		return Integer.valueOf(getPassengers()) instanceof Integer;
	}

	public boolean PassengerIsNotNull(){
		return getPassengers() != null;
	}

	public boolean PassengerIsNotEmpty(){
		return !getPassengers().isEmpty();
	}

	public boolean CargoCapacityReturnsAnInteger(){
		return Integer.valueOf(getCargoCapacity()) instanceof Integer;
	}

	public boolean CargoCapacityIsNotNull(){
		return getCargoCapacity() != null;
	}

	public boolean CargoCapacityIsNotEmpty(){
		return !getCargoCapacity().isEmpty();
	}

	public boolean ConsumablesReturnsAString(){
		return Integer.valueOf(getConsumables()) instanceof Integer;
	}

	public boolean ConsumablesIsNotNull(){
		return getConsumables() != null;
	}

	public boolean ConsumablesIsNotEmpty(){
		return !getConsumables().isEmpty();
	}

	public boolean VehicleClassReturnAString(){
		return getVehicleClass() instanceof String;
	}

	public boolean VehicleClassIsNotNull(){
		return getVehicleClass() != null;
	}

	public boolean VehicleClassIsNotEmpty(){
		return !getVehicleClass().isEmpty();
	}

	public boolean pilotsReturnAnArrayist(){
		return getPilots() instanceof ArrayList;
	}

	public boolean pilotsIsNotNull(){
		return getPilots() != null;
	}

	public boolean pilotsIsNotEmpty(){
		return !getPilots().isEmpty();
	}

	public boolean filmsReturnsAnArrayListOfStrings(){
		return getFilms() instanceof ArrayList<String>;
	}

	public boolean filmsIsNotNull(){
		return getFilms() != null;
	}

	public boolean filmsIsNotEmpty(){
		return !getFilms().isEmpty();
	}

//	public boolean createdReturnsADate(){
//		return getCreated() instanceof Date;
//	}

	public boolean createdIsNotNull(){
		return getCreated() != null;
	}

	public boolean createdIsNotEmpty(){
		return !getCreated().isEmpty();
	}

	//	public boolean editedReturnsADate(){
//		return getEdited() instanceof Date;
//	}

	public boolean editedIsNotNull(){
		return getEdited() != null;
	}

	public boolean editedIsNotEmpty(){
		return !getEdited().isEmpty();
	}

	public boolean urlReturnsADate(){
		return getUrl().matches("https?:\\/\\/(www\\.)?[-a-zA-Z0-9@:%._\\+~#=]{1,256}\\.[a-zA-Z0-9()]{1,6}\\b([-a-zA-Z0-9()@:%_\\+.~#?&//=]*)");
	}

	public boolean urlIsNotNull(){
		return getUrl() != null;
	}

	public boolean urlIsNotEmpty(){
		return !getUrl().isEmpty();
	}








}