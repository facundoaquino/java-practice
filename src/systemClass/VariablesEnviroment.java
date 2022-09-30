package systemClass;

import java.util.Map;

public class VariablesEnviroment {

    public static void main(String[] args) {
        Map<String,String> varEnv = System.getenv();
        System.out.println("varEnv = " + varEnv);

        //GET A PARTICULAR VARIABLE ENVIROMENT

        String username = System.getenv("USERNAME");
        System.out.println(username);
        
        String javahome = System.getenv("JAVA_HOME");
        System.out.println("javahome = " + javahome);

        String path = System.getenv("Path");
        System.out.println(path);
    }
}
