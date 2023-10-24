import java.util.HashMap;
import java.util.Scanner;

public class RomanToInteger 
{
    public static void main(String arr[]) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Roman number (e.g. IX): ");
        String romanNumber = scanner.nextLine();

        int result = romanToInt(romanNumber);
        System.out.println("Integer value: " + result);
    }

    public static int romanToInt(String s) 
    {
        HashMap<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int result = 0;

        for (int i = 0; i < s.length(); i++) 
        {
            int currentValue = romanValues.get(s.charAt(i));
            int nextValue = (i + 1 < s.length()) ? romanValues.get(s.charAt(i + 1)) : 0;

            if (currentValue < nextValue) 
            {
                result -= currentValue;
            } 
            else 
            {
                result += currentValue;
            }
        }

        return result;
    }
}
