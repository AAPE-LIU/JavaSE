import java.util.Arrays;

public class ArraySearch {
    public static int binarySearch(int[] array,int key){
        int left = 0;
        int right = array.length-1;
        int mid = (left+right)/2;
        while(left <= right){
            if(array[mid] < key){
                left = mid + 1;
            }else if (array[mid] > key){
                right = mid - 1;
            }else {
                return mid;
            }
            mid = (left + right)/2;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array = new int[]{1,5,7,9,33,15,22,45};
        Arrays.sort(array);  // 自动给数组进行排序
        System.out.println(Arrays.toString(array));
        int loc = binarySearch(array,22);
        System.out.println(loc);
    }
}
