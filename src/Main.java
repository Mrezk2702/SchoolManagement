import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("HI");
        StudentDataHandler Data = new StudentDataHandler("D:\\01PersonalProjects\\CSV\\untitled\\StudentData.csv");
        List<Student> Studentdata = Data.getStudentList();
        Data.getHeader();
        for (Student student : Studentdata) {
            student.printStudentData();
        }
        System.out.println("END");
        System.out.println("Begin Sorting");
        Studentdata.sort(Comparator.comparing(Student::getTotalPercentage));
        System.out.println("Sorting finished");

        for (Student student : Studentdata) {
            student.printStudentData();
        }

    }


}