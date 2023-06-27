import java.util.Scanner;
import java.util.HashMap;


public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();
        Map<Integer, Integer> freqDict = new HashMap<Integer, Integer>();

        int inputKey;
        int freqValue;
        int max = 0;
        int mode = -1;

        for (int i = 0; i < number; i++) {
            // check exist
            inputKey = in.nextInt();
            if (freqDict.containsKey(inputKey)) {
                freqValue = freqDict.get(inputKey);
                freqDict.put(inputKey, freqValue + 1);
                if (freqValue > max) {
                    max = freqValue;
                    mode = inputKey;
                }
            } else {
                // does not exist
                freqDict.put(inputKey, 1);
            }
        }

        if (max != 0)
            System.out.println(mode);
        else
            System.out.println("No mode ");
    }
}
