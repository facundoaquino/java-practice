package ValueReference;



public class ValueReference {
    public static void main(String[] args) {



        int i = 10;

        System.out.println("i = " + i);
        test(i);

        int ages [] ={10,15};
        //ages array go to refence to changeAge method
        changeAge(ages);
        for (int j = 0; j < ages.length; j++) {
            System.out.println("ages[j] = " + ages[j]);
        }
    }

    public static  void test(int i ){
        System.out.println("method test = " + i);
    }

    public static  void changeAge(int [] edadArr){
        for (int i = 0; i < edadArr.length; i++) {
            edadArr[i]=edadArr[i]+1;
        }
    }

}
