public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    void speak() {
        System.out.println(name + "гав");
    }
}
