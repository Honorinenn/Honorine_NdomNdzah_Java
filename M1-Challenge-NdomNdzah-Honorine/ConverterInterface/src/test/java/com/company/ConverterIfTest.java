package com.company;

        import org.junit.Before;
        import org.junit.Test;

        import static org.junit.Assert.*;

public class ConverterIfTest {
    private  ConverterIf month;

    @Before
    public void setUp() throws Exception {
        month = new ConverterIf();
    }

    @Test
    public void convertNumberToMonth() {
        month.convertMonth(12);
        String actualValue = "December";
        String expectedValue = "December";

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void convertNumberToDay() {
        month.convertDay(7);
        String actualValue = "Saturday";
        String expectedValue = "Saturday";

        assertEquals(expectedValue, actualValue);
    }
}
