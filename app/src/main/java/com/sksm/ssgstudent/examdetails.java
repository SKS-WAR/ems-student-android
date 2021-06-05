package com.sksm.ssgstudent;

public class examdetails {
    String date;
    String name;
    String noofquestions;
    String timer;

    public examdetails() {

    }

    public examdetails(String date, String name, String noofquestions, String timer) {
        this.date = date;
        this.name = name;
        this.noofquestions = noofquestions;
        this.timer = timer;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNoofquestions() {
        return noofquestions;
    }

    public void setNoofquestions(String noofquestions) {
        this.noofquestions = noofquestions;
    }

    public String getTimer() {
        return timer;
    }

    public void setTimer(String timer) {
        this.timer = timer;
    }
}
