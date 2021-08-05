package com.mycompany.gft2ex3;
public class Info {
    private final int dayDate;
    private final int monthDate;
    private final int yearDate;

    public Info(int dayDate, int monthDate, int yearDate) {
        this.dayDate = dayDate;
        this.monthDate = monthDate;
        this.yearDate = yearDate;
    }

    public int getDayDate() {
        return dayDate;
    }

    public int getMonthDate() {
        return monthDate;
    }

    public int getYearDate() {
        return yearDate;
    }  
    
}