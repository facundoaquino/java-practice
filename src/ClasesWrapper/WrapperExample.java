package ClasesWrapper;

public class WrapperExample {
    public static void main(String[] args) {
        int min = Integer.MIN_VALUE;
        System.out.println("min = " + min);
        
        int max = Integer.MAX_VALUE;
        System.out.println("max = " + max);


//        deprecated way to create a new integer
//        Integer intObject = new Integer(3255)


//        two ways to create an integer object  , both are the same
        Integer intObject = Integer.valueOf(2565);
        Integer intObject2 = 55;
        System.out.println("intObject.getClass().getSimpleName() = " + intObject.getClass().getSimpleName());

        System.out.println("intObject2 +5 = " + intObject2 +5);
        
        int num = intObject.intValue();
        System.out.println("num = " + num);
        
        
//        GETCLASS: each object has this method
        
        String txt = "testing getClass method in java Objects";

        System.out.println("txt.getClass().getName = " + txt.getClass().getSimpleName());

    }
}
