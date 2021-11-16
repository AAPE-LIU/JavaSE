import java.util.Arrays;

/**
 * Creat by Liuzong
 * Description:
 * User: 刘总
 * Date: 2021-11-02
 * Time: 4:51
 */
public class sort {
    public static void bubbleSort (int []array) {
        /**
         * 冒泡排序
         */
        for (int i = 0; i < array.length-1; i++) {
            int flag = 0;
            for (int j = 0; j < array.length-i-1; j++) {
                int tmp = 0;
                if (array[j] > array[j+1]) {
                    tmp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = tmp;
                    flag = 1;
                }
            }
            if (flag == 0) {
                return ;
            }
        }
    }
    public static void main(String[] args) {
        int []array = {2,45,45,51,21,5,52,41,4};
        bubbleSort(array);
        System.out.println("排序之后" + Arrays.toString(array));
    }
}
