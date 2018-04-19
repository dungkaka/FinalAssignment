package StudentManagement.Student;
import StudentManagement.Objects.*;

import java.util.ArrayList;

public class CreditStudent extends Student {

    public float CPA;

    public CreditStudent(String ID, String name, String birthday) {
        super(ID, name, birthday, "Credit Student");
    }

    public CreditStudent register(ObjectStudent obj) {
        int size = 0;
        int exist = 0;

        for (ObjectStudent temp: objects) {
            if (obj.getName() == temp.getName()) exist = 1;
            if (temp.isPreObject(obj) == true) size += 1;
        }

        if (exist == 1) {
            System.out.println(this.getName().toUpperCase() + " was registed " + obj.getName().toUpperCase() + " before!");
            return this;
        }

        if (size == obj.preObject.size()) {
            objects.add(obj);
            System.out.println(this.getName().toUpperCase() + " complete registed " + obj.getName().toUpperCase() + " !");
        }

        else {
            System.out.println("Student " + this.getName().toUpperCase() + " must finish " + obj.preObject.toString().toUpperCase() + " before registed [" + obj.getName().toUpperCase() + "] !!!");
        }

        return this;
    }


    public CreditStudent register(String name) {
        if(name == "Math 1") register(new Math_1());
        else if(name == "Math 2") register(new Math_2());
        else if(name == "Math 3") register(new Math_3());
        else if(name == "Physic 1") register(new Physic_1());
        else if(name == "Physic 2") register(new Physic_2());
        else if(name == "C Introduction") register(new CIntroduction());
        else if(name == "C Basic") register(new CBasic());
        else if(name == "C Advance") register(new CAdvance());
        else if(name == "Computer Architecture") register(new ComputerArchitecture());
        else if(name == "Database") register(new Database());
        else if(name == "Electronic") register(new Electronic());
        else if(name == "OOP") register(new OOP());
        else if(name == "Operating System") register(new OperatingSystem());
        else if(name == "Graduation Research") register(new GraduationResearch());

        return this;
    }

    @Override
    public String getDegreeClassification() {
        String degreeClassification = null;
        if (this.getNumPassCredit() > 40) {
            if (this.getCPA() >= 8) degreeClassification = "Very Good !";
            else if (this.getCPA() >= 7) degreeClassification = "Good !";
            else if (this.getCPA() >= 6) degreeClassification = "Average Good !";
            else if (this.getCPA() >= 5) degreeClassification = "Average !";
        }

        return degreeClassification;

    }

}
