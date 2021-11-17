import java.util.Arrays;

/**
 * Creat by Liuzong
 * Description:
 * User:
 * Date: 2021-11-03
 * Time: 1:24
 */
public class homework {
    public static void oddSort(int []array) {
        /**
         * left下标去找奇数，right下标去找偶数，left遇到偶数就继续前进，right遇到奇数就继续前进
         */
        int left = 0;
        int right = array.length-1;
        while (left <= right) {
            while (array[left] % 2 == 0) {
                left++;
            }
            while (array[right] % 2 != 0) {
                right--;
            }
            if (left <= right) {//这里一定要判断，否则可能会出错，可能会导致left > right的时候还会运行下面的代码
                int tmp = array[left];
                array[left] = array[right];
                array[right] = tmp;
            }
        }
    }
    public static void main(String[] args) {
        /**
         * 将所有的奇数放在后半部分，将所有的偶数放在前部分
         */
        int []array = {1,5,2,8,45,4,4,52,54,53,5};
        System.out.println("奇偶排序之前" + Arrays.toString(array));
        oddSort(array);
        System.out.println("奇偶排序之后" + Arrays.toString(array));
    }
    public static void reverse(int []array) {
        /**
         * 逆置数组中的元素
         */
        int left = 0;
        int right = array.length-1;
        while(left < right) {
            int tmp = array[left];
            array[left] = array[right];
            array[right] = tmp;
            left++;
            right--;
        }
    }
    public static void main1(String[] args) {
        /**
         * 逆置数组中的元素
         */
        int []array = {2,5,4,852,1,5,54};
        System.out.println("交换之前" + Arrays.toString(array));
        reverse(array);
        System.out.println("交换之后" + Arrays.toString(array));

    }
}
