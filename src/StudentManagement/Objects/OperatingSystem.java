package StudentManagement.Objects;

public class OperatingSystem extends ObjectStudent {

    public OperatingSystem() {
        super("Operating System", 3);
        setWeightOfMiddterm(0.3f);
        setWeightOfFinalTest(0.7f);
    }

    @Override
    public ObjectStudent setResult() {
        result = weightOfMiddterm * markOfMiddterm + weightOfFinalTest * markOfFinalTest;
        return this;
    }
}
