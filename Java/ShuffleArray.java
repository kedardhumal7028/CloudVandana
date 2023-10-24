import java.util.Arrays;
import java.util.Collections;

public class ShuffleArray 
{
    public static void main(String arr[]) 
    {
        Integer[] Arr1 = {1, 2, 3, 4, 5, 6, 7};
       
        Collections.shuffle(Arrays.asList(Arr1));

        System.out.println(Arrays.toString(Arr1));
    }
}
