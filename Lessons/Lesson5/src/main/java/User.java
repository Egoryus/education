public class User {
    String name;
    String surname;
    int age;
    String sex;

    public User(String name, String surname, String sex) {
        this.name = name;
        this.surname = surname;
        this.sex = sex;
    }

    public User(String name, String surname, int age, String sex) {
        this(name, surname, sex);
        this.age = age;

    }
    public String fullName() {
        return name +" " + surname;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
    @Deprecated
    public void celebrateBirthday(){
        age += 1;
    }
    public void printUser(){
        System.out.println(this.toString());
    }

}
