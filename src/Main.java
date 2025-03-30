//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.print("задача 1 ");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        System.out.println("задача 2");
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper +4;
        System.out.println(paper);
        System.out.println("задача 3");
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);
        System.out.println("задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        System.out.println("задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        System.out.println("задача 6");
        var theBoxer1 = 78.2;
        var theBoxer2 = 82.7;
        var weight = theBoxer1 + theBoxer2;
        System.out.println("общая масса " + weight + " кг.");
        var difference = theBoxer2 - theBoxer1;
        System.out.println("разница между массами бойцов " + difference + " кг.");
        System.out.println("задача 7");
        var remains = theBoxer2 % theBoxer1;
        System.out.println(remains);
        System.out.println("задача 8");
        var openingHours = 640;
        var oneEmployee = 8;
        var staff = openingHours / oneEmployee;
        System.out.println("Всего работников в компании - " + staff + " человек.");
        staff = staff + 94;
       oneEmployee = openingHours / staff;
        System.out.println("Если в компании работает - " + staff + " человека, то всего " +  oneEmployee + " часов работы может быть поделено между сотрудниками.");




    }
}