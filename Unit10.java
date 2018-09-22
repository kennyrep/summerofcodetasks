package com.makotojava.intro;
import java.util.logging.Logger;
public class Unit10 {
	
	private String name;
	private String lesson;
	private int year;
	
	Logger x = Logger.getLogger(Unit10.class.getName());
	
	public Unit10(String name, String lesson, int year){
		this.name = name;
		this.lesson = lesson;
		this.year = year;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLesson() {
		return lesson;
	}
	public void setLesson(String lesson) {
		this.lesson = lesson;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public String arrayUnit(){
		int aa;
		String b = "";
		int[] arrayInt = new int [] {1,2,3,4,5,6,7,11,13,17,19,23,27,29};
		for(int i = 0; i < arrayInt.length; i++){
			 aa = arrayInt[i];
			 b = b + aa;
		}
		return b;
	}

}
