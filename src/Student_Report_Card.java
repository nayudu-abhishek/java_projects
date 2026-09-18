import com.sun.source.doctree.EscapeTree;
import org.w3c.dom.ls.LSOutput;

import java.lang.classfile.instruction.StackInstruction;
import java.util.Scanner;

//Project: Student Report Card Calculator
//Store a student's name and marks in 5 subjects,
// then calculate total, average, and grade.
public  class Student_Report_Card {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int maths = sc.nextInt(), science = sc.nextInt(), python = sc.nextInt();
        System.out.println("Enter Student name"+name);
        System.out.println("Enter ur maths marks:"+maths);
        System.out.println("Entere ur science marks"+science);
        System.out.println("Enter ur python marks:"+python);
        int total = (maths + science + python);
        double average = (maths + science + python) / 3;
        char grade = average >= 90 ? 'A' : average >= 70 ? 'B' : 'C';
        System.out.println("Name:"+name +"\ntotal:"+total+"\naverage"+average+"\nGrade"+grade);
    }
}