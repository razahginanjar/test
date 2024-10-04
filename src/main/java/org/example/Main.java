package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void insertChar(List<Character> input)
    {
        for (int i = 0; i < input.size(); i++) {
            char a = input.get(i);
            for (int i1 = i+1; i1 < input.size(); i1++) {
                char a1 = input.get(i1);
                if(a1 == a)
                {
                    input.remove(i1);
                    input.add(i+1, a1);
                }
            }
        }

    }

    public static void rearrangeWord(String input)
    {
        char[] charArray1 = input.toLowerCase().toCharArray();
        List<Character> vowels = new ArrayList<>();
        List<Character> consonants = new ArrayList<>();
        for (char c : charArray1) {
            if ("aeiou".indexOf(c) >= 0) {
                vowels.add(c);
            } else if (Character.isLetter(c)) {
                consonants.add(c);
            }
        }
        insertChar(vowels);
        insertChar(consonants);

        System.out.println("Vowel Character: ");
        for (char vowel : vowels) {
            System.out.print(vowel);
        }
        System.out.println();
        System.out.println("consonant Character: ");
        for (char voc : consonants) {
            System.out.print(voc);
        }
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //question-no-1
        System.out.println("Enter integers separated by spaces:");
        String input = scanner.nextLine();
        rearrangeWord(input);
        String string2 = scanner.nextLine();
        rearrangeWord(string2);

        //question-no-2
        String string3 = scanner.nextLine();
        int families = 5;
        SecondQuestion.secondQues(families, string3);
    }
}