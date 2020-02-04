/* CSCI 112 - Spring 2020
 * Project: List Of Occupations
 * Occupation multi-object sample
 * Author: Mikhail Basharin
 * Prof.: Chuck Herbert
 * last edited: 2/1/2020
 *
 * This program performs:
 *
 * 1) A method to load a text file of occupations
 * (Standard Occupational Classification (SOC) code,
 * a title, a number of employments, and an
 * average year salary of each occupation in the U.S.)
 * into the program.
 *
 * 2) A method to print a list of occupations line
 * by line on a screen.
 *
 * 3) A linear search of a String array with
 * the SOC code which a user enters.
 *
 * It also demonstrates modular development
 * and passing an array as a parameter.
 */

package assignment.listofoccupations;

public class ListOfOccupations { // class ListOfOccupations (main class)

    // the main method calls methods to perform each part of the program
    public static void main(String[] args) throws Exception {

        // instantiation of a myList object
        OccupationList myList = new OccupationList();

        // calling a method to load the list with data
        myList.loadArray();

        // call a method to print the list
        myList.displayLines();

        // call a method to allow the user to search the list by SOC
        myList.findSoc();

    } // end main()

} // end class ListOfOccupations