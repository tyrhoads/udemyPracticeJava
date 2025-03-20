
import java.util.Arrays;

public class RemoveArray
{
    public static void main(String[] args) {
        int[] myarray = {1, 3,3,4,6,21,6,3,4,6,8,9,34,2343,1234,5,7,8,4,3,65,8,
                         4,234,4, 2, 4, 564, 1, 3, 5, 6, 7, 9, 4, 2,};
        System.out.println(Arrays.toString(uniqueArray(myarray)));
    }

    public static int[] uniqueArray(int[] array)
    {
        Arrays.sort(array);

        int[] temp = new int[array.length];
        int j = 0;

        for (int i = 0; i < array.length - 1; i++)
        {
            if (array[i] != array[i + 1])
            {
                temp[j] = array[i];
                j++;

            }
        }
        temp[j] = array[array.length - 1];
        j++;
        int[] lastArray = new int[j];
        System.arraycopy(temp, 0, lastArray, 0, j);
        return lastArray;
    }
}
