package com.makotojava.intro;

import java.util.logging.Logger;

public class Person {
	  
	private String name;
	private int age;
	private int height;
	private int  weight;
	private String department;
	private int count;
	private int i;
	//private String eyeColor;
	  
	Logger l = Logger.getLogger(Person.class.getName());
	
	private String gender;
	public Person() {
	// Nothing to do...
	}
	
	public Person(String name, int age, int height, int weight, String department, String gender) {
		  this.name = name;
		  this.age = age;
		  this.height = height;
		  this.weight = weight;
		  this.department = department;
		  this.gender = gender;
		}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getdepartment() {
		return department;
	}

	public void setdepartment(String department) {
		this.department = department ;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public int forLoop(){
		 count = 0;
		for(i = 4; i <= 9; i++){
			count++;
			System.out.printf("%d %d\n ",count, i);
		}	
		return count;
	}
	
	public String whileLoop(){
		 count = 0;
		 i = 4;
		 String a = "";
		 String b = "";
		while(i <= 9){
			a = a + i;
			count++;
			b = b + count;
			i++;
			//System.out.printf("%d %d\n ",count, i);
		}
	    String c = a + b;
		return c;
	}
	public String doWhile(){
		int ccount = 0;
		int j = 4;
		String a = "";
		String b = "";
		do{
			ccount++;
			j++;
			a = a + j;
			b = b + ccount;
		}while(j <= 8);
		String x = a + b;
		return x;
	}
	
	public String continueFor(){
		String a = "";
		String b = "";
		int i;
		int count = 0;
		for(i = 0; i <= 10; i++){
			if(i == 4)
				continue;	
			count++;
			a = a + i;
			b = b + count;
		}
		String c = a + b;
		return c;
	}
	
	public void printAudit(StringBuilder buffer) {
		   buffer.append("Name=");
		   buffer.append(getName());
		   buffer.append(",");
		   buffer.append("Age=");
		   buffer.append(getAge());
		   buffer.append(",");
		   buffer.append("Height=");
		   buffer.append(getHeight());
		   buffer.append(",");
		   buffer.append("Weight=");
		   buffer.append(getWeight());
		   buffer.append(",");
		   buffer.append("Department=");
		   buffer.append(getdepartment());
		   buffer.append(",");
		   buffer.append("Gender=");
		   buffer.append(getGender());
		}
		public void printAudit(Logger l) {
		   StringBuilder sb = new StringBuilder();
		   printAudit(sb);
		   l.info(sb.toString());
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + age;
			result = prime * result + count;
			result = prime * result
					+ ((department == null) ? 0 : department.hashCode());
			result = prime * result
					+ ((gender == null) ? 0 : gender.hashCode());
			result = prime * result + height;
			result = prime * result + i;
			result = prime * result + ((l == null) ? 0 : l.hashCode());
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			result = prime * result + weight;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Person other = (Person) obj;
			if (age != other.age)
				return false;
			if (count != other.count)
				return false;
			if (department == null) {
				if (other.department != null)
					return false;
			} else if (!department.equals(other.department))
				return false;
			if (gender == null) {
				if (other.gender != null)
					return false;
			} else if (!gender.equals(other.gender))
				return false;
			if (height != other.height)
				return false;
			if (i != other.i)
				return false;
			if (l == null) {
				if (other.l != null)
					return false;
			} else if (!l.equals(other.l))
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			if (weight != other.weight)
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "Person [name=" + name + ", age=" + age + ", height="
					+ height + ", weight=" + weight + ", department="
					+ department + ", count=" + count + ", i=" + i + ", l=" + l
					+ ", gender=" + gender + "]";
		}

}	

