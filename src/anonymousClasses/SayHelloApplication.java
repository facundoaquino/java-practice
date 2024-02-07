package anonymousClasses;

public class SayHelloApplication {

    public static void main(String[] args) {
        SayHello sayHelloInSpanish = new SayHello() {
            @Override
            public void hello() {
                System.out.println("Saludando desde una clase anonima..");
            }
        };

        sayHelloInSpanish.hello();

        SayHello sayHelloAccesingVariables = new SayHello() {
            String name = "Pedro";

            @Override
            public void hello() {
                System.out.println("I can access to variable name:  " + name);
            }
        };

        sayHelloAccesingVariables.hello();

        UniqueTimeUse uniqueTimeUse = new UniqueTimeUse();
        uniqueTimeUse.hello();

        ImplementsSayHello implementsSayHello = new ImplementsSayHello();
        implementsSayHello.hello();
    }
}
