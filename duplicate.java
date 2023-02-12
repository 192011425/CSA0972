import java.util.Arrays;

public class duplicate
 {
  public static int[] duplicateZeros(int[] arr) {
    int[] result = new int[arr.length];
    int countZeros = 0;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == 0) {
        countZeros++;
      }
    }

    int index = arr.length + countZeros - 1;
    for (int i = arr.length - 1; i >= 0; i--) {
      if (index < arr.length) {
        result[index] = arr[i];
      }
      index--;
      if (arr[i] == 0 && index < arr.length) {
        result[index] = 0;
        index--;
      }
    }

    return result;
  }

  public static void main(String[] args) {
    int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
    int[] result = duplicateZeros(arr);
    System.out.println(Arrays.toString(result));
  }
}