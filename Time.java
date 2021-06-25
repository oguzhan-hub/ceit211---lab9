package com.company;



public class Time {
    private int hours;          // Conventional hours
    private int minutes;        // Conventional minutes
    private boolean afternoon;  // Flag for afternoon
    boolean isValid = true;
    String[] list1;
    String error ;


    public Time(String militaryTime ) {

        try{
            list1 = militaryTime.split(":");
        }catch (Exception e){
            error = "Please use ':' between hours and minute";
            isValid = false;
        }

        try{
            this.hours = Integer.parseInt(list1[0]);
            this.minutes = Integer.parseInt(list1[1]);
        }catch (Exception e){
            error = "Please use only numbers in militaryTime!";
            isValid = false;
        }

        if(0 <= hours && hours< 24){
            if(0 <= minutes && minutes <60){
                if(hours == 12){
                    afternoon = true;
                }else if(hours > 12){
                    hours = hours %12;
                    afternoon =true;
                }else if(hours == 24){
                    afternoon = false;
                    hours = 00;
                }else{
                    afternoon = false;
                }
            }else if(minutes>59){
                isValid=false;
                error = "invalid minute";
            }else{
                error = "minute is out of range!";
                isValid = false;
            }
        }else {
            error = "hour is out of range";
            isValid=false;
        }

    }

    public String toString() {
        String am_pm;
        String zero = "";
        if (afternoon)
            am_pm = "PM";
        else
            am_pm = "AM";
        if (minutes < 10)
            zero = "0";
        if(isValid){
            return hours + ":" + zero + minutes + " " + am_pm;
        }else{
            return error;
        }
    }
}