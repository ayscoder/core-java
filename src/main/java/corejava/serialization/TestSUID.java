package corejava.serialization;

import java.io.Serializable;

public class TestSUID implements Serializable {

//	private static final long serialVersionUID = 1L;
	private int someId;
//	private int someId1;

    public TestSUID (int someId) {
        this.someId = someId;
    }

    public int getSomeId() {
        return someId;
    }
}