package com.bridgelabz.moodanalyser;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// Test case to analyze sad mood of the user
public class MoodAnalyserTest {

    @Test
    public void givenMessage_WhenProper_ShouldReturnSad() {
        MoodAnalyser moodanalyser = new MoodAnalyser("I am in Sad Mood");
        String actualResult = moodanalyser.analyseMood();
        Assertions.assertEquals("Sad", actualResult);
    }

    @Test
    public void givenMessage_WhenProper_ShouldReturnHappy() {
        MoodAnalyser moodanalyser = new MoodAnalyser("I am in happy Mood");
        String actualResult = moodanalyser.analyseMood();
        Assertions.assertEquals("Happy", actualResult);
    }

    @Test
    public void givenMessage_Null_ShouldReturnExceptionHandled() {
        MoodAnalyser moodanalyser = new MoodAnalyser(null);
        String actualResult = moodanalyser.analyseMood();
        Assertions.assertEquals("Exception Handled", actualResult);
    }
}



