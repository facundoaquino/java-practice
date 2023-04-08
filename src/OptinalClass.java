import java.util.Optional;

public class OptinalClass {

    public static void main(String[] args) {
        Optional<String> empty = Optional.ofNullable("a string");
        System.out.println(empty.isEmpty());
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
        String siPepe2 = pepe3.orElseGet( () -> {
            String value = "plus";
            return "something" + value;
        });
        System.out.println(siPepe2);
        
    }
}
