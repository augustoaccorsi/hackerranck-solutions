package com.augustoaccorsi;

public class Main {

    public static void main(String[] args) {
        String time = "12:05:45AM";
	    System.out.println(timeConversion(time));
    }

    public static String timeConversion(String s) {
        String[] time = s.split(":");
        String hours = time[0], minutes = time[1];
        String seconds = time[2].substring(0,2);
        String meridian = time[2].substring(2);

        if(meridian.equals("PM")) {
            switch (hours) {
                case "01" -> hours = "13";
                case "02" -> hours = "14";
                case "03" -> hours = "15";
                case "04" -> hours = "16";
                case "05" -> hours = "17";
                case "06" -> hours = "18";
                case "07" -> hours = "19";
                case "08" -> hours = "20";
                case "09" -> hours = "21";
                case "10" -> hours = "22";
                case "11" -> hours = "23";
            }
        }
        else if (meridian.equals("AM") && (hours.equals("12")))
                    hours = "00";

        return hours+":"+minutes+":"+seconds;
    }
}
