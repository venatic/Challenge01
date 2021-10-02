import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DateTester {


    /**
     * This function takes a day (as a number), month (as a number), year (as a number)
     * and reports back to say if it would make a valid gregoryan calendar date or not.
     * @param dayOfMonth
     * @param Month
     * @param year
     * @return true if a valid Gregoryan calendar date, false otherwise.
     * 
     * algorithm approach: We'll assume that the date is valid if we can't find anything wrong...
     * if we find something wrong, we'll set the result to false
     * then we'll return the value of "result" after runing all of our checks.
     * So... what checks do we want to do?
     */
    public static boolean isValidDate(int dayOfMonth, int month, int year){
        boolean resultOfcheck = true;

        // check if the day is less than 1 or more than 31
        // if so, set result to false... 
        if(dayOfMonth < 1 || dayOfMonth > 31 ){
            resultOfcheck = false;
        }

        // check if the month is less than 1 or more than 12
        // if so, set result to false... 
        if(month < 1 || month > 12 ){
            resultOfcheck = false;
        }


        
        
        return resultOfcheck;
    }





    public static void main(String[] args) throws Exception {
        List<CustomDateClass> testDates = new ArrayList<CustomDateClass>();
        testDates.add(new CustomDateClass(0  , 1  , 1990, false )); // 0 January 1990?
        testDates.add(new CustomDateClass(1  , 1  , 1990, true  )); // 1 January 1990?
        testDates.add(new CustomDateClass(1  , 0  , 1990, false )); // ...
        testDates.add(new CustomDateClass(1  , 1  , 0   , false )); // ...
        testDates.add(new CustomDateClass(1  , 1  , 2000, true  )); // 1 January 2000?
        testDates.add(new CustomDateClass(31 , 1  , 1980, true  )); // ...
        testDates.add(new CustomDateClass(31 , 4  , 1980, false ));
        testDates.add(new CustomDateClass(31 , 11 , 1980, false ));
        testDates.add(new CustomDateClass(29 , 2  , 1996, true  ));
        testDates.add(new CustomDateClass(29 , 2  , 1904, true  ));
        testDates.add(new CustomDateClass(29 , 2  , 1900, false ));
        testDates.add(new CustomDateClass(5  , 9  , 1752, false ));
        testDates.add(new CustomDateClass(4  , 6  , 2000, true  ));
        testDates.add(new CustomDateClass(1  , 1  , 0   , false ));
        
        System.out.println(" ");
        System.out.println("==============================");
        System.out.println("==============================");
        System.out.println("Starting a new test run...    ");
        System.out.println(new Date().toString());

        System.out.println("==============================");
        System.out.println("==============================");
        System.out.println(" ");

        Iterator<CustomDateClass> iterator = testDates.iterator();
        int testcounter = 0;
        while( iterator.hasNext()){
            testcounter++;

            CustomDateClass testDate = iterator.next();
            System.out.println("==============================");
            System.out.println("Test " + testcounter + " - Test for date: " + 
                                testDate.getDay() + "/"+ testDate.getMonth() + "/" + testDate.getYear()
            );
            boolean testResult = isValidDate(testDate.getDay(),testDate.getMonth(),testDate.getYear());
            System.out.println("Expected result was: " + testDate.isValidDate());
            System.out.println("Your function gave:  " + testResult);
            if(testDate.isValidDate() == testResult){
                System.out.println("Test Passed!");
            }else{
                System.out.println("Test Failed!");
            }

        }
    }
}