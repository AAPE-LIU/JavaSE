import java.util.Arrays;

public class Array_end {
    public static void main(String[] args) {
        // Java中二维数组的行不可以省略，列可以省略
        int[][] array2 = new int[2][];
        array2[0] = new int[4];
        array2[1] = new int[8];
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main2(String[] args) {

        /*定义二维数组的三种方法*/

        int[][] array= {{1,2,3,4,5,6},{7,8,9,10,11,12}};
        int[][] array1 = new int[2][6];
        int[][] array2 = new int[][]{{1,2,3,4,5,6},{7,8,9,10,11,12}};

        // 打印二维数组的三种方法

        for (int[] arr:array) {
            for (int x:arr) {
                System.out.print(x + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(Arrays.toString(array));//[[I@1b6d3586, [I@4554617c]
        System.out.println(Arrays.deepToString(array));//[[1, 2, 3, 4, 5, 6], [7, 8, 9, 10, 11, 12]]

    }
    /**
     * 奇数放右边，偶数放左边
     * @param array
     */
    public static void odd_Even(int[] array){
        int left = 0;
        int right = array.length-1;
        while(left < right){
            while(array[left]/2 == 0){
                left ++;
            }
            while(array[right]/2 != 0){
                right--;
            }
            int tmp = array[left];
            array[left] = array[right];
            array[right] = tmp;
        }
    }
    public static void main1(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        odd_Even(array);
        System.out.println(Arrays.toString(array));
    }
}
