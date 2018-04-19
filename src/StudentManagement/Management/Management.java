package StudentManagement.Management;

import StudentManagement.Objects.*;
import StudentManagement.Student.*;

import java.util.ArrayList;

public class Management {

    public static ArrayList<Student> students = new ArrayList<Student>();

    public void addCreditStudent(String ID, String name, String birthday) {
        students.add(new CreditStudent(ID, name, birthday));
    }

    public void addYearlyStudent(String ID, String name, String birthday) {
        students.add(new YearlyStudent(ID, name, birthday));
    }

    public void showListStudent() {
        System.out.println("\n----------------------------------------------------------------------------------------------");
        System.out.printf("| %-10s| %-20s| %-12s| %-20s| %-5s| %-5s| %-6s |\n", "ID", "NAME", "BIRTHDAY", "TYPE OF STUDENT", "AGE", "NCP", "CPA");
        System.out.println("|-----------|---------------------|-------------|---------------------|------|------|--------|");
        for (Student temp : students) {
            System.out.printf("| %-10s| %-20s| %-12s| %-20s| %-5s| %-5s| %-6.1f |\n", temp.getID(), temp.getName(), temp.getBirthDay(), temp.getTypeOfStudent(), temp.getAge(), temp.getNumPassCredit(), temp.getCPA());
        }

        System.out.println("----------------------------------------------------------------------------------------------");
    }

    public Student findID(String id) {
        for (Student temp : students) {
            if (temp.getID() == id) {
                return temp;
            }
        }

        return null;
    }

    public void findInforStudent(String id) {
        int check = 0;
        for (Student temp : students) {
            if (temp.getID() == id) {
                check = 1;
                temp.showInforStudent();
            }
        }

        if (check == 0) System.out.println("No student have this ID");

    }


}
