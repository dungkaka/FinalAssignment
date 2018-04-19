package StudentManagement.Objects;

public class Electronic extends ObjectStudent {

    public Electronic() {
        super("Electronic", 4);
        setWeightOfMiddterm(0.3f);
        setWeightOfFinalTest(0.7f);
    }

    @Override
    public ObjectStudent setResult() {
        result = weightOfMiddterm * markOfMiddterm + weightOfFinalTest * markOfFinalTest;
        return this;
    }
}
