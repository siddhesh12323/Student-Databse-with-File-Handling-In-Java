/**********************
 * THINGS TO CONSIDER
 * 1. PLEASE ENTER ANY STRING INPUT LESS THAN 5 CHARACTERS FOR PROPER DISPLAYING (HOWEVER YOU CAN 
 * 	  ENTER MORE THAN 5 CHARACTERS AS INPUTS)
 * 2. PLEASE CHECK THE 'saveDatabase' METHOD FOR FILE NAME, ALSO THE FILE WILL BE STORED TO YOUR
 *    PROJECT EXPLOPER IN YOUR IDE
 * 3. FOR NOW PLEASE OPEN YOUR FILE MANUALLY TO SEE THE CONTENTS
 **********************/

import java.util.*;
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


/********************
OUTPUT:-
1. createDatabase
2. displayDatabase
3. deleteRecord
4. updateRecord
5. saveDatabase
6. displayFile
7. Exit
Enter your choice: 
1

Number of entries?: 3

Enter studentID of Student #1: t1
Enter name of Student #1: s1
Enter rollNo of Student #1: 1
Enter class of Student #1: it1
Enter marks of Student #1: 1
Enter address of Student #1: a1

Enter studentID of Student #2: t2
Enter name of Student #2: s2
Enter rollNo of Student #2: 2
Enter class of Student #2: it2
Enter marks of Student #2: 2
Enter address of Student #2: a2

Enter studentID of Student #3: t3
Enter name of Student #3: s3
Enter rollNo of Student #3: 3
Enter class of Student #3: it3
Enter marks of Student #3: 3
Enter address of Student #3: a3

1. createDatabase
2. displayDatabase
3. deleteRecord
4. updateRecord
5. saveDatabase
6. displayFile
7. Exit
Enter your choice: 
2

Name	ID	Roll	Class	Marks	Address	
s1	t1	1	it1	1.0	a1
s2	t2	2	it2	2.0	a2
s3	t3	3	it3	3.0	a3

1. createDatabase
2. displayDatabase
3. deleteRecord
4. updateRecord
5. saveDatabase
6. displayFile
7. Exit
Enter your choice: 
4

Enter Student Name to update record: 
s2
Student not found at index 0
Student found at index 1
What do you want to update: 
1. Name
2. Student ID
3. Roll No
4. Class
5. Marks
6. Address
7. Done Updating
Enter your choice: 1
Enter new name: s1
1. Name
2. Student ID
3. Roll No
4. Class
5. Marks
6. Address
7. Done Updating
Enter your choice: 2
Enter new Student ID: t1
1. Name
2. Student ID
3. Roll No
4. Class
5. Marks
6. Address
7. Done Updating
Enter your choice: 3
Enter new Roll No: 1
1. Name
2. Student ID
3. Roll No
4. Class
5. Marks
6. Address
7. Done Updating
Enter your choice: 4
Enter new Class: it1
1. Name
2. Student ID
3. Roll No
4. Class
5. Marks
6. Address
7. Done Updating
Enter your choice: 5
Enter new Marks: 1
1. Name
2. Student ID
3. Roll No
4. Class
5. Marks
6. Address
7. Done Updating
Enter your choice: 6
Enter new Address: a1
1. Name
2. Student ID
3. Roll No
4. Class
5. Marks
6. Address
7. Done Updating
Enter your choice: 7
Student not found at index 2

1. createDatabase
2. displayDatabase
3. deleteRecord
4. updateRecord
5. saveDatabase
6. displayFile
7. Exit
Enter your choice: 
2

Name	ID	Roll	Class	Marks	Address	
s1	t1	1	it1	1.0	a1
s1	t1	1	it1	1.0	a1
s3	t3	3	it3	3.0	a3

1. createDatabase
2. displayDatabase
3. deleteRecord
4. updateRecord
5. saveDatabase
6. displayFile
7. Exit
Enter your choice: 
3

Please enter name of student whose records need to be deleted: 
s1
Student found at index 0
Student record at index 0 deleted.
Student not found at index 1

1. createDatabase
2. displayDatabase
3. deleteRecord
4. updateRecord
5. saveDatabase
6. displayFile
7. Exit
Enter your choice: 
2

Name	ID	Roll	Class	Marks	Address	
s1	t1	1	it1	1.0	a1
s3	t3	3	it3	3.0	a3

1. createDatabase
2. displayDatabase
3. deleteRecord
4. updateRecord
5. saveDatabase
6. displayFile
7. Exit
Enter your choice: 
5

Database saved successfully!

1. createDatabase
2. displayDatabase
3. deleteRecord
4. updateRecord
5. saveDatabase
6. displayFile
7. Exit
Enter your choice: 
6

Name	ID	Roll	Class	Marks	Address	
s1	t1	1	it1	1.0	a1
s3	t3	3	it3	3.0	a3

1. createDatabase
2. displayDatabase
3. deleteRecord
4. updateRecord
5. saveDatabase
6. displayFile
7. Exit
Enter your choice: 
7

********************/

/*******************
FILE CONTENTS:-
Student #1 Name: s1
Student #1 StudentID: t1
Student #1 Roll Number: 1
Student #1 Class: it1
Student #1 Marks: 1.0
Student #1 Address: a1


Student #2 Name: s3
Student #2 StudentID: t3
Student #2 Roll Number: 3
Student #2 Class: it3
Student #2 Marks: 3.0
Student #2 Address: a3


*******************/