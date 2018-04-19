package StudentManagement.Objects;

public class CBasic extends ObjectStudent implements HasPreObject{

    public CBasic() {
        super("C Basic", 4);
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
    }
}
