package com.example.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity (name = "Actor") // This tells Hibernate to make a table out of this class
public class Actor {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO) //Auto increment id
  @Column(name = "id", updatable = false)
  private long id;
  @Column(name = "first_name",nullable = false) // It should not be null
  private String firstName;
  @Column(name = "last_name",nullable = false) // It should not be null
  private String lastName;
  @Column(name = "email",nullable = false, unique = true)  //Email should be unique
  private String email;
  @Column(name = "loc",nullable = false)  // It should not be null
  private String location; 
  
  
  public Actor() {
    
  }
  public Actor( String firstName, String lastName, String email, String location) {
    super();
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.location = location;
  }
  public long getId() {
    return id;
  }
  public void setId(long id) {
    this.id = id;
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
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  public String getLocation() {
    return location;
  }
  public void setLocation(String location) {
    this.location = location;
  }
  @Override
  public String toString() {
    return "Actor [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
        + ", location=" + location + "]";
  }
  
  
  
}