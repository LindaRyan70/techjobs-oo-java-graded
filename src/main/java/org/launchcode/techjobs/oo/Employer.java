package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Employer extends JobField {    // only kept the one constructor, since all other code extends JobField.

//    private int id;
//    private static int nextId = 1;
//    private String value;
//
//    public Employer() {
//        id = nextId;
//        nextId++;
//    }

//    public Employer(String value) {
//        this();
//        this.value = value;
//    }


     public Employer(String value) {    // Turned off all other code blocks in this Class, since extended in JobField
           super(value);
        }


//   //  Custom toString, equals, and hashCode methods:
//
//    @Override
//    public String toString() {
//        return value;
//    }

//    @Override
//    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
//        if (this == o) return true;
//        if (!(o instanceof Employer)) return false;
//        Employer employer = (Employer) o;
//        return getId() == employer.getId();
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
//    }  // No Setter for id since it is set in the constructor above.
//
//    public String getValue() {
//        return value;
//    }
//
//    public void setValue(String value) {
//        this.value = value;
//    }

}
