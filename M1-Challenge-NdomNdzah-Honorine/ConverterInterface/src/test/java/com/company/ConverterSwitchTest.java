package com.company;

        import org.junit.Before;
        import org.junit.Test;

        import static org.junit.Assert.*;

public class ConverterSwitchTest {
    private ConverterSwitch month;

    @Before
    public void setUp() throws Exception {
        month = new ConverterSwitch();
    }

    @Test
    public void convertCaseNumberToMonth() {
        month.convertMonth(12);
        String actualValue = "December";
        String expectedValue = "December";

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void convertCaseNumberToDay() {
        month.convertDay(7);
        String actualValue = "Saturday";
        String expectedValue = "Saturday";

        assertEquals(expectedValue, actualValue);

    }
}
