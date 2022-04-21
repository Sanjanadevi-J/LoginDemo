package com.example.logindemo;

public class Student {
    int id;
    String title,firstName,lastName,gender;
    Student(int id, String title, String firstName, String lastName, String gender){
        this.id=id;
        this.title=title;
        this.firstName=firstName;
        this.lastName=lastName;
        this.gender=gender;
    }
    public int getId() {
        return id ;
    }
    public void setId(String title) {
        this.id  = id;
    }
    public String getTitle() {
        return title ;
    }
    public void setTitle(String title) {
        this.title  = title;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

}
