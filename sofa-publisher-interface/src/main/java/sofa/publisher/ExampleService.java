package sofa.publisher;

import sofa.publisher.pojo.AnotherDummyObject;
import sofa.publisher.pojo.DummyObject;

public interface ExampleService {

    String dummyMethod(String param);

    AnotherDummyObject anotherDummyMethod(DummyObject dummyObject);

    AnotherDummyObject notYetImplemented(DummyObject dummyObject);
}
