package com.bridgelabz.moodanalyser;

/**
 * purpose :Given a Message, ability to analyse and respond Happy or Sad Mood
 *@author : Archana
 * since : 03-04-2022
 */

public class MoodAnalyser {
    public static String message;

    public MoodAnalyser() {
    }

    // Constructor
    public MoodAnalyser(String message) throws MoodAnalysisException {
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

    public static String analyseMood() throws MoodAnalysisException {
        try {
            if (message.toLowerCase().contains("sad")) {
                return "Sad";
            } else {
                return "Happy";
            }
        } catch (NullPointerException e) {
            throw new MoodAnalysisException("Entered Invalid mood");
        }
    }
}