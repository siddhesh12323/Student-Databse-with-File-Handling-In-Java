import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Student {
	private String studentID;
	private String name;
	private int rollNo;
	private String class1;
	private double marks;
	private String address;
	private static int numberOfEntries;
	private static int MAXENTRIES = 20;
	
	static Scanner scanner = new Scanner(System.in);
	
	//ArrayList of objects to store student data
	static ArrayList<Student> studentList = new ArrayList<>(MAXENTRIES);
	
	static void createDatabase() {
		System.out.print("Number of entries?: ");
		numberOfEntries = scanner.nextInt();
		System.out.println();
		for(int i = 0; i < numberOfEntries; i++) {
			
			//Create a temporary student object to take inputs
			Student student = new Student();
			
			//Taking inputs into temporary student object
			System.out.print("Enter studentID of Student #" + (i+1) + ": ");
			student.studentID = scanner.next();
			System.out.print("Enter name of Student #" + (i+1) + ": ");
			student.name = scanner.next();
			System.out.print("Enter rollNo of Student #" + (i+1) + ": ");
			student.rollNo = scanner.nextInt();
			System.out.print("Enter class of Student #" + (i+1) + ": ");
			student.class1 = scanner.next();
			System.out.print("Enter marks of Student #" + (i+1) + ": ");
			student.marks = scanner.nextDouble();
			System.out.print("Enter address of Student #" + (i+1) + ": ");
			student.address = scanner.next();
			System.out.println();
			
			//Add temporary object to ArrayList of objects
			studentList.add(student);
		}
	}
	
	static void displayDatabase() {
		System.out.println("Name\tID\tRoll\tClass\tMarks\tAddress\t");
		for(int i = 0; i < studentList.size(); i++) {
			System.out.print(studentList.get(i).name + "\t" + studentList.get(i).studentID + 
					"\t" + studentList.get(i).rollNo + "\t" + studentList.get(i).class1 + 
					"\t" + studentList.get(i).marks + "\t" + studentList.get(i).address);
			System.out.println();
		}
		System.out.println();
	}
	
	//Deleting a student object by accessing the index through input name
	static void deleteRecord() {
		
		//Temporary String for accessing index and finding the student object
		String studentNameTemp;
		System.out.println("Please enter name of student whose records need to be deleted: ");
		studentNameTemp = scanner.next();
		
		for(int i = 0; i < studentList.size(); i++) {
			
			//Checking if given input name has a corresponding object in arrayList
			if(studentList.get(i).name.equals(studentNameTemp)) {
				
				System.out.println("Student found at index " + i);
				
				/*This is where arrayList makes our work easy for us because suppose if 
				 * we used array of objects instead of arrayList, then we would have 
				 * to manually handle index and size changes for other functions*/
				studentList.remove(i);
				
				System.out.println("Student record at index " + i + " deleted.");
			} else {
				System.out.println("Student not found at index " + i);
			}
		}
		System.out.println();
	}
	
	//Update the object of student which is accessed by the name, similar to deleteRecord method
	static void updateRecord() {
		
		//Temporary string input to access the object
		String studentNameTemp2;
		System.out.println("Enter Student Name to update record: ");
		studentNameTemp2 = scanner.next();
		
		for(int i = 0; i < studentList.size(); i++) {
			
			//Checking if the entered student name has a corresponding object in arrayList
			if(studentList.get(i).name.equals(studentNameTemp2)) {
				
				System.out.println("Student found at index " + i);
				//We can update respective properties of the student object
				System.out.println("What do you want to update: ");
				int choice;
				do {
					System.out.println("1. Name");
					System.out.println("2. Student ID");
					System.out.println("3. Roll No");
					System.out.println("4. Class");
					System.out.println("5. Marks");
					System.out.println("6. Address");
					System.out.println("7. Done Updating");
					System.out.print("Enter your choice: ");
					choice = scanner.nextInt();
					switch(choice) {
					
					/*In each case we create a respective temporary variable and then 
					assign it to the object in the arrayList*/
					case 1:
						String newName;
						System.out.print("Enter new name: ");
						newName = scanner.next();
						studentList.get(i).name = newName;
						break;
					case 2:
						String newStudentID;
						System.out.print("Enter new Student ID: ");
						newStudentID = scanner.next();
						studentList.get(i).studentID = newStudentID;
						break;
					case 3:
						int newRollNo;
						System.out.print("Enter new Roll No: ");
						newRollNo = scanner.nextInt();
						studentList.get(i).rollNo = newRollNo;
						break;
					case 4:
						String newClass;
						System.out.print("Enter new Class: ");
						newClass = scanner.next();
						studentList.get(i).class1 = newClass;
						break;
					case 5:
						double newMarks;
						System.out.print("Enter new Marks: ");
						newMarks = scanner.nextDouble();
						studentList.get(i).marks = newMarks;
						break;
					case 6:
						String newAddress;
						System.out.print("Enter new Address: ");
						newAddress = scanner.next();
						studentList.get(i).address = newAddress;
						break;
					}
				} while(choice < 7 && choice > 0);
			} else {
				System.out.println("Student not found at index " + i);
			}
		}
		System.out.println();
	}

	/*Creating a single file for storing for working seamlessly between both saveDatabase 
	  and displayFile method*/
	static File file = new File("data.txt");
	
	static void saveDatabase() {
		try {
			FileWriter writer = new FileWriter(file);
			
			/*I've written individual properties from an object to the file for now,
			but it is better to save either individual object or entire arrayList of objects 
			it will reduce number of accesses to read and write methods drastically hence making 
			program faster to execute*/
			for(int i = 0; i < studentList.size(); i++) {
				writer.write("Student #" + (i+1) + " Name: " + studentList.get(i).name + "\n");
				writer.write("Student #" + (i+1) + " StudentID: " + studentList.get(i).studentID + "\n");
				writer.write("Student #" + (i+1) + " Roll Number: " + String.valueOf(studentList.get(i).rollNo)+ "\n");
				writer.write("Student #" + (i+1) + " Class: " + studentList.get(i).class1 + "\n");
				writer.write("Student #" + (i+1) + " Marks: " + String.valueOf(studentList.get(i).marks) + "\n");
				writer.write("Student #" + (i+1) + " Address: " + studentList.get(i).address + "\n");
				writer.write("\n\n");
			}
			writer.close();
			System.out.println("Database saved successfully!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();
	}

	static void displayFile() {  
		try {
			FileReader reader = new FileReader(file);
			int i = reader.read();
			while(i!=-1) {
				System.out.println((char) i);
				i = reader.read();
			}
			reader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
