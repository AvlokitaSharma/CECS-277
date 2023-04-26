/*  Programmer name: Avlokita Sharma
Description: Project #2 - student average score 
Finding average score of scores entered by dropping the highest and lowest
Date:09/13/2021
 * 
 * 
 */

package prOject_22;
import java.util.*;

public class lab_2 {

  public static int ValidateUserInput(String score) {
    if (Integer.parseInt(score)>100 ||Integer.parseInt(score)<0){
    System.out.println("Please enter valid number.");     //asks the user to input a valid number
    return 0;
    }
    return 1;
  }

  
  public static String[][] getStudentInfo(){
    
    System.out.print("Enter the number of students: "); //asks for number of students
	Scanner scanner = new Scanner(System.in);
    int student_Number = scanner.nextInt(); 
    scanner.nextLine();      
    
    String [][] student_info = new String[student_Number+1][6];
    
    student_info[0][0]="studentName";
    
    student_info[0][1]="ex1";
    
    student_info[0][2]="ex2";
    
    student_info[0][3]="ex3";
    
    student_info[0][4]="ex4";
    
    student_info[0][5]="ex5";
   
    for (int i = 1; i < student_info.length; i++) {							
      System.out.print("Please "+i +" student name: ");
      student_info[i][0] = scanner.nextLine();						//asks the user to enter students name and score
      
      for (int j = 1; j < student_info[i].length; j++) {
        System.out.print("Enter score "+j+" :");
        student_info[i][j] = scanner.nextLine();
      
          if (ValidateUserInput(student_info[i][j])==0){
            j--;
        }
      }
    } 
   
  return student_info; 
  }

   
  public static int findHighest(int[] numbers) {
    int maximum = numbers[0];   									//finds the highest to drop
   
    for (int i=1; i<numbers.length; i++) {
        if (numbers[i] > maximum) {
            maximum = numbers[i];   
        }
    }
    return maximum;
  }

  
  public static int findLowest(int[] numbers) {
    int minimum = numbers[0];   
   
    for (int i=1; i<numbers.length; i++) {							//finds the lowest to drop
        if (numbers[i] < minimum) {
            minimum = numbers[i];  
        }
    }
    return minimum;
  }

  
  public static float calcScore(int[] numbers) {
    int sum = 0;   
    
    for (int i=1; i<numbers.length; i++) {						//drops at this method
        if (numbers[i] != findLowest(numbers) || numbers[i] != findHighest(numbers)) {
            sum += numbers[i];  
        }
    }
    return sum/3;
  }

  
  public static void print(String[][] student_Array) {
    
	  for (int i = 0; i < student_Array.length; i++) {
      if (i==1){
        System.out.println("=======================================================");  //displays the student score in the from of array 
      }
      System.out.printf("%-20s ",student_Array[i][0]);
      
      for (int j = 1; j < student_Array[i].length; j++) {
        System.out.printf("%5s ",student_Array[i][j]);
      }
      System.out.println();
    }
  }

   
  public static void main(String[] args) {
    int sc[];   															// displays the average score
    sc = new int[5]; 
    String [][] student_array ;
    student_array = getStudentInfo();
    
    for (int i = 0; i < 5; i++) {
      sc[i] = Integer.parseInt(student_array[1][i+1]);  
    }  
    System.out.printf("Average Score of Student1: %-20s \n",calcScore(sc));
    print(student_array);
  }
}


