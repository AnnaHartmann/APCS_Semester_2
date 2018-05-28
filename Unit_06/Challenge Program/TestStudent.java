/**
 * This code formats the student code that is added there
 * this is formated so that way the formated print statements
 * are mostly at the bottom except printBook since that specifies 
 * what is being printed. 
 * 
 * @author Annabel Hartmann
 * @version 3/9/18
 */

import java.util.List;
import java.util.ArrayList;

public class TestStudent {

    public static void printBook(List<Student> list) { 
    	//formats the beginning of the roster 

        System.out.printf("%17s %5s %7s %7s %7s %7s\n", "Student Name |", "Q1", "Q2", "Q3", "Q4", "Q5");
        System.out.println("_________________________________________________________________");
        
        for(int i = 0; i < list.size(); i++) {
            System.out.printf("%15s", list.get(i).getName());
            
            for(int index = 1; index < 6; index++) {
                System.out.printf("%8d", list.get(i).getQuiz(index));
            }
            System.out.println();
        }
    }

    public static void replaceName(List<Student> list,String previousName, String name) {  
    	//replaceName finds the name that is wanted to switch and switches it to the new name
        
    	for(int i = 0; i < list.size(); i++) {
            if(list.get(i).getName().equals(previousName)) {
                list.get(i).setName(name);
            }
        }
    }

    public static void replaceQuiz(List<Student> list, String studentName, int quizNumber, int quizPercent) { 
    	//replaceQuiz takes the quiz number and quiz percentage and changes it with a new quiz input
       
    	for(int i = 0; i < list.size(); i++) {
            if(list.get(i).getName().equals(studentName)) {
                list.get(i).setQuiz(quizNumber, quizPercent);
            }
        }
    }

    public static void replaceStudent(List<Student> list, String studentName, String newName, int q1, int q2, int q3, int q4, int q5) { 
    	//replace Student goes through the array list and replaces it and sets the new name and quiz
        
    	for(int i = 0; i < list.size(); i++) {
            if(list.get(i).getName().equals(studentName)) {
                list.get(i).setName(newName);
                list.get(i).setQuiz(1, q1);
                list.get(i).setQuiz(2, q2);
                list.get(i).setQuiz(3, q3);
                list.get(i).setQuiz(4, q4);
                list.get(i).setQuiz(5, q5);
            }
        }
    }

    public static void insertStudent(List<Student> list,String Student, String studentName, int q1, int q2, int q3, int q4, int q5) {
        //insert student adds a student before the one that we specify by finding the location of the student and inserting the student as necessary
    	int location = 0;

        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).getName().equals(Student))
                location = i;
        }
        list.add(location, new Student(studentName, q1, q2, q3, q4, q5));
    }

    public static void deleteStudent(List<Student> list, String deleteName) {
    	// deleteStudent goes through the list of students and deletes the one we specify. 
    	
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).getName().equals(deleteName)) {
                list.remove(i);
            }
        }
    }

    public static void main(String args[]) {
      	
        List<Student> studentQuizzes = new ArrayList<Student>(); // Initializes the array list

        studentQuizzes.add(new Student("Mark Kennedy", 70, 80, 90, 100, 90));
        studentQuizzes.add(new Student("Max Gerard", 80 , 85, 90, 85, 80));
        studentQuizzes.add(new Student("Jean Smith", 50, 79, 89, 99, 100));
        studentQuizzes.add(new Student("Betty Farm", 85, 80, 85, 88, 89));
        studentQuizzes.add(new Student("Dilbert Gamma", 70, 70 , 90, 70, 80));

        //start of the formatted print statements
        System.out.println("Starting Gradebook : \n");
        printBook(studentQuizzes);

        System.out.println("\nChanging Betty's name to Betty Boop : \n");
        replaceName(studentQuizzes, "Betty Farm", "Betty Boop");
        printBook(studentQuizzes);

        System.out.println("\nChanging Jean's quiz 1 score to 80 :\n");
        replaceQuiz(studentQuizzes, "Jean Smith", 1, 80);
        printBook(studentQuizzes);

        System.out.println("\nReplacing Dilbert with Mike Kappa: 80, 80, 80, 90, 90 : \n");
        replaceStudent(studentQuizzes, "Dilbert Gamma", "Mike Kappa", 80, 80, 80, 90, 90);
        printBook(studentQuizzes);

        System.out.println("\nAdd student Lily Mu: 85, 95, 70, 0, 100 before Betty: \n");
        insertStudent(studentQuizzes, "Betty Boop", "Lily Mu", 85, 95, 70, 0, 100);
        printBook(studentQuizzes);

        System.out.println("\nDelete student Max Gerard : \n");
        deleteStudent(studentQuizzes, "Max Gerard");
        printBook(studentQuizzes);
      //start of the formatted print statements
    }
}