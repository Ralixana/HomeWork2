// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
    }
    public static void task2 () {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println("Задача 2");
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        }
    public static void task3 () {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;

        System.out.println("Задача 3");
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);
    }
    public static void task4 () {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }
    public static void task5 () {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }
    public static void task6 () {
        System.out.println("Задача 6");
        var boxerWeight1 = 78.2;
        System.out.println("Вес первого боксёра - " + boxerWeight1 + "кг");
        var boxerWeight2 = 82.7;
        System.out.println("Вес второго боксёра - " + boxerWeight2 + "кг");
        var totalWeight = boxerWeight1 + boxerWeight2;
        System.out.println("Общий вес двух боксёров - " + totalWeight + "кг");
        var differenceWeight = boxerWeight2 - boxerWeight1;
        System.out.println("Разница в весе между двумя боксёрами - " + differenceWeight + "кг");
    }
    public static void task7 () {
        System.out.println("Задача 7");
        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.7;
        var differenceWeight = boxerWeight2 - boxerWeight1;
        System.out.println("Разница в весе между двумя боксёрами - " + differenceWeight + "кг");
        differenceWeight = boxerWeight2 % boxerWeight1;
        System.out.println("Разница в весе между двумя боксёрами - " + differenceWeight + "кг");
    }
    public static void task8 () {
        System.out.println("Задача 8");
        var workingHour = 640;
        System.out.println("Распределено " + workingHour + " часов на всех сотрудников");
        var change = 8;
        System.out.println(change + " часов на каждого сотрудника");
        var staff = workingHour / change;
        System.out.println("Всего работников в компании - " + staff + " человек");
        staff = staff + 94;
        change = workingHour / staff;
        System.out.println("Если в компании работает " + staff + " человека, то всего " + change + " часа работы может быть поделено между сотрудниками");
    }
}