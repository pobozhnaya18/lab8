package application;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.*;

public class CalculatorTest {

    private List<Integer> collection = new ArrayList<>();
    private Calculator calculator = new Calculator();

    @org.junit.Before
    public void setUp() throws Exception {
        collection.add(1);
        collection.add(-5);
        collection.add(0);
        collection.add(5);
        collection.add(-11);
    }

    @org.junit.Test
    public void calculateSumOfPositiveNumbers() {
        assertEquals(6,calculator.calculateSumOfPositiveNumbers(collection));
    }
}