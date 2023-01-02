package com.comparator;

public class Emp {
private String Name;
private int age;
private String city;

public Emp() {
	// TODO Auto-generated constructor stub
}

public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public Emp(String name, int age, String city) {
	super();
	Name = name;
	this.age = age;
	this.city = city;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
@Override
public String toString() {
	return "Emp [Name=" + Name + ", age=" + age + ", city=" + city + "]";
}



}
