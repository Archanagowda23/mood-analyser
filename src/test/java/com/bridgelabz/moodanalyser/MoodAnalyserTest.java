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
}

