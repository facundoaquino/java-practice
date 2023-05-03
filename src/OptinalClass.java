import java.util.Locale;
import java.util.Optional;

public class OptinalClass {

    public static void main(String[] args) {
        Optional<String> empty = Optional.ofNullable("a string");
//        System.out.println(empty.isEmpty());
        System.out.println(empty.isPresent());

        String orElse = empty.orElse("world");
        Optional<String> s = empty.map(String::toUpperCase);
        System.out.println("s = " + s.get());
        System.out.println("orElse = " + orElse);

//        optinal con un valor no nulo

        Optional<String> pepe = Optional.ofNullable("pepe");
        String siPepp = pepe.get();
        System.out.println("siPepp = " + siPepp);

//        optinal con un valor  nulo
        Optional<String> pepe2 = Optional.ofNullable(null);
        String siPepe = pepe2.orElse("pepe final");
        System.out.println(siPepe);

        //        optinal con un valor  nulo y supplier
        Optional<String> pepe3 = Optional.ofNullable(null);
        String siPepe2 = pepe3.orElseGet(() -> {
            String value = "plus";
            return "something" + value;
        });
        System.out.println(siPepe2);

//          valor nulo y orElseThrow

        Optional<String> optStr_1 = Optional.ofNullable("str");
        String str_1 = optStr_1
                .map(String::toUpperCase)
                .orElseThrow(IllegalStateException::new);

        //          ifPresent

        Optional<String> optStr_2 = Optional.ofNullable("str");
        optStr_2
                .ifPresent(s1 -> {
                    System.out.println(s1);
                });

        //          ifPresentOrElse recibe dos parametros

//        Optional<String> optStr_3 = Optional.ofNullable("str");
//        optStr_3
//                .ifPresentOrElse(s1 -> {
//                    System.out.println(s1);
//                },() -> {
//                    System.out.println("or else option");
//                });


//

        Person person = new Person("james", null);
        String email = person
                .getEmail()
                .map(String::toLowerCase)
                .orElse("not email provided");
        System.out.println(email);
    }
}

class Person {
    private final String name;
    private final String email;

    public String getName() {
        return name;
    }

//    podemos asumir que el email puede ser null
    public Optional<String> getEmail() {
        return Optional.ofNullable(email);
    }

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
