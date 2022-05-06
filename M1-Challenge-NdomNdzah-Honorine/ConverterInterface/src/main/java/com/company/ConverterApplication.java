package com.company;

public class ConverterApplication {

    public static void main(String[] args) {

        ConverterSwitch day = new ConverterSwitch();
        ConverterIf  dayWeek = new ConverterIf();
        int myDayNumber = 1;
        String myDayName = day.convertDay(myDayNumber);

        System.out.println("I get a bonus of" + " " + myDayNumber + " " + "if I work on" + " " + myDayName + "." );


//        ConverterSwitch month = new ConverterSwitch();
        int myMonthNumber = 1;
        String myMonthName = day.convertMonth(myMonthNumber);

        System.out.println("I get a bonus of" + " " + myMonthNumber + " " + "if I come on" + " " + myMonthName + "." );

        myMonthNumber = 4;
        myMonthName = day.convertMonth(myMonthNumber);
        System.out.println("I get a bonus of" + " " + myMonthNumber + " " + "if I sell on" + " " + myMonthName + "." );



         myDayNumber = 5 ;
         myDayName = dayWeek.convertDay(myDayNumber);
        System.out.println("I get a bonus of" + " " + myDayNumber + "if I come on" + " " + myDayName + "." );
    }


}




