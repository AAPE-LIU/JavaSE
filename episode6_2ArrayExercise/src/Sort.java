import java.util.Arrays;

public class Sort {
    public static void bubbleSort(int[] array){
        int loc = array.length-1;
        for (int i = 0; i < loc; i++) {
            boolean flag = false;
            for (int j = 0; j < loc-i; j++) {
                if (array[j] > array[j+1]){
                    int tmp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = tmp;
                    flag = true;
                }
            }
            if (!flag){
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {12,34,5,3,21,6,54,3,55,44,7};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
}
