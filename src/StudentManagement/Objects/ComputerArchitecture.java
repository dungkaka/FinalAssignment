package StudentManagement.Objects;

public class ComputerArchitecture extends ObjectStudent {

    public ComputerArchitecture() {
        super("Computer Architecture", 4);
        setWeightOfMiddterm(0.3f);
        setWeightOfFinalTest(0.7f);
    }

    @Override
    public ObjectStudent setResult() {
        result = weightOfMiddterm * markOfMiddterm + weightOfFinalTest * markOfFinalTest;
        return this;
    }
}
