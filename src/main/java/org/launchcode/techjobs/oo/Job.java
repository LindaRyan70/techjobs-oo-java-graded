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

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
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

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id. Generate a getter for the id field.

//  Generate getters and setters for each field EXCEPT nextID and id.
    public String getName() {
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
