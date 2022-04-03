package com.bridgelabz.moodanalyser;

/**
 * purpose :Given a Message, ability to analyse and respond Happy or Sad Mood
 *@author : Archana
 * since : 03-04-2022
 */

public class MoodAnalyser {
    public static String message;

    // Constructor
    public MoodAnalyser(String message) {
        this.message = message;
        analyseMood();
    }

    //Getter
    public String getMessage() {
        return message;
    }

    //Setter
    public void setMessage(String message) {
        this.message = message;
    }

    public static String analyseMood() {
        try {
            if (message.toLowerCase().contains("sad")) {
                return "Sad";
            } else {
                return "Happy";
            }
        } catch (NullPointerException e) {
            return "Exception Handled";
        }
    }
}