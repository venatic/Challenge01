import jdk.dynalink.DynamicLinker;

public class CustomDateClass {
    private int day;
    private int month;
    private int year;
    private boolean isAValidDate;

    public CustomDateClass(int day, int month, int year, boolean isAValidDate){
        this.day = day;
        this.month = month;
        this.year = year;
        this.isAValidDate = isAValidDate;
    }

    public int getDay(){
        return this.day;
    }

    public int getMonth(){
        return this.month;
    }

    public int getYear(){
        return this.year;
    }

    public boolean isValidDate(){
        return this.isAValidDate;
    }
}
