package sofa.publisher.impl;

import sofa.publisher.ExampleService;
import sofa.publisher.pojo.AnotherDummyObject;
import sofa.publisher.pojo.DummyObject;

public class ExampleServiceImpl implements ExampleService {

    public String dummyMethod(String param) {
        return "I received " + param + " as an in put";
    }

    public AnotherDummyObject anotherDummyMethod(DummyObject dummyObject) {
        AnotherDummyObject result = new AnotherDummyObject();
        result.setAttr1(dummyObject.getParam1());
        result.setAttr2(dummyObject.getParam2());
        return result;
    }

    public AnotherDummyObject notYetImplemented(DummyObject dummyObject) {
        throw new UnsupportedOperationException("This method is not implemented yet.");
    }
}