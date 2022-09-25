package org.launchcode.techjobs.oo;

import java.util.Objects;

public class PositionType extends JobField {    // only kept the one constructor, since all other code extends JobField.

//    private int id;
//    private static int nextId = 1;
//    private String value;
//
//    public PositionType() {
//        id = nextId;
//        nextId++;
//    }
//
//    public PositionType(String value) {
//        this();
//        this.value = value;
//    }


     public PositionType(String value) {   // Turned off all other code blocks in this Class, since extended in JobField
            super(value);
        }


//     TODO: Add a custom toString() method that returns the data stored in 'value'.
//
//    @Override
//    public String toString() {      //  returns a String type
//        return value;           // returns value of the value field
//    }
//
//    // TODO: Add custom equals and hashCode methods. Consider two PositionType objects "equal" when
//    //  their id fields match.
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;     //  Performs the reference check on the Object o
//
////        if (!(o instanceof PositionType)) return false;  // Null & Class Check Version 1: other Classes/textbk used
//        if (o == null || getClass() != o.getClass()) return false; // Null & Class Check Version 2: Intj auto-gen per dir.
//
//        PositionType that = (PositionType) o;   //  Casts o as a (PositionType) object
//
////        return getId() == that.getId();   // Version 1: compare if 2 obj equal based on id fields (other Classes used)
//        return id == that.id;    // Version 2: compare if 2 obj equal based on id fields (IntJ auto-generator per dirs)
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(getId());
//    }
//
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
