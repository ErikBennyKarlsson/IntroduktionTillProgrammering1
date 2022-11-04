package Introduktion;


import java.util.Arrays;
import java.util.Comparator;

public class MyUser {

    private int numbersOfLetters;
    private int Words;
    private int numberOfRows;

    private String yourWords;
    private String longestWord;
    private  boolean checker;

    public MyUser() {

        numbersOfLetters = 0;
        Words = 0;
        checker = true;
        longestWord = "";
        numberOfRows = 0;
        yourWords = "";
    }

    public int getRows() {


        return numberOfRows;
    }

    public int getCounter() {

        return numbersOfLetters;

    }


    public int getWords() {

        return Words;
    }

    public String getLongestWord() {

        return longestWord;
    }

    public String getYourWords() {

        return yourWords;
    }

    public boolean getChecker() {

            return checker;
    }


    public void theCounter(String input1) {


        numberOfRows = numberOfRows + 1;
        numbersOfLetters += input1.length();


        String[] wordCount = input1.split("\\s+");
        Words += wordCount.length;

        yourWords += input1 + " ";

        String longest = Arrays.stream(input1.split(" "))
                .max(Comparator.comparingInt(String::length))
                .orElse(null);

        if (longest.length() > longestWord.length())
            longestWord = longest;

        if (input1.equals("stop")) {
            checker = false;

        }

    }

}






