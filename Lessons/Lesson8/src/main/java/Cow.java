public class Cow extends Animal {
    public Cow(String name) {
        super(name);
    }

    @Override
    void speak() {
        System.out.println(name + "му");
    }
}
