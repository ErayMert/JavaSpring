package com.spring;

/**
 * Created by eraym on 22.07.2018.
 */
public class JavaMan {

    private int id;
    private String firstName;
    private String lastName;

    public JavaMan(int id, String firstName, String lastName){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "JavaMan{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
