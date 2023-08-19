package DessingPatterns.Creational.singleton;

public class Version {
    private int minor;
    private int major;
    private int revision;

    private Version() {
        this.major = 1;
        this.minor = 0;
        this.revision = 0;
    }

    private static final Version instance = new Version();

    public static Version getInstance() {
        return instance;
    }

    @Override
    public String toString() {
        return "Version{" +
                "minor=" + minor +
                ", major=" + major +
                ", revision=" + revision +
                '}';
    }
}