package sofa.publisher.pojo;

public class AnotherDummyObject {
    private String attr1;
    private String attr2;

    public String getAttr1() {
        return attr1;
    }

    public void setAttr1(String attr1) {
        this.attr1 = attr1;
    }

    public String getAttr2() {
        return attr2;
    }

    public void setAttr2(String attr2) {
        this.attr2 = attr2;
    }

    @Override
    public String toString() {
        return "AnotherDummyObject{" +
            "attr1='" + attr1 + '\'' +
            ", attr2='" + attr2 + '\'' +
            '}';
    }
}