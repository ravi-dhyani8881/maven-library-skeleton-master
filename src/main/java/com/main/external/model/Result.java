package com.main.external.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Result{
    @JsonProperty("id") 
    public String getId() { 
		 return this.id; } 
    public void setId(String id) { 
		 this.id = id; } 
    String id;
    @JsonProperty("title") 
    public String getTitle() { 
		 return this.title; } 
    public void setTitle(String title) { 
		 this.title = title; } 
    String title;
    @JsonProperty("content") 
    public String getContent() { 
		 return this.content; } 
    public void setContent(String content) { 
		 this.content = content; } 
    String content;
    @JsonProperty("_version_") 
    public Object get_version_() { 
		 return this._version_; } 
    public void set_version_(Object _version_) { 
		 this._version_ = _version_; } 
    Object _version_;
}