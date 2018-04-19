package StudentManagement.Objects;

public class Physic_2 extends ObjectStudent implements HasPreObject {

    public Physic_2() {
        super("Physic 2", 4);
        setWeightOfMiddterm(0.3f);
        setWeightOfFinalTest(0.7f);
        hasPreObjects();
    }

    @Override
    public void listPreObjects() {

    }

    @Override
    public void hasPreObjects() {
        preObject.add("Physic 1");
        preObject.add("Math 1");
        preObject.add("Math 2");
    }

    @Override
    public ObjectStudent setResult() {
        result = weightOfMiddterm * markOfMiddterm + weightOfFinalTest * markOfFinalTest;
        return this;
    }
}
