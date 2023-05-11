package enums;


import java.util.Arrays;

enum Colors {
    BLACK("blanco","este es un color primario"),
    WHITE("blanco","este es un color primario"),
    YELLOW("blanco","este es un color primario");

    private String name;
    private String description;

    Colors(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
public class EnumExample {

    public static void main(String[] args) {
        Colors color = Colors.BLACK;
        Colors color2 = Colors.valueOf("WHITE");
        System.out.println(color);
        System.out.println(color2);

        System.out.println(color.getName());
        System.out.println(color.getDescription());

        System.out.println(Arrays.toString(Colors.values()));
    }
}
