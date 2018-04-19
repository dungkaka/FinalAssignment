package StudentManagement.Objects;

public class Math_3 extends ObjectStudent implements HasPreObject {

    public Math_3() {
        super("Math 3", 3);
        setWeightOfMiddterm(0.3f);
        setWeightOfFinalTest(0.7f);
        hasPreObjects();
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
    }

    @Override
    public ObjectStudent setResult() {
        result = weightOfMiddterm * markOfMiddterm + weightOfFinalTest * markOfFinalTest;
        return this;
    }
}
