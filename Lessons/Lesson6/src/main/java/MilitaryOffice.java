public class MilitaryOffice {
    Person[] personRegistry;

    public MilitaryOffice(Person[] personRegistry) {
        this.personRegistry = personRegistry;
    }

    public void filter() {
        for (Person person : personRegistry) {
            if (person.age >= 18 && person.age <= 27 && person.isMen == true) {
                System.out.println(person.toString());
            }
        }


    }

    public void countMinsk() {
        int counter = 0;
        for (Person person : personRegistry) {
            if (person.age >= 18 && person.age <= 27 && person.isMen == true && person.adress == "Минск") {
                counter++;
            }
        }
        System.out.println("кол-во годных в Минске - " + counter);
    }
    public void ageFilter(){
        int counter = 0;
        for (Person person : personRegistry) {
            if (person.age >= 25 && person.age <= 27 && person.isMen == true) {
                counter++;
            }
        }
        System.out.println("Кол-во призывников от 25 до 27 - " + counter);
    }
    public void nameFilter(){
        int counter = 0;
        for (Person person : personRegistry) {
            if (person.name == "Александр") {
                counter++;
            }
        }
        System.out.println("Кол-во призывников с именем Александр - " + counter);
    }

}
