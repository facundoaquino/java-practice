package exercises;


import java.util.Arrays;

/*Several people are standing in a row and need to be divided into two teams. The first person goes into team 1, the second goes into team 2, the third goes into team 1 again, the fourth into team 2, and so on.

You are given an array of positive integers - the weights of the people. Return an array of two integers, where the first element is the total weight of team 1, and the second element is the total weight of team 2 after the division is complete.*/
public class alternatingSums {
    public static void main(String[] args) {

        int[] intArr = {50, 60, 60, 45, 70};
        System.out.println(Arrays.toString(solution(intArr)));

    }

    public static int[] solution(int[] a) {
        int[] result = new int[2];
        for (int i = 0; i < a.length  ; i++) {
            if(i%2==0){
                result[0] = result[0] + a[i];
            }else {
                result[1] = result[1] + a[i];
            }
        }
        return result;
    }
}
