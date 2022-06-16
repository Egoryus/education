public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    @Override
    void speak() {
        System.out.println(name + " мяУ");
    }
}
