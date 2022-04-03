package com.bridgelabz.moodanalyser;

/**
 * purpose :Given a Message, ability to analyse and respond Happy or Sad Mood
 *@author : Archana
 * since : 03-04-2022
 */

public class MoodAnalyser {
    public static String analyseMood(String message) {
        if (message.toLowerCase().contains("sad")) {
            return "Sad";
        } else if (message.toLowerCase().contains("happy")) {
            return "Happy";
        }
        return null;
    }

    public static void main(String[] args) {
        String mood = MoodAnalyser.analyseMood("User is Happy");
        System.out.println(mood);
        mood = MoodAnalyser.analyseMood("User is Sad");
        System.out.println(mood);
    }
}