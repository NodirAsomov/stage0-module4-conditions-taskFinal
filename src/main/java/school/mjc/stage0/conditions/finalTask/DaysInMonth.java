package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
       // boolean isLeapYear;
        //isLeapYear = (year % 4 == 0);
        if((month==2) && ((year%4==0) || ((year%100!=0)&&(year%400==0))))
            System.out.println("Number of days is 29");
            System.out.println("not leap");

         if (month==2)
            System.out.println("Number of days is 28");
            System.out.println("leap");

         if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12)
            System.out.println("Number of days is 31");

        else
            System.out.println("Number of days is 30");

    }

    public static void main(String[] args) {
        DaysInMonth daysInMonth =new DaysInMonth();
        daysInMonth.printDays(2011,12);
    }

}
