import java.util.Scanner;

public class Pangram 
{
    public static void main(String arr[]) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        if (isPangram(input)) 
        {
            System.out.println("The input is a pangram.");
        } 
        else 
        {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String input) 
    {
        boolean[] alphabet = new boolean[26];
        int index;

        for (int i = 0; i < input.length(); i++) 
        {
            char ch = input.charAt(i);

            if ('A' <= ch && ch <= 'Z') 
            {
                index = ch - 'A';
            } 
            else if ('a' <= ch && ch <= 'z') 
            {
                index = ch - 'a';
            } 
            else 
            {
                continue;
            }

            alphabet[index] = true;
        }

        for (boolean letter : alphabet) 
        {
            if (!letter) 
            {
                return false;
            }
        }

        return true;
    }
}
