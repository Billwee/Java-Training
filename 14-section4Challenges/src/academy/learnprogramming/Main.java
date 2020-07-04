package academy.learnprogramming;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
        getDurationString(3600);
    }

    public static void getDurationString(int minutes, int seconds){
        if(minutes < 0 || seconds < 0){
            System.out.println("Invalid Value");
        }else{
            int totalHours = minutes / 60;
            String totalHoursString = totalHours + "h";
            if(totalHours < 10){
                totalHoursString = "0" + totalHoursString;
            }
            int totalMinutes = (minutes % 60) + (seconds / 60);
            String totalMinutesString = totalMinutes + "m";
            if(totalMinutes < 10){
                totalMinutesString = "0" + totalMinutesString;
            }
            int secondsLeft = seconds % 60;
            String secondsLeftString = secondsLeft + "s";
            if(secondsLeft < 10){
                secondsLeftString = "0" + secondsLeftString;
            }
            System.out.println(totalHoursString + " " + totalMinutesString + " " + secondsLeftString);
        }

    }

    public static void getDurationString(int seconds){
        if(seconds < 0){
            System.out.println("Invalid Value");
        }else{
            int totalMinutes = seconds / 60;
            int secondsLeft = seconds % 60;
            getDurationString(totalMinutes, secondsLeft);
        }

    }


    
}


