package com.bridgelabz.moodanalyser;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// Test case to analyze sad mood of the user
public class MoodAnalyserTest {

    @Test
    public void givenMessage_WhenProper_ShouldReturnSad() {
        MoodAnalyser moodanalyser=new MoodAnalyser();
        String actualResult=moodanalyser.analyseMood("User is Sad");
        Assertions.assertEquals("Sad",actualResult);
    }

    // Test case to analyze happy mood of the user
    @Test
    public void givenMessage_ContainsAny_init_ShouldReturnHappy() {
        MoodAnalyser moodanalyser = new MoodAnalyser();
        String actualResult = moodanalyser.analyseMood("I am in Any Mood");
        Assertions.assertEquals("Happy", actualResult);
    }
}


