package exercises;


/*Given an array of integers, find the pair of adjacent elements that has the largest product and return that product.

        Example

        For inputArray = [3, 6, -2, -5, 7, 3], the output should be
        solution(inputArray) = 21.

        7 and 3 produce the largest product.*/
public class adjacentElementsProduct {

    public static void main(String[] args) {

        int[]  inputArray  = {-23, 4, -3, 8, -12};

        System.out.println(solution(inputArray));


    }
   public static int solution(int[] inputArray) {

        int maxProduct = Integer.MIN_VALUE;
        for(int i = 0; i < inputArray.length ; i++) {
            int result = i+1 == inputArray.length ? maxProduct : inputArray[i] * inputArray[i + 1];
            maxProduct = Math.max(result, maxProduct);
        }
        return maxProduct;
    }
}
