package by.tms.model;

import java.util.Random;
import java.util.Scanner;

public class Computer {
    String processor;
    String memory;
    String winchester;
    int counter;
    boolean isWorking;
    boolean isBurnedOut;

    public Computer(String processor, String memory, String winchester, int counter) {
        this.processor = processor;
        this.memory = memory;
        this.winchester = winchester;
        this.counter = counter;
        this.isWorking = false;
        this.isBurnedOut = false;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor='" + processor + '\'' +
                ", memory='" + memory + '\'' +
                ", winchester='" + winchester + '\'' +
                ", counter=" + counter +
                ", isWorking=" + isWorking +
                ", isBurnedOut=" + isBurnedOut +
                '}';
    }

    public void printComputer(){
        System.out.println(this.toString());
    }
    public void computerOn(){
        if (isBurnedOut){
            System.out.println("Сгарэу");
            return;
        }
        System.out.println("Введите 0 или 1");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        Random random = new Random();
        int randomPer = random.nextInt(1);
        if (num == randomPer){
            isWorking = true;
            System.out.println("Включен");
        } else {
            isBurnedOut = true;
        }


    }

    public void computerOff() {
        if (isBurnedOut) {
            System.out.println("Сгарэу");
            return;

        }
        counter -= 1;
        System.out.println("Выключение компьютера");
    }
}
