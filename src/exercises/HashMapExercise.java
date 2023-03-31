package exercises;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class HashMapExercise {
    public static void main(String[] args) {

        HashMap<String, Integer> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter students: ");
        // get students names and ID numbers

        do {

            System.out.println("Student: ");
            newStudent = input.nextLine();

            if(!newStudent.equals("")) {
                System.out.println("ID Number: ");
                Integer newIDNumber = input.nextInt();
                students.put(newStudent, newIDNumber);

                //Read in the newLine before looping back
                input.nextLine();

            }
        }   while(!newStudent.equals(""));
        input.close();

        //Print class roster
        System.out.println("\nClass Roster: ");

        for (Map.Entry<String, Integer> student : students.entrySet()) {
            System.out.println(student.getKey() + " ID#: " + student.getValue());

        }
        System.out.println("Number of students in roster: " + students.size());

    }
}
