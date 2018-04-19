package StudentManagement.Objects;

public class GraduationResearch extends ObjectStudent implements HasPreObject {

    public GraduationResearch() {
        super("Graduation Research", 15);
        setWeightOfMiddterm(0.0f);
        setWeightOfFinalTest(1.0f);
        hasPreObjects();
    }

    @Override
    public ObjectStudent setResult() {
        result = weightOfMiddterm * markOfMiddterm + weightOfFinalTest * markOfFinalTest;
        return this;
    }

    @Override
    public void listPreObjects() {
        for(String temp: preObject) {
            System.out.println(temp);
        }
    }

    @Override
    public void hasPreObjects() {
        preObject.add("Math 1");
        preObject.add("Math 2");
        preObject.add("Math 3");
        preObject.add("Physic 1");
        preObject.add("Physic 2");
    }
}
