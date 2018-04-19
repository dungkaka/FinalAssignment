package StudentManagement.Objects;

public class CIntroduction extends ObjectStudent {

    public CIntroduction() {
        super("C Introduction", 4);
        setWeightOfMiddterm(0.4f);
        setWeightOfFinalTest(0.6f);
    }

    @Override
    public ObjectStudent setResult() {
        result = weightOfMiddterm * markOfMiddterm + weightOfFinalTest * markOfFinalTest;
        return this;
    }
}
