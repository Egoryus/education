public class Main {
    public static void main(String[] args) {
        Person[] personRegistry = {
                new Person("Виталик", "Минск", 22, true),
                new Person("Виталик", "Гомель", 17, true),
                new Person("Виталик", "Витебск", 23, true),
                new Person("Александр", "Минск", 25, true),
                new Person("Виталик", "Витебск", 22, true),
                new Person("Виталик", "Гомель", 22, true),
                new Person("Виталик", "Минск", 30, true),
                new Person("Александр", "Гомель", 22, false),
                new Person("Виталик", "Минск", 27, true),
                new Person("Виталик", "Витебск", 22, true)
        };
        MilitaryOffice office = new MilitaryOffice(personRegistry);
        office.filter();
        office.countMinsk();
        office.ageFilter();
        office.nameFilter();
    }
}
