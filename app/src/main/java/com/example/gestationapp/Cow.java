package com.example.gestationapp;

import java.util.Calendar;
import java.util.Date;

public class Cow {

    private String refNum;
    private String bullName;
    private Date uAIDate;
    private Date dueDate;


    public Cow(String refNum, Date uAIDate) {
        this.refNum = refNum;
        this.uAIDate = uAIDate;
        this.bullName = "Bill";
        this.dueDate = getFutureDate(uAIDate.getYear(),uAIDate.getMonth(),uAIDate.getDate(),280);
    }

    public Cow(String refNum) {
        this.refNum = refNum;
        this.bullName = "Bill";
        uAIDate = null;
        dueDate = null;
    }

    public String getRefNum() {
        return refNum;
    }

    public void setRefNum(String refNum) {
        this.refNum = refNum;
    }

    public Date getuAIDate() {
        return uAIDate;
    }

    public void setuAIDate(Date uAIDate) {
        this.uAIDate = uAIDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public String getBullName() {
        return bullName;
    }

    public void setBullName(String bullName) {
        this.bullName = bullName;
    }

    public Date getFutureDate(int year, int month, int dayOfMonth, int days) {
        Date d = new Date(year-1900, month, dayOfMonth);
        Calendar c= Calendar.getInstance();
        c.setTime(d);

        c.add(Calendar.DATE, days);
        c.add(Calendar.MONTH,1);
        c.add(Calendar.YEAR, 1900);
        Date future = c.getTime();
        return future;
    }

}
