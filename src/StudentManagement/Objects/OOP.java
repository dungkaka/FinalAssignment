package StudentManagement.Objects;

public class OOP extends ObjectStudent {

    public OOP() {
        super("OOP", 3);
        setWeightOfMiddterm(0.3f);
        setWeightOfFinalTest(0.7f);
    }

    @Override
    public ObjectStudent setResult() {
        result = weightOfMiddterm * markOfMiddterm + weightOfFinalTest * markOfFinalTest;
        return this;
    }
}
