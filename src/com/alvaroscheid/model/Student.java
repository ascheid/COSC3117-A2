package com.alvaroscheid.model;

import java.util.List;

public class Student {

	private typesOfDegrees intendedDegree;
	private List<String> courseTaken;
	private int yearInTheProgram;
	
	public typesOfDegrees getIntendedDegree() {
		return intendedDegree;
	}
	public void setIntendedDegree(typesOfDegrees intendedDegree) {
		this.intendedDegree = intendedDegree;
	}
	public List<String> getCourseTaken() {
		return courseTaken;
	}
	public void setCourseTaken(List<String> courseTaken) {
		this.courseTaken = courseTaken;
	}
	public int getYearInTheProgram() {
		return yearInTheProgram;
	}
	public void setYearInTheProgram(int yearInTheProgram) {
		this.yearInTheProgram = yearInTheProgram;
	}
	
	
}
