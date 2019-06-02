package application;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ExtractorTest {

    private List<Integer> list = new ArrayList<>();
    private Extractor extractor = new Extractor();

    @Before
    public void setUp() throws Exception {
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
    }

    @Test
    public void getValueAtPosEndMinusOffset() {
        Assert.assertEquals(3,extractor.getValueAtPosEndMinusOffset(list,1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void badOffsetTest(){
        extractor.getValueAtPosEndMinusOffset(list,9999);
    }
}