import java.util.HashMap;
import java.util.Scanner;

public class RomanNumeralsConverter {
    static HashMap<Character, Integer> romanConversions = new HashMap<>() {{
        put('I', 1);
        put('V', 5);
    }};

    static int getNumber(String romanNumeral)
    {
        int number = 0;

        // Replaces IV and IX for their equivalent in our known roman numerals, so they can be added later
        romanNumeral = romanNumeral.replace("IV", "IIII").replace("IX", "VIIII");

        char[] chars = romanNumeral.toCharArray();

        for (char c : chars)
        {
            number += romanConversions.get(c);
        }

        return number;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter a Roman Numeral");

        String romanNumeral = in.nextLine();

        System.out.println(getNumber(romanNumeral));
    }
}