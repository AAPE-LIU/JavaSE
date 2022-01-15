import java.util.Arrays;

public class JavaExercise {
    public static int[] arrayCopy(int[] array){
        int[] newarray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newarray[i] = array[i];
        }
        return newarray;
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        int[] newarray = arrayCopy(array);
        System.out.println(Arrays.toString(newarray));
    }
    /**
     * 数组转换为字符串
     * @param array
     * @return
     */
    public static String myArraysTostring(int[] array){
        String ret = Arrays.toString(array);
        return ret;
    }
    public static void main1(String[] args) {
        int[] array = {1,2,3,4,5,6};
        String result = myArraysTostring(array);
        System.out.println(result);
    }
}
