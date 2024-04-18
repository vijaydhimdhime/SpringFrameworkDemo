package com.vijay.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class InjectCollection {
	private List<String> names;
	private Set<String> cities;
	private Map<String,String> books;
	public InjectCollection() {
		super();
		// TODO Auto-generated constructor stub
	}
	public InjectCollection(List<String> names, Set<String> cities, Map<String,String> books) {
		super();
		this.names = names;
		this.cities = cities;
		this.books = books;
	}
	public List<String> getNames() {
		return names;
	}
	public void setNames(List<String> names) {
		this.names = names;
	}
	public Set<String> getCities() {
		return cities;
	}
	public void setCities(Set<String> cities) {
		this.cities = cities;
	}
	
	public Map<String, String> getBooks() {
		return books;
	}
	public void setBooks(Map<String, String> books) {
		this.books = books;
	}
	@Override
	public String toString() {
		return "InjectCollection [names=" + names + ", cities=" + cities + ", books=" + books + "]";
	}
	
	
	
	
}
