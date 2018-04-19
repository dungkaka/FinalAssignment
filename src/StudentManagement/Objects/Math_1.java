package StudentManagement.Objects;

public class Math_1 extends ObjectStudent{

    public Math_1() {
        super("Math 1", 3);
        setWeightOfMiddterm(0.3f);
        setWeightOfFinalTest(0.7f);
    }

    @Override
    public ObjectStudent setResult() {
        result = weightOfMiddterm * markOfMiddterm + weightOfFinalTest * markOfFinalTest;
        return this;
    }


}
