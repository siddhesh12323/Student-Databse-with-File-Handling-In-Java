/**********************
 * THINGS TO CONSIDER
 * 1. PLEASE ENTER ANY STRING INPUT LESS THAN 5 CHARACTERS FOR PROPER DISPLAYING (HOWEVER YOU CAN 
 * 	  ENTER MORE THAN 5 CHARACTERS AS INPUTS)
 * 2. PLEASE CHECK THE 'saveDatabase' METHOD FOR FILE NAME, ALSO THE FILE WILL BE STORED TO YOUR
 *    PROJECT EXPLOPER IN YOUR IDE
 **********************/

import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
public class Main {
	public static void main(String args[]) {
		
		//Just some lines for calling methods from the Student class
		Scanner scanner = new Scanner(System.in);
		int choice2;
		do {
			System.out.println("1. createDatabase");
			System.out.println("2. displayDatabase");
			System.out.println("3. deleteRecord");
			System.out.println("4. updateRecord");
			System.out.println("5. saveDatabase");
			System.out.println("6. displayFile");
			System.out.println("7. Exit");
			System.out.println("Enter your choice: ");
			choice2 = scanner.nextInt();
			switch(choice2) {
			case 1:
				System.out.println();
				Student.createDatabase();
				break;
			case 2:
				System.out.println();
				Student.displayDatabase();
				break;
			case 3:
				System.out.println();
				Student.deleteRecord();
				break;
			case 4:
				System.out.println();
				Student.updateRecord();
				break;
			case 5:
				System.out.println();
				Student.saveDatabase();
				break;
			case 6:
				System.out.println();
				Student.displayDatabase();
				break;
			} 
		} while(choice2 < 7 && choice2 > 0);
		scanner.close();
	}
}