package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    //Code a constructor to initialize the id field with a unique value. This constructor should take no parameters.
    public Job () {
        this.id = nextId;
        nextId ++;
    }

    /*  Code a second constructor that takes 5 parameters in correct order and assigns values to name, employer, location,
    positionType, and coreCompetency. Also, calls the first constructor in order to initialize the id field. */
    public Job (String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();         // calls the first empty constructor to init the 'id' field.
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

//    Task 5.1.b - Added custom toString() to return String containing a blank line before & after each field of the Job info.
//    NOTE: I commented this out and added to it for 5.2.b below it to pass the next test.
//    @Override
//    public String toString() {
//         String jobInfo = '\n' + name + employer + location + positionType + coreCompetency + '\n';
//         return jobInfo;
//    }

//    Task 5.2.b - Modified toString() to contain a label for each field, followed by the data stored in that field. Each field should be on its own line.
//    NOTE: I commented this out and added to it for 5.3.b below it to pass the next test.
//    NOTE: Had to do '\n' separately at both beg/end of Job info to match char '' single quotes req for 5.1 Test!
//    @Override
//    public String toString() {
//        String jobInfo = '\n' + "ID: " + id + "\nName: " + name + "\nEmployer: " + employer + "\nLocation: " + location + "\nPosition Type: " + positionType + "\nCore Competency: " + coreCompetency + '\n';
//         return jobInfo;
//    }
//    Task 5.3.b - Modified toString() so if a field is empty, the method adds, Data not available after the label.
//    NOTE: Had to do '\n' separately at both beg/end of Job info to match char '' single quotes req for 5.1 & 5.2 Tests!
//    @Override
//    public String toString() {
//
//        if (name.equals("")) {
//            setName("Data not available");
//        }
//        if (employer.getValue().equals("")) {
//            employer.setValue("Data not available");
//        }
//        if (location.getValue().equals("")) {
//            location.setValue("Data not available");
//        }
//        if (positionType.getValue().equals("")) {
//            positionType.setValue("Data not available");
//        }
//        if (coreCompetency.getValue().equals("")) {
//            coreCompetency.setValue("Data not available");
//        }
//        return '\n' + "ID: " + id + "\nName: " + name + "\nEmployer: " + employer + "\nLocation: " + location + "\nPosition Type: " + positionType + "\nCore Competency: " + coreCompetency + '\n';
//    }


//    Bonus Task 5.4.b - Modified toString() if Job obj ONLY contains data for id field, return OOPS! This job does not seem to exist.
//    NOTE: Had to do '\n' separately at both beg/end of Job info to match char '' single quotes req for 5.1 & 5.2 Tests!
    @Override
    public String toString() {
//  Added and if/else to add the Bonus check in the if() conditional, then bumped the other if() conditionals into the else{}
        if (name.equals("") && employer.getValue().equals("") && location.getValue().equals("") && positionType.getValue().equals("") && coreCompetency.getValue().equals("")) {
            return "OOPS! This job does not exist!";    // If ID is the only field with a value print this.
        } else {                                        // Else, check/modify remaining fields accordingly
            if (name.equals("")) {
                setName("Data not available");
            }
            if (employer.getValue().equals("")) {
                employer.setValue("Data not available");
            }
            if (location.getValue().equals("")) {
                location.setValue("Data not available");
            }
            if (positionType.getValue().equals("")) {
                positionType.setValue("Data not available");
            }
            if (coreCompetency.getValue().equals("")) {
                coreCompetency.setValue("Data not available");
            }
        }   // Return the values with formatting/line breaks.
        return '\n' + "ID: " + id + "\nName: " + name + "\nEmployer: " + employer + "\nLocation: " + location + "\nPosition Type: " + positionType + "\nCore Competency: " + coreCompetency + '\n';
    }


    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {  // customize to compare/check for IDs to be same/"equal" (used in Task 4/5 TDD)
        if (this == o) return true;     //  Performs the reference check on the Object o
        if (!(o instanceof Job)) return false;      // Null and Class check used by other CLasses
//        if (o == null || o.getClass() != getClass()) return false;    // Intellij auto-generated Null and Class checks
        Job job = (Job) o;                  // Cast o to be (Job) type called "that" for getters/setters to work
//        return id == job.id;             // Return Version 2: from intellij auto-generator per directions
        return getId() == job.getId();      // Return Version 1: what the other classes used
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());       // Version 1: Book and other classes used (getId())
//        return Objects.hash(id);          // Version 2: IntelliJ auto-generator used (id)

    }

//     TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
//      and id. Generate a getter for the id field.

//  Generate getters and setters for each field EXCEPT nextID and id.
    public String getName() {
        if (name == null || name.isEmpty()) {
            return "Data not available";
        }
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    // Generate a getter for the id field.
    public int getId() {        // No setter needed for 'id' since it is set in the constructor above.
        return id;
    }
}
