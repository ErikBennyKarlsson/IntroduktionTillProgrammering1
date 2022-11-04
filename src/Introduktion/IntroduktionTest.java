package Introduktion;

import static org.junit.Assert.assertEquals;

public class IntroduktionTest {

    //Räknar programmet antal rader
    @org.junit.jupiter.api.Test
    public void countingRows() {
        MyUser myCounter = new MyUser();

        //Act
        myCounter.theCounter("hej hej");
        myCounter.theCounter("hej hej");
        int actual = myCounter.getRows();
        int expected = 2;

        //Assert
        assertEquals(expected, actual);

    }

    //räknar programmet antal tecken vid 1 input
    @org.junit.jupiter.api.Test
    public void countingCharacters() {
        MyUser myCounter = new MyUser();

        //Act

        myCounter.theCounter("hejhej");
        int actual = myCounter.getCounter();
        int expected = 6;

        //Assert
        assertEquals(expected, actual);

    }

    //räknar programmet antal tecken vid 2 input
    @org.junit.jupiter.api.Test
    public void countingCharacters2() {
        MyUser myCounter = new MyUser();

        //Act

        myCounter.theCounter("hej");
        myCounter.theCounter("hej");
        int actual = myCounter.getCounter();
        int expected = 6;

        //Assert
        assertEquals(expected, actual);

    }


    //Räknar programmet antal ord
    @org.junit.jupiter.api.Test
    public void countingWords() {
        MyUser myCounter = new MyUser();

        //Act
        myCounter.theCounter("hej hej");
        myCounter.theCounter("hej hej");
        int actual = myCounter.getWords();
        int expected = 4;

        //Assert
        assertEquals(expected, actual);

    }

    //hittar programmet längsta ordet i en mening.
    @org.junit.jupiter.api.Test
    public void longestWord() {
        MyUser myCounter = new MyUser();

        //Act
        myCounter.theCounter("hejhej hej");
        String actual = myCounter.getLongestWord();
        String expected = "hejhej";

        //Assert
        assertEquals(expected, actual);

    }

    //hittar programmet längsta ordet i flera meningar.
    @org.junit.jupiter.api.Test
    public void longestWord2() {
        MyUser myCounter = new MyUser();

        //Act
        myCounter.theCounter("hej hej hej");
        myCounter.theCounter("hejhejhej");
        myCounter.theCounter("hejhej hej");
        String actual = myCounter.getLongestWord();
        String expected = "hejhejhej";

        //Assert
        assertEquals(expected, actual);

    }

    //sparas all input.
    @org.junit.jupiter.api.Test
    public void allYourWords() {
        MyUser myCounter = new MyUser();

        //Act
        myCounter.theCounter("hej hej hej");

        String actual = myCounter.getYourWords();
        String expected = "hej hej hej ";

        //Assert
        assertEquals(expected, actual);

    }

    //sparas all input.
    @org.junit.jupiter.api.Test
    public void allYourWords2() {
        MyUser myCounter = new MyUser();

        //Act
        myCounter.theCounter("hej hej hej");
        myCounter.theCounter("hejhejhej");
        myCounter.theCounter("hejhej hej");
        String actual = myCounter.getYourWords();
        String expected = "hej hej hej hejhejhej hejhej hej ";

        //Assert
        assertEquals(expected, actual);

    }

    //check if boolean is false
    @org.junit.jupiter.api.Test
    public void myUserbooleanisfalse() {
        MyUser myCounter = new MyUser();

        //Act
        myCounter.theCounter("stop");
        boolean actual = myCounter.getChecker();
        boolean expected = false;

        //Assert
        assertEquals(expected, actual);
    }

}