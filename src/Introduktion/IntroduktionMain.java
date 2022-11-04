package Introduktion;

import java.util.Scanner;

public class IntroduktionMain {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Hej, vänligen skriv in valfri mening i räknaren");
        System.out.println("Skriv stop för att avsluta programmet");

        String text = scan.nextLine();

        MyUser startCount = new MyUser();
        MyUser checker = new MyUser();
        checker.getChecker();
       boolean myChecker = checker.getChecker();

        while (myChecker==true) {

            startCount.theCounter(text);
            System.out.println("Skriv in ny valfri mening");
            text = scan.nextLine();



            MyUser textCounter = new MyUser();
            textCounter.getRows();
            MyUser CountLetters = new MyUser();
            CountLetters.getCounter();
            MyUser countWords = new MyUser();
            countWords.getWords();
            MyUser longestWord = new MyUser();
            longestWord.getLongestWord();
            MyUser yourWord = new MyUser();
            yourWord.getYourWords();


        }

            System.out.println("Det här är totalt antal rader: " + startCount.getRows());
            System.out.println("totalt antal tecken: " + startCount.getCounter());
            System.out.println("totalt antal ord " + startCount.getWords());
            System.out.println("längsta ordet " + startCount.getLongestWord());
            System.out.println("och det här är alla dina ord: " + startCount.getYourWords());





    }
}