public class Main {

    public static void main(String[] args) {
        User user1 = new User("Валех", "Хлилов", 24, "транс");
        System.out.println(user1.fullName());
        user1.printUser();
        user1.celebrateBirthday();
        user1.printUser();
    }
}
