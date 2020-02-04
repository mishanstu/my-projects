/* CSCI 112 - Spring 2020
 * Project: List Of Occupations
 * Occupation multi-object sample
 * Author: Mikhail Basharin
 * Prof.: Chuck Herbert
 * last edited: 2/1/2020
 *
 * The object is a list of Occupation class objects.
 */

package assignment.listofoccupations;
import java.util.Scanner;

public class OccupationList { // class OccupationList

    //  an array holding the list of occupations
    Occupation[] myList = new Occupation[1000];
    int count = 0; // the number of elements that are used


    // method to load the array from a datafile
    public void loadArray() throws Exception {

        String soc;
        String title;
        int employment;
        int avgSalary;

        // creating a File class object linked to the name of the file to read
        java.io.File textFile = new java.io.File("occupations.txt");

        // creating a Scanner named infile to read the input stream from the file
        Scanner infile = new Scanner(textFile);

        int i = 0; // while loop counter

        // read data from the file into variables
        // read Strings directly; parse integers
        while (infile.hasNextLine()) {

            soc = infile.nextLine();
            title = infile.nextLine();
            employment = Integer.parseInt(infile.nextLine());
            avgSalary = Integer.parseInt(infile.nextLine());

            // loading an array element with the Occupation initializing constructor
            myList[i] = new Occupation(soc, title, employment, avgSalary);

            i++; // incrementing array element

        } // end while loop

        infile.close();
        this.count = i; // setting the count of used array elements

    } // end loadArray()


    // method print the toString() data for each SOC
    public void displayLines() {

        // running for loop to print each line
        for (int i = 0; i < count; i++) {
            System.out.println(myList[i].toString());

        } // end for loop

    } // end displayLines()


    // method to print an occupation by a SOC code
    public void findSoc() {

        System.out.println("Enter a SOC code: "); // asking a user to enter a SOC code

        // creating a Scanner named scan to read the input data from a user
        Scanner scan = new Scanner(System.in);

        String socCode = scan.nextLine(); // variable socCode
        boolean found = false;

        // running for loop to check each line
        for (int i = 0; i < count; i++) {

            // checking whether a user's input matches any downloaded SOC code
            if (myList[i].getSoc().matches(socCode)) {

                // print found message and set found to true
                System.out.println(myList[i].toString());
                found = true;
                break; // stop for loop

            } // end if

        } // end for loop

        // after the for loop – if not(found) print not found message
        if (!found) {

            System.out.println("The code was not found.");

        } // end if

    } // end findSoc

} // end class OccupationList