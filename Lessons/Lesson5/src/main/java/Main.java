import by.tms.model.Computer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //userTask();
        Computer compik = new Computer("i7", "ddr4","seagate", 2 );
        while (true){
            System.out.println("выберете метод компьютера:");
            System.out.println("1.вывести информацию о пк");
            System.out.println("2.включить пк");
            System.out.println("3.выключить пк");
            System.out.println("4.выйти из программы");
            Scanner s = new Scanner(System.in);
            int num = s.nextInt();
            switch (num){
                case 1:
                    compik.printComputer();
                    break;
                case 2:
                    compik.computerOn();
                    break;
                case 3:
                    compik.computerOff();
                    break;
                case 4:
                    return;
            }

        }
    }
    public static void userTask(){
        User user1 = new User("Иван", "Иванов", 24, "мэн");
        System.out.println(user1.fullName());
        user1.printUser();
        user1.celebrateBirthday();
        user1.printUser();
    }
}
