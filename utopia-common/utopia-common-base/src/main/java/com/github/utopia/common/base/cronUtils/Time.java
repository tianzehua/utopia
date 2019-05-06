package com.github.utopia.common.base.cronUtils;

/**
 * @description:
 * @author: zgk
 * @date: 2018-10-17 18:32
 */
public class Time {

    private String year = "";  //年

    private String week = "?";  //周

    private String month = "*"; //月

    private String day = "*";   //日

    private String hour = "*"; //时

    private String minute = "0"; //分

    private String second = "0"; //秒


    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getMinute() {
        return minute;
    }

    public void setMinute(String minute) {
        this.minute = minute;
    }

    public String getSecond() {
        return second;
    }

    public void setSecond(String second) {
        this.second = second;
    }

    public Time(String year, String week, String month, String day, String hour, String minute, String second) {
        this.year = year;
        this.week = week;
        this.month = month;
        this.day = day;
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Time() {
    }

    /**
     * @description: 重写toString方法
     * @author: zgk
     * @date: 2018-10-17 22:25
     * @company: ©2018版权所有 中科浩鼎科技股份有限公司
     */
    @Override
    public String toString() {
        return getSecond()+" "+getMinute()+" "+getHour()+" "+getDay()+" "+getMonth()+" "+getWeek()+" "+getYear();
    }
}
