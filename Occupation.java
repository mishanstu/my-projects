/* CSCI 112 - Spring 2020
 * Project: List Of Occupations
 * Occupation multi-object sample
 * Author: Mikhail Basharin
 * Prof.: Chuck Herbert
 * last edited: 2/1/2020
 *
 * Each object is an occupation.
 */

package assignment.listofoccupations;

public class Occupation { // class Occupation

    // declare properties

    private String soc; // a standard occupational classification (SOC) code
    private String title; // a title
    private int employment; // a number of employments
    private int avgSalary; // an average year salary


    // constructor methods

    public Occupation() { // null constructor
    } // end Occupation()


    public Occupation(String soc, String title, int employment, int avgSalary) {

        this.soc = soc;
        this.title = title;
        this.employment = employment;
        this.avgSalary = avgSalary;

    } // end Occupation()


    // accessor methods

    public String getSoc() {
        return this.soc;
    }  // end getSoc()

    public String getTitle() {
        return this.title;
    } // end getTitle()

    public int getEmployment() {
        return this.employment;
    } // getEmployment()

    public int getAvgSalary() {
        return this.avgSalary;
    } // end getAvgSalary()

    // method to return information about the occupation as a String
    public String toString() {
        return ("SOC: " + this.soc + "; TITLE: " + this.title + "; EMPLOYMENT: " +
                this.employment + "; AVERAGE SALARY: " + this.avgSalary);
    } // end toString()

} // end class Occupation