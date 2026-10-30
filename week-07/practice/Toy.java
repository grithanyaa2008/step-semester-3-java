public abstract class Toy {
    private static int counter = 1000;
    private final String toyId;
    private String name;

    public Toy(String name) {
        this.name = name;
        this.toyId = "TOY-" + (++counter);
    }

    public String getToyId() {
        return toyId;
    }

    public String getName() {
        return name;
    }

    public abstract String makeSound();
}