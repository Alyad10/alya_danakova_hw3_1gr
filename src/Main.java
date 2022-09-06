import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] mm = new double[]{1.24, 2.7, -4.3, 2.5, -0.7, -4.8, 0.5, -1.20, 0.04, -2.25, 0.010, -1.25, 3.05, 0.07, -5.2};
        int[] nums = {2,3,9,-1,23,-56,32,30,-4};

        System.out.println(Arrays.toString(mm));
        boolean isFind = false;
        int count = 0;
        double allNum = 0.0;

        for (int i = 0; i < mm.length; i++) {
            if (mm[i] < 0) {
                isFind = true;
                continue;
            }

            if (isFind && mm[i] >= 0) {
                allNum = allNum + mm[i];
                count = count + 1;
            }

        }

        System.out.println(allNum / count);

        System.out.println(Arrays.toString(nums));
        sortArray(nums);
    }

    public static void sortArray(int[] nums){
        for (int i = 0; i <nums.length ; i++) {
            int min = nums[i];
            int minId = i;
            for (int j = i + 1; j <nums.length ; j++) {
                if (nums[j] < min){
                    min = nums[j];
                    minId = j;
                }

            }
            int temp = nums[i];
            nums [i] = min;
            nums[minId] = temp;
            System.out.println(Arrays.toString(nums));
        }
    }

}


















            









