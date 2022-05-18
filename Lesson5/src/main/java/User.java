public class User {
    String name;
    String surname;
    int age;
    String sex;

    public User(String name, String surname, int age, String sex) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.sex = sex;

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
    public void celebrateBirthday(){
        age += 1;
    }
    public void printUser(){
        System.out.println(this.toString());
    }
}
