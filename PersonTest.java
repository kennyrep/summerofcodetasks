package com.makotojava.intro;

import static org.junit.Assert.*;

import java.util.logging.Logger;	
import org.junit.Test;

public class PersonTest {

	@Test
	public void testPerson() {
	  Person p = new Person("Audu Omoh Kehinde, ", 22, 173, 60, " Computer Science ", " MALE");
	  Logger l = Logger.getLogger(Person.class.getName());
	  l.info("Name: " + p.getName());
	  l.info("Age:" + p.getAge());
	  l.info("Height (cm):" + p.getHeight());
	  l.info("Weight (kg):" + p.getWeight());
	  l.info("Eye Color:" + p.getdepartment());
	  l.info("Gender:" + p.getGender());
	  //Implementation of the toString method and its Test Unit
	  l.info("Result:" + p.toString());
	  l.info("For Loop:" + p.forLoop());
	  l.info("While Loop:" + p.whileLoop());
	  l.info("Do While Loop:" + p.doWhile());
	  l.info("Continue Loop:" + p.continueFor());
	  assertEquals("Joe Q Author", p.getName());
	  assertEquals(42, p.getAge());
	  assertEquals(173, p.getHeight());
	  assertEquals(82, p.getWeight());
	  assertEquals("Brown", p.getdepartment());
	  assertEquals("MALE", p.getGender());
	  //for loop
	  assertEquals("1", p.forLoop());
	  assertEquals("2", p.forLoop());
	  assertEquals("3", p.forLoop());
	  assertEquals("4", p.forLoop());
	  assertEquals("5", p.forLoop());
	  assertEquals("6", p.forLoop());
	  //While loop
	  assertEquals("1", p.whileLoop());
	  assertEquals("2", p.whileLoop());
	  assertEquals("3", p.whileLoop());
	  assertEquals("4", p.whileLoop());
	  assertEquals("5", p.whileLoop());
	  assertEquals("6", p.whileLoop());
	  //for Do While Loop
	  assertEquals ("1", p.doWhile());
	  assertEquals ("2", p.doWhile());
	  assertEquals ("3", p.doWhile());
	  assertEquals ("4", p.doWhile());
	  assertEquals ("5", p.doWhile());
	  assertEquals ("6", p.doWhile());
	  //Continue Statement
	}

}
