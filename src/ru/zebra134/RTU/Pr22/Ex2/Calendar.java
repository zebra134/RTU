package ru.zebra134.RTU.Pr22.Ex2;

public class Calendar {
    private String calendar;
    private String hour;
    private String min;

    public Calendar(String calendar) {
        this.calendar = calendar;
        calendar_time();
    }

    @Override
    public String toString() {
        return "Calendar{" +
                "hour='" + hour + '\'' +
                ", min='" + min + '\'' +
                '}';
    }

    public void calendar_time(){
        String[] str = calendar.split(">");
        char[] tmp = str[0].toCharArray();
        hour = str[0].substring(1);
        min = str[1].substring(1);
    }
}
