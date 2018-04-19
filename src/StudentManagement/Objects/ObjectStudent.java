package StudentManagement.Objects;

import StudentManagement.Student.Student;

import java.util.ArrayList;

public abstract class ObjectStudent {

    public String Name;
    public int weightOfObject;
    public float markOfMiddterm;
    public float weightOfMiddterm;
    public float markOfFinalTest;
    public float weightOfFinalTest;
    public float result;

    public ArrayList<String> preObject = new ArrayList<String>();

    public ObjectStudent(String Name, int weightOfObject) {
        setName(Name);
        setWeightOfObject(weightOfObject);
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getWeightOfObject() {
        return weightOfObject;
    }

    public ObjectStudent setWeightOfObject(int weigtOfObject) {
        this.weightOfObject = weigtOfObject;
        return this;
    }

    public float getMarkOfMiddterm() {
        return markOfMiddterm;
    }

    public ObjectStudent setMarkOfMiddterm(float markOfMiddterm) {
        this.markOfMiddterm = markOfMiddterm;
        return this;
    }

    public float getWeightOfMiddterm() {
        return weightOfMiddterm;
    }

    public ObjectStudent setWeightOfMiddterm(float weightOfMiddterm) {
        this.weightOfMiddterm = weightOfMiddterm;
        return this;
    }

    public float getMarkOfFinalTest() {
        return markOfFinalTest;
    }

    public ObjectStudent setMarkOfFinalTest(float markOfFinalTest) {
        this.markOfFinalTest = markOfFinalTest;
        return this;
    }

    public float getWeightOfFinalTest() {
        return weightOfFinalTest;
    }

    public ObjectStudent setWeightOfFinalTest(float weightOfFinalTest) {
        this.weightOfFinalTest = weightOfFinalTest;
        return this;
    }

    public ObjectStudent setMark(float markOfMiddterm, float markOfFinalTest) {
        setMarkOfMiddterm(markOfMiddterm);
        setMarkOfFinalTest(markOfFinalTest);
        setResult();

        return this;
    }

    public float getResult() {
        return result;
    }

    public abstract ObjectStudent setResult();

    public boolean isPreObject(ObjectStudent obj) {
        return obj.preObject.contains(Name);
    }

}
