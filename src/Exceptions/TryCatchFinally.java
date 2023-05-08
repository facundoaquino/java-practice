package Exceptions;

public class TryCatchFinally {
    public static void main(String[] args) {
        try {
            System.out.println(10/0);
        }catch (ArithmeticException exp) {
            System.out.println(exp.getMessage() + " " + exp.getClass());
            System.out.println("No podemos dividir por 0");

//            Exeption contiene las demas exepciones
        }catch ( Exception e){
            System.out.println(e);
        }finally {
            System.out.println("siempre me ejecuto");
        }


        try {
            int number = 1;
            if(number > 0){
                throw new Exception("el numero tiene que ser mayor a 0");
            }
        }catch (Exception exp){
            System.out.println(exp.getMessage());
        }
    }
}
