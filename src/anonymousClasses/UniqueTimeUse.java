package anonymousClasses;

public class UniqueTimeUse {

    private String name = "NameForAccesingFromAnonimusClass";

    void hello() {
        SayHello sayHello = new SayHello() {
            @Override
            public void hello() {
                System.out.println("I can read the name from here... " + name);
            }
        };

        sayHello.hello();
    }
}
