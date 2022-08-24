package com.sparta.om.framework.peopledto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PeopleDTO{

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
}