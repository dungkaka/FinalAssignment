package StudentManagement.Objects;

public class Physic_1 extends ObjectStudent {

    public Physic_1() {
        super("Physic 1", 4);
        setWeightOfMiddterm(0.2f);
        setWeightOfFinalTest(0.8f);
    }

    @Override
    public ObjectStudent setResult() {
        result = weightOfMiddterm * markOfMiddterm + weightOfFinalTest * markOfFinalTest;
        return this;
    }
}
