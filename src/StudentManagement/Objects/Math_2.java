package StudentManagement.Objects;

public class Math_2 extends ObjectStudent {

    public Math_2() {
        super("Math 2", 3);
        setWeightOfMiddterm(0.3f);
        setWeightOfFinalTest(0.7f);
    }

    @Override
    public ObjectStudent setResult() {
        result = weightOfMiddterm * markOfMiddterm + weightOfFinalTest * markOfFinalTest;
        return this;
    }



}
