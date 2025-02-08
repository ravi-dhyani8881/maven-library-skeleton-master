package com.main.external.model;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Root{
    @JsonProperty("results") 
    public ArrayList<Result> getResults() { 
		 return this.results; } 
    public void setResults(ArrayList<Result> results) { 
		 this.results = results; } 
    ArrayList<Result> results;
}

