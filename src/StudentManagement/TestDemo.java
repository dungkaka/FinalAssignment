package StudentManagement;

import StudentManagement.Management.Management;
import StudentManagement.Student.*;
import StudentManagement.Objects.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class TestDemo {
    public static Management management = new Management();
    public static void setStudent1() {

        management.addCreditStudent("20150661", "Ha Quy Dung", "10/06/1997");
        management.findID("20150661")
                .toCreditStudent()
                .register(new Math_1()).register(new Math_2()).register(new Math_3())
                .register(new Physic_1()).register(new Physic_2())
                .register(new CIntroduction()).register(new CBasic()).register(new CAdvance())
                .register(new Database()).register(new OOP()).register(new Electronic())
                .register(new OperatingSystem()).register(new ComputerArchitecture())
                .register(new GraduationResearch());


        management.findID("20150661").findObject("Math 1").setMark(10, 10);
        management.findID("20150661").findObject("Math 2").setMark(9, 10);
        management.findID("20150661").findObject("Math 3").setMark(8, 10);
        management.findID("20150661").findObject("Physic 1").setMark(9, 9);
        management.findID("20150661").findObject("Physic 2").setMark(8, 8);
        management.findID("20150661").findObject("C Introduction").setMark(7, 10);
        management.findID("20150661").findObject("C Basic").setMark(9, 10);
        management.findID("20150661").findObject("C Advance").setMark(10, 10);
        management.findID("20150661").findObject("Database").setMark(5, 6);
        management.findID("20150661").findObject("OOP").setMark(9, 10);
        management.findID("20150661").findObject("Electronic").setMark(8, 9);
        management.findID("20150661").findObject("Operating System").setMark(7, 6);
        management.findID("20150661").findObject("Graduation Research").setMark(9,10);

        management.findID("20150661").setCPA();
    }

    public static void setStudent2() {

        management.addCreditStudent("20150001", "Le Van Vuong", "14/01/1997");
        management.findID("20150001")
                .toCreditStudent()
                .register(new Math_1()).register(new Math_2()).register(new Math_3())
                .register(new Physic_1()).register(new Physic_2())
                .register(new CIntroduction()).register(new CBasic()).register(new CAdvance())
                .register(new Database()).register(new OOP()).register(new Electronic())
                .register(new OperatingSystem())
                .register(new GraduationResearch());


        management.findID("20150001").findObject("Math 1").setMark(10, 10);
        management.findID("20150001").findObject("Math 2").setMark(5, 9);
        management.findID("20150001").findObject("Math 3").setMark(6, 3);
        management.findID("20150001").findObject("Physic 1").setMark(5, 4);
        management.findID("20150001").findObject("Physic 2").setMark(0, 0);
        management.findID("20150001").findObject("C Introduction").setMark(1, 2);
        management.findID("20150001").findObject("C Basic").setMark(2, 9);
        management.findID("20150001").findObject("C Advance").setMark(6, 4);
        management.findID("20150001").findObject("Database").setMark(3, 3);
        management.findID("20150001").findObject("OOP").setMark(5, 4);
        management.findID("20150001").findObject("Electronic").setMark(3, 3);
        management.findID("20150001").findObject("Operating System").setMark(0, 0);
        management.findID("20150001").findObject("Graduation Research").setMark(0,1);

        management.findID("20150001").setCPA();
    }

    public static void setStudent3() {
        management.addYearlyStudent("20150002", "Ngo Anh Tuan", "01/01/1997");
        YearlyStudent st3 = management.findID("20150002").toYearlyStudent();
        st3.setLevel1().findObject("Math 1").setMark(10, 8);
        st3.findObject("Math 2").setMark(9,9);
        st3.findObject("C Introduction").setMark(8,8);

        st3.setLevel2().findObject("Math 3").setMark(8,7);
        st3.findObject("Physic 1").setMark(7,6);
        st3.findObject("C Basic").setMark(8,9);
        st3.findObject("Electronic").setMark(8,8);

        st3.setLevel3().findObject("Physic 2").setMark(9,9);
        st3.findObject("C Advance").setMark(8,8);
        st3.findObject("OOP").setMark(9,9);

        st3.setLevel4().findObject("Database").setMark(10,7);
        st3.findObject("Operating System").setMark(9,9);
        st3.findObject("Computer Architecture").setMark(6,7);

        st3.setLevel5().findObject("Graduation Research").setMark(10,6);
        st3.setCPA();
    }

    public static void main(String[] args) throws InterruptedException {

        TestDemo.setStudent1();
        TestDemo.setStudent2();
        TestDemo.setStudent3();


        management.showListStudent();
        management.findID("20150661").showObjectOfStudent();
        management.findID("20150001").showObjectOfStudent();
        management.findID("20150002").showObjectOfStudent();

        management.findID("20150661").graduation();
        management.findID("20150001").graduation();
        management.findID("20150002").graduation();
    }
}

