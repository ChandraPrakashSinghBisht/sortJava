//import Arrays, List, Collections
import java.util.*;

// A class to represent a student. 
class Student 
{ 
    int score; 
    String name; 
  
    // Constructor
    public Student(int score, String name) 
    { 
        this.score = score; 
        this.name = name; 
    } 
  
    //getter and setter methods
    public String getName() { 
        return name; 
    } 
  
    public void setName(String name) { 
        this.name = name; 
    } 
  
    public Integer getscore() { 
        return score; 
    } 
  
    public void setscore(Integer score) { 
        this.score = score; 
    } 
    // Used to print student details in main() 
    public String toString() 
    { 
        return this.name+ " "+this.score;
    } 
} 

class Sortbyname implements Comparator<Student> 
{ 
    // Used for sorting in ascending order of roll number 
    public int compare(Student a, Student b) 
    { 
        return a.name.compareTo(b.name); 
    } 
} 

class SortbyScore implements Comparator<Student> 
{ 
    // Used for sorting in descending order of score 
    public int compare(Student a, Student b) 
    { 
        return a.score - b.score; 
    } 
} 

public class sort{

    public static void main(String args[])
    {
        final Scanner scr=new Scanner(System.in);  //for taking input from the user
        char ch='y';   //Loop variable

        do
        {
            
            //Menu for the program
            System.out.println("***MENU FOR SORTING***");
            System.out.println("1. Sort list of integers in ascending order");
            System.out.println("2. Sort list of integers in descending order");
            System.out.println("3. Sort list of doubles in ascending order");
            System.out.println("4. Sort list of doubles in descending order");
            System.out.println("5. Sort student objects in ascending order");
            System.out.println("6. Sort student objects in descending order");
            System.out.print("Enter Your Choice: ");
            //Read input from user and parse it to type int and store as choice
            int choice=scr.nextInt();

            System.out.println("");  //For proper formatting

            switch(choice)
            {
                case 1:  //Sort list of integers in ascending order
                int n1;
                System.out.print("Enter no. of elements you want in integer array:");
                n1 = scr.nextInt();
        
                int a1[] = new int[n1];
                System.out.println("Enter all the elements:");
                for (int i = 0; i < n1; i++) 
                {
                    a1[i] = scr.nextInt();
                }
                
                Arrays.sort(a1);  //sort using built in function
         
                System.out.print("Ascending Order of integer array:");
                for (int i = 0; i < n1 ; i++){
                    System.out.print(a1[i] + ",");
                }          
                        break;
            
                case 2:  //Sort list of integers in descending order
                int n2, temp;
                System.out.print("Enter no. of elements you want in integer array:");
                n2 = scr.nextInt();
        
                int a2[] = new int[n2];
                System.out.println("Enter all the elements:");
                for (int i = 0; i < n2; i++) 
                {
                    a2[i] = scr.nextInt();
                }
                
                //Sort the array in descending order    
                for (int i = 0; i < n2; i++) {     
                    for (int j = i+1; j < n2; j++) {     
                        if(a2[i] < a2[j]) {    
                            temp = a2[i]; 
                            a2[i] = a2[j];    
                            a2[j] = temp;    
                        }     
                    }     
                } 
         
                System.out.print("Descending Order of integer array:");
                for (int i = 0; i < n2 ; i++){
                    System.out.print(a2[i] + ",");
                }               
                        break;

                case 3:  //Sort list of doubles in ascending order
                int n3;
                System.out.print("Enter no. of elements you want in double array:");
                n3 = scr.nextInt();
        
                double a3[] = new double[n3];
                System.out.println("Enter all the elements:");
                for (int i = 0; i < n3; i++) 
                {
                    a3[i] = scr.nextDouble();
                }
                
                Arrays.sort(a3);  //sort using built in function
         
                System.out.print("Ascending Order of double array:");
                for (int i = 0; i < n3 ; i++){
                    System.out.print(a3[i] + ",");
                }
                        break;
                
                case 4:  //Sort list of doubles in descending order
                int n4;
                double temp1;
                System.out.print("Enter no. of elements you want in double array:");
                n4 = scr.nextInt();
        
                double a4[] = new double[n4];
                System.out.println("Enter all the elements:");
                for (int i = 0; i < n4; i++) 
                {
                    a4[i] = scr.nextDouble();
                }
                
                //Sort the array in descending order    
                for (int i = 0; i < n4; i++) {     
                    for (int j = i+1; j < n4; j++){
                        if(a4[i] < a4[j]) {    
                            temp1 = a4[i]; 
                            a4[i] = a4[j];
                            a4[j] = temp1;    
                        }     
                    }     
                } 
         
                System.out.print("Descending Order of integer array:");
                for (int i = 0; i < n4 ; i++){
                    System.out.print(a4[i] + ",");
                }
                    break;

                case 5:  //Sort student objects in ascending order of their names
                //creating object of type Student
                List<Student> ar= new ArrayList<>() ;
                System.out.println("Enter the number of students: ");
                int n5= scr.nextInt();

                for(int i=0; i<n5; i++){
                    /*consuming the leftover new line using the nextLine() method to avoid errors*/
                    scr.nextLine();
                    System.out.println("Enter name of new student: ");
                    String name= scr.nextLine();
                    System.out.println("Enter score of this student: ");
                    int score= scr.nextInt();

                    //allocating memory and initializing
                    Student obj= new Student(score, name);
                    ar.add(obj);  //adding object to List
                }

                //Built-in function to sort
                Collections.sort(ar, new Sortbyname());
                System.out.println("\nSorted by name in ascending order"); 
                for (int i=0; i<ar.size(); i++) 
                System.out.println(ar.get(i)); 
                    break;

                case 6:  //Sort student objects in descending order of their scores
                 //creating object of type Student
                 List<Student> ls= new ArrayList<>() ;
                 System.out.println("Enter the number of students: ");
                 int n6= scr.nextInt();
 
                 for(int i=0; i<n6; i++){
                     /*consuming the leftover new line using the nextLine() method to avoid errors*/
                     scr.nextLine();
                     System.out.println("Enter name of new student: ");
                     String name= scr.nextLine();
                     System.out.println("Enter score of this student: ");
                     int score= scr.nextInt();
 
                     //allocating and initializing
                     Student obj= new Student(score, name);
                     ls.add(obj);  //add object to List
                 }
 
                 //Built-in function to sort
                 Collections.sort(ls, new SortbyScore());
                 //Built-in function to reverse
                 Collections.reverse(ls);
                 //printing the values in descending
                 System.out.println("\nSorted by score in descending order"); 
                 for (int i=0; i<ls.size(); i++) 
                 System.out.println(ls.get(i)); 
                    break;

                default:
                        System.out.println("Wrong choice!!! Try again...");
            }

            System.out.println("");  //For proper formatting
            System.out.print("Want to enter more? (y/n): ");
            ch=scr.next().charAt(0);  //Read next char from user

            System.out.println("");  //For proper formatting
        }while(ch=='y' || ch=='Y');

        System.out.println("Exiting the Program...");
        scr.close();  //closing scanner object
    }   //main() ends here
}   //class sort ends here