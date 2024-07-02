package com.cont; // Assuming your package is com.cont

public class User {
    private String name;
    private int age;
    private String address;

    // Constructors
    public User() {
        // Default constructor
    }

    public User(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

  

    public int getAge() {
        return age;
    }
     
    public String getAddress() {
    	return address;
    }
}

