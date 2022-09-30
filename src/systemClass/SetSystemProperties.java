package systemClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class SetSystemProperties {

    public static void main(String[] args) {
        try {

            FileInputStream file = new FileInputStream("src/systemClass/config.properties");

            //AGREGAMOS EL ARCHIVO A UN OBJETO PROPERTIES
            Properties p = new Properties(System.getProperties());
            p.load(file);
            p.setProperty("my.personal.property","a new value was seted");
            System.setProperties(p);
            System.getProperties().list(System.out);

            //EN EL CATCH EL EXEPTION ES EL GENERICO PARA TODOS
        }catch (Exception e){
            System.out.println("e = " + e);
        }
    }
}
