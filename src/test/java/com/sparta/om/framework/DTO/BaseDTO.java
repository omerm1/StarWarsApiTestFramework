package com.sparta.om.framework.DTO;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BaseDTO {

	@JsonProperty("next")
	private String next;

	@JsonProperty("previous")
	private Object previous;

	@JsonProperty("count")
	private Integer count;

	@JsonProperty("results")
	private List<ResultsItem> results;

	public String getNext(){
		return next;
	}

	public Object getPrevious(){
		return previous;
	}

	public Integer getCount(){
		return count;
	}

	public List<ResultsItem> getResults(){
		return results;
	}

	@Override
 	public String toString(){
		return 
			"PeopleDTO{" + 
			"next = '" + next + '\'' + 
			",previous = '" + previous + '\'' + 
			",count = '" + count + '\'' + 
			",results = '" + results + '\'' + 
			"}";
	}

	public boolean isCountAPositiveNumber() {
		return getCount() > 0;
	}

	public boolean isCountAnInt() {
		return getCount()instanceof Integer;
	}

	public boolean isCountNotNull() {
		return getCount() != null;
	}

	public boolean isCountNotEmpty() {
		return getCount() != 0;
	}

	public boolean isNextNotEmpty() {
		return !getNext().equals("");
	}

	public boolean isNextNotNull() {
		return getNext() != null;
	} //check

	public boolean DoesNextReturnUrl() {
		return getNext().toString().matches("https?:\\/\\/(www\\.)?[-a-zA-Z0-9@:%._\\+~#=]{1,256}\\.[a-zA-Z0-9()]{1,6}\\b([-a-zA-Z0-9()@:%_\\+.~#?&//=]*)");
	}

	public boolean isPreviousNotEmpty() {
		return !getPrevious().equals("");
	}

	public boolean isPreviousNotNull() {
		return getPrevious() != null;
	}

	public boolean DoesPreviousReturnUrl() {
		return getPrevious().toString().matches("https?:\\/\\/(www\\.)?[-a-zA-Z0-9@:%._\\+~#=]{1,256}\\.[a-zA-Z0-9()]{1,6}\\b([-a-zA-Z0-9()@:%_\\+.~#?&//=]*)");
	}
}