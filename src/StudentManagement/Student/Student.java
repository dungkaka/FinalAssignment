package StudentManagement.Student;
import StudentManagement.Management.Management;
import StudentManagement.Objects.*;

import java.util.ArrayList;
import java.util.Calendar;

public abstract class Student {
    private String ID;
    private String name;
    public String birthDay;
    public float CPA;
    public String typeOfStudent;

    ArrayList<ObjectStudent> objects = new ArrayList<ObjectStudent>();

    public Student(String ID, String name, String birthday, String typeOfStudent) {
            setID(ID);
            this.name = name;
            this.birthDay = birthday;
            this.typeOfStudent = typeOfStudent;
    }

    private Student setID(String ID) {
        boolean exist = false;
        for (Student temp: Management.students) {
            if(temp.getID() == ID) exist = true;
        }

        if(exist == false) this.ID = ID;
        return this;

    }
    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }
    public Student setName(String name) {
        name = name;
        return this;
    }

    public int getAge() {
        int age = 0;
        int dateBirth = Integer.parseInt(birthDay.substring(0,2));
        int monthBirth = Integer.parseInt(birthDay.substring(3,5));
        int yearBirth = Integer.parseInt(birthDay.substring(6,10));

        Calendar c = Calendar.getInstance();
        int date = c.get(Calendar.DATE);
        int month = c.get(Calendar.MONTH);
        int year = c.get(Calendar.YEAR);

        if (month > monthBirth ) age = year - yearBirth;
        else if (month == monthBirth) {
            if (date >= dateBirth) age = year - yearBirth;
            else age = year - yearBirth - 1;
        }
        else age = year - yearBirth - 1;

        return age;
    }

    public String getBirthDay() {
        return birthDay;
    }
    public Student setBirthDay(String birthDay) {
        this.birthDay = birthDay;
        return this;
    }

    public float getCPA() {
        return CPA;
    }
    public Student setCPA() {
        float sum = 0;
        int size = 0;
        for (ObjectStudent temp: objects) {
            sum += temp.getResult() * temp.getWeightOfObject();
            size += temp.getWeightOfObject();
        }

        this.CPA = sum / size;
        return this;
    }

    public String getTypeOfStudent() {
        return typeOfStudent;
    }

    public int getNumPassObject() {
        int size = 0;
        for (ObjectStudent temp: objects) {
            if (temp.getResult() >= 5) size++;
        }

        return size;
    }

    public int getNumPassCredit() {
        int size = 0;
        for (ObjectStudent temp: objects) {
            if (temp.getResult() >= 5) size += temp.getWeightOfObject();
        }

        return size;
    }

    public CreditStudent toCreditStudent() {
        if (this instanceof CreditStudent) {
            CreditStudent cs = (CreditStudent) this;
            return cs;
        }
        else {
            System.out.println(this.getName() + " is not Credit Student !!!");
            return null;
        }
    }

    public YearlyStudent toYearlyStudent() {
        if (this instanceof YearlyStudent) {
            YearlyStudent cs = (YearlyStudent) this;
            return cs;
        }
        else {
            System.out.println(this.getName() + " is not Yearly Student !!!");
            return null;
        }
    }

    public ObjectStudent findObject(String name) {
        for (ObjectStudent temp: objects) {
            if (temp.getName() == name) {
                return temp;
            }
        }
        return null;
    }

    public void showInforStudent() {
        System.out.println("\n----------------------------------------------------------------------------------------------");
        System.out.printf("| %-10s| %-20s| %-12s| %-20s| %-5s| %-5s| %-6s |\n", "ID", "NAME", "BIRTHDAY", "TYPE OF STUDENT", "AGE", "NCP", "CPA");
        System.out.println("|-----------|---------------------|-------------|---------------------|------|------|--------|");
        System.out.printf("| %-10s| %-20s| %-12s| %-20s| %-5s| %-5s| %-6.1f |\n", this.getID(), this.getName(), this.getBirthDay(), this.getTypeOfStudent(), this.getAge(), this.getNumPassCredit(), this.getCPA());
        System.out.println("----------------------------------------------------------------------------------------------");
    }

    public void showObjectOfStudent() {

        System.out.println("\n------------------------------------------------------------------------");
        System.out.printf("| %-68s |\n", "              Student: " + getName().toUpperCase() + " - " + getID());
        System.out.println("|--------------------------|------|-----------|-----------|------------|");
        System.out.printf("| %-25s| %-5s| %-10s| %-10s| %-10s |\n", "NAME", "WOF", "POINTMID", "POINTFINAL", "RESULT");
        System.out.println("|--------------------------|------|-----------|-----------|------------|");
        for (ObjectStudent temp: objects) {
            System.out.printf("| %-25s| %-5s| %-10.1f| %-10.1f| %-10.1f |\n", temp.getName(), temp.getWeightOfObject(), temp.getMarkOfMiddterm(), temp.getMarkOfFinalTest(), temp.getResult());
        }
        System.out.println("------------------------------------------------------------------------");
    }

    public abstract String getDegreeClassification();

    public void graduation() {
        if(getDegreeClassification() != null) {
            Calendar c = Calendar.getInstance();
            System.out.println("------------------------------------------");
            System.out.println("|        THE DEGREE OF UNIVERSITY        |");
            System.out.printf("| %-12s %-25s |\n", "Name: ", getName());
            System.out.printf("| %-12s %-25s |\n", "Birthday: ", getBirthDay());
            System.out.printf("| %-25s %-12s |\n", "Degree Classification: ", getDegreeClassification());
            System.out.printf("| %-25s %-12s |\n", "Year Of Graduation: ", c.get(Calendar.YEAR));
            System.out.println("------------------------------------------");
        }
        else {
            System.out.println("Student " + getName().toUpperCase() + " is not eligible for graduation new !");
        }
    }


}
