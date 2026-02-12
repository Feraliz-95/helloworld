public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = (friend + 2) / 7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = (frog * 10) / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var result = boxer1 + boxer2;
        System.out.println("boxer1 + boxer2 = " + result);
        var result2 = boxer2 - boxer1;
        System.out.println("boxer2 - boxer1 = " + result2);
        var scales = 15;
        var scales2 = 6;
        System.out.println(scales % scales2);
        var time = 640;
        var work = 8;
        var result3 = time /work;
        System.out.println("Всего работников в компании - " + result3 + " человек ");
        var employees =(result3 + 94);
        var result4 = time / employees;
        System.out.println("Если в компании работает " + employees + " человек," + "то всего " + result4 + " часов работы может быть поделено между сотрудниками");


    }
}