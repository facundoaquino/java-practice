package Arrays;

public class RotateArray {
    public static void main(String[] args) {

        int nums [] = {1,2,3,4,5};
        int moves =2;
        for (int i = 0; i < moves; i++) {
            int last = nums[nums.length-1];
            for (int j = nums.length -1; j > 0; j--) {
                nums[j]=nums[j-1];
                System.out.println(nums[j] + " " + nums[j-1]);
            }
            nums[0]=last;
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.println("nums[i] = " + nums[i]);
        }
    }
}
