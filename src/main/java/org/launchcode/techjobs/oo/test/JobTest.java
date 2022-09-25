package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    //  GA2 Tasks 4 & 5

    //  Task 4 (3 Tests): Use Unit Testing to Verify Parts of the Job Class


    // 4.1 - Tests the empty constructor to verify each Job object has a unique int ID
    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();
        assertNotEquals(job1.getId(), job2.getId());
    }

    // 4.2 - Tests the second full constructor that calls the first and sets all other fields.
    @Test
    public void testJobConstructorSetsAllFields() {

//  Create a new Job instance object to check if it contains all 6 required fields w/ provided values.
//  NOTE: Do not need <new Job(new String (name: "Product tester"),> in the Job(params) below b/c String class is assumed/default.
        Job job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

//  Use assertTrue statements to test that the constructor correctly assigns the Class of each field w/ boolean check.
//  NOTE: IntelliJ suggested doing a null check instead e.g. assertTrue(job3.getName() != null);
        assertTrue(job3.getName() instanceof String);
        assertTrue(job3.getEmployer() instanceof Employer);
        assertTrue(job3.getLocation() instanceof Location);
        assertTrue(job3.getPositionType() instanceof PositionType);
        assertTrue(job3.getCoreCompetency() instanceof CoreCompetency);

//  Use assertEquals statements to test that the constructor correctly assigns the value of each field w/ boolean check.
        assertEquals("Product tester", job3.getName()); // does NOT need <.getValue> added b/c name field already String type.
        assertEquals("ACME", job3.getEmployer().getValue()); // requires <.getValue> for each Class's valueField.toString().
        assertEquals("Desert", job3.getLocation().getValue()); // requires <.getValue>
        assertEquals("Quality control", job3.getPositionType().getValue()); // requires <.getValue>
        assertEquals("Persistence", job3.getCoreCompetency().getValue()); // requires <.getValue>

    }

//    4.3 - Test the equals() method.
    @Test
    public void testJobsForEquality() {
        Job job4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job5 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertFalse(job4.equals(job5));   // use overridden equals() Job class method to check IDs when fields are equal
//        assertNotEquals(job4, job5);   // this also works, suggested by IntelliJ, and similar to 4.1 test

    }


//    Task 5 (3 Tests that start failing until the appropriate custom toString() code written in the Job.java class file.)

//    5.1.a - When passed a Job object, it should return a string that contains a blank line before & after the job info.
//    NOTE: First write the test. When it fails, then go to Job.java and create a custom toString() to make it pass.
    @Test
    public void testToStringStartsAndEndsWithNewLine() {
//  created new Job obj instance with any data (used book example for all tests).
        Job job6 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

//  boolean check (true) for an empty line char \n at the first charAt() index 0 of the job6 obj instance, after invoking custom toString().
        assertEquals('\n', job6.toString().charAt(0));   // single quotes for '\n' b/c char type

//  boolean check (true) for an empty line char \n at the last charAt() index (by subtracting the length() - 1) 0 of the job6 obj instance, after invoking custom toString().
        assertEquals('\n', job6.toString().charAt(job6.toString().length() - 1));

    }


//    5.2.a - The string should contain a label for each field, followed by the data stored in that field. Each field should be on its own line.
//    NOTE: First write the test. When it fails, then go to Job.java and modify the custom toString() to make it pass.
    @Test
    public void testToStringContainsCorrectLabelsAndData() {
//      Create Job instance
        Job job7 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

//  boolean check (true) for the labels and data and line/character spacing is correct based on sample Job data.
//  NOTE: Had to do the '\n' separately with single quotes at both the beginning and the end of the Job info to match the char '' single quotes requirement for 5.1.a Test!
        assertEquals('\n' + "ID: " + job7.getId() + "\nName: Product tester\nEmployer: ACME\nLocation: Desert\nPosition Type: Quality control\nCore Competency: Persistence" + '\n', job7.toString());

    }


//  Task 5.3.a - Write a test to check toString() so if a field is empty, the method should add, Data not available after the label.
//  NOTE: First write the test. When it fails, then go to Job.java and modify the custom toString() to make it pass.
    @Test
    public void testToStringHandlesEmptyField() {
        Job job8 = new Job("", new Employer(""), new Location("St. Louis"), new PositionType(""), new CoreCompetency(""));
        assertEquals('\n' + "ID: " + job8.getId() + "\nName: Data not available\nEmployer: Data not available\nLocation: St. Louis\nPosition Type: Data not available\nCore Competency: Data not available" + '\n', job8.toString());
    }

//  Bonus Task 5.4.a - If a Job object ONLY contains data for the id field, return OOPS! This job does not seem to exist.
//  NOTE: Added this new test to check that the program will send a message if ID is the only field with a value.
    @Test
    public void testToStringHandlesAllEmptyFieldsExceptId() {
//       Created a Job instance with all fields empty except ID.
        Job job9 = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
//        Check that the message is returned accordingly.
        assertEquals("OOPS! This job does not exist!", job9.toString());
    }

}
