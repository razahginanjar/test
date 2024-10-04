package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SecondQuestion {
    public static void neededBus(int numberOfFamilies, List<Integer> memberOfFamily)
    {
        Integer maxInBus = 4;
        Integer maxFamInBus = 2;
        Integer numberOfBus = 0;
        if(memberOfFamily.size() != numberOfFamilies)
        {
            System.out.println("Input must be equal with count of family");
            return;
        }

        for (int i = 0; i < memberOfFamily.size(); i+=maxFamInBus) {
            Integer numberPeople = memberOfFamily.get(i);
            if(i+1 < memberOfFamily.size())
            {
                numberPeople += memberOfFamily.get(i+1);
            }
            Integer a = numberPeople/maxInBus;
            if(numberPeople%maxInBus != 0 && a > 0)
            {
                numberOfBus++;
            }
            if(a <=0 )
            {
                numberOfBus++;
            }else {
                numberOfBus+=a;
            }
            System.out.println(numberOfBus);

        }

        System.out.println("Minimum bus required is: " + numberOfBus);

    }

    public static void secondQues(int numberOfFamilies, String sequences)
    {

        String[] stringArray = sequences.split(" ");

        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < stringArray.length; i++) {
            numbers.add(Integer.parseInt(stringArray[i]));
        }

        neededBus(numberOfFamilies, numbers);
    }
}
