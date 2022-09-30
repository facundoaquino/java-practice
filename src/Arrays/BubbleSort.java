package Arrays;

public class BubbleSort {
    public static void showArray (int arr []){
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr = " + arr[i]);
        }
    }

    public static void main(String[] args) {
        int numbers [] = {10,32,43,5,12,344,0,4324};

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if(numbers[i]<numbers[j]){
                    int aux = numbers[i];
                    numbers[i]= numbers[j];
                    numbers[j]=aux;
                }
            }
        }

        showArray(numbers);
    }
}
