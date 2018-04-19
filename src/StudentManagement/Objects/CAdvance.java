package StudentManagement.Objects;

public class CAdvance extends ObjectStudent implements HasPreObject{

    public CAdvance() {
        super("C Advance", 6);
        setWeightOfMiddterm(0.4f);
        setWeightOfFinalTest(0.6f);
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
        preObject.add("C Introduction");
        preObject.add("C Basic");
    }
}
