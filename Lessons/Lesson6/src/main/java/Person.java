public class Person {
    String name;
    String adress;
    int age;
    boolean isMen;

    public Person(String name, String adress, int age, boolean isMen) {
        this.name = name;
        this.adress = adress;
        this.age = age;
        this.isMen = isMen;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                ", age=" + age +
                ", isMen=" + isMen +
                '}';
    }
}
