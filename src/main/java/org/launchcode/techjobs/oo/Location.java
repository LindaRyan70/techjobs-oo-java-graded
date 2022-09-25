package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Location extends JobField{ // only kept the one constructor, since all other code extends JobField.

//    private int id;
//    private static int nextId = 1;
//    private String value;
//
//    public Location() {
//        id = nextId;
//        nextId++;
//    }
//
    // TODO: Add a constructor that takes a string as a parameter and assigns it to the 'value' field. The
    //  constructor should also call the empty constructor in order to initialize the 'id' field.
//    public Location(String value) {  // created a constructor that has a param for value
//        this();     // call the first constructor to init the id field
//        this.value = value;     //  init the value field
//    }
//


      //  Turned off all other code blocks in this Class, since extended in JobField
     public Location(String value) {  // created a constructor that has a param for value
           super(value);     // call the first constructor to init the id field
        }


//     Custom toString, equals, and hashCode methods:
//
//    @Override
//    public String toString() {
//        return value;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Location)) return false;
//        Location location = (Location) o;
//        return getId() == location.getId();
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(getId());
//    }
//
//    // Getters and Setters:
//
//    public int getId() {
//        return id;
//    }
//
//    public String getValue() {
//        return value;
//    }
//
//    public void setValue(String value) {
//        this.value = value;
//    }

}
