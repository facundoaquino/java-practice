package anonymousClasses;

public class ImplementsSayHello implements  SayHello{
    @Override
    public void hello() {
        System.out.println("Say hello implementing class");
    }
}
