package systemClass;

import java.util.Properties;

public class SystemClass {
    public static void main(String[] args) {

//        there are several propertys about so , enviroments, etc that we can get across system
        String username = System.getProperty("user.name");
        System.out.println("username = " + username);

        String home = System.getProperty("user.home");
        System.out.println("home = " + home);

        String workspace = System.getProperty("user.dir");
        System.out.println("workspace = " + workspace);
        
        String lineSeparator = System.getProperty("line.separator");
        System.out.println("lineSeparator = " + lineSeparator);

        Properties p = System.getProperties();
        p.list(System.out);

        //acelerating garbage collector to clear memory

        System.gc();
                
    }
}
