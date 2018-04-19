package StudentManagement.Student;
import StudentManagement.Objects.*;
import java.util.ArrayList;

public class YearlyStudent extends Student {

    public String YearStudent;

    public YearlyStudent(String ID, String name, String birthday) {
        super(ID, name, birthday, "Yearly Student");
    }

    ArrayList<String> Level1 = new ArrayList<String>();
    ArrayList<String> Level2 = new ArrayList<String>();
    ArrayList<String> Level3 = new ArrayList<String>();
    ArrayList<String> Level4 = new ArrayList<String>();
    ArrayList<String> Level5 = new ArrayList<String>();


    private void setLevel1Object() {
        Level1.add("Math 1");
        Level1.add("Math 2");
        Level1.add("C Introduction");

        objects.add(new Math_1());
        objects.add(new Math_2());
        objects.add(new CIntroduction());
    }

    private void setLevel2Object() {
        Level2.add("Math 3");
        Level2.add("Physic 1");
        Level2.add("C Basic");
        Level2.add("Electronic");

        objects.add(new Math_3());
        objects.add(new Physic_1());
        objects.add(new CBasic());
        objects.add(new Electronic());
    }

    private void setLevel3Object() {
        Level3.add("Physic 2");
        Level3.add("C Advance");
        Level3.add("OOP");

        objects.add(new Physic_2());
        objects.add(new CAdvance());
        objects.add(new OOP());
    }

    private void setLevel4Object() {
        Level4.add("Database");
        Level4.add("Operating System");
        Level4.add("Computer Architecture");

        objects.add(new Database());
        objects.add(new OperatingSystem());
        objects.add(new ComputerArchitecture());
    }

    private void setLevel5Object() {
        Level5.add("Graduation Research");

        objects.add(new GraduationResearch());
    }

    public boolean summaryLevel(ArrayList<String> Level) {
        float check = 0;
        for (String temp : Level) {
            ObjectStudent obj = this.findObject(temp);
            if (obj.getResult() >= 5) check++;
        }

        if (check > Level.size() * 0.6) return true;
        else return false;
    }

    public YearlyStudent setLevel1() {
        setLevel1Object();
        return this;
    }

    public YearlyStudent setLevel2() {
        if (summaryLevel(Level1)) setLevel2Object();
        else System.out.println("Student " + this.getName().toUpperCase() + " have not finish Term 1 !");

        return this;
    }

    public YearlyStudent setLevel3() {
        if (summaryLevel(Level2)) setLevel3Object();
        else System.out.println("Student " + this.getName().toUpperCase() + " have not finish Term 2 !");
        return this;
    }

    public YearlyStudent setLevel4() {
        if (summaryLevel(Level2)) setLevel4Object();
        else System.out.println("Student " + this.getName().toUpperCase() + " have not finish Term 3 !");
        return this;
    }

    public YearlyStudent setLevel5() {
        if (summaryLevel(Level4)) setLevel5Object();
        else System.out.println("Student " + this.getName().toUpperCase() + " have not finish Term 4 !");
        return this;
    }

    public CreditStudent registation(ObjectStudent obj) {
        System.out.println("Student " + getName() + " can not registed object by him(her)self !");
        return null;
    }


    @Override
    public String getDegreeClassification() {
        String degreeClassification = null;
        if (summaryLevel(Level5)) {
            if (this.getCPA() >= 8) degreeClassification = "Very Good !";
            else if (this.getCPA() >= 7) degreeClassification = "Good !";
            else if (this.getCPA() >= 6) degreeClassification = "Average Good !";
            else if (this.getCPA() >= 5) degreeClassification = "Average !";
        }

        return degreeClassification;
    }


}
