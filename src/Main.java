public class Main {
    public static void main(String[] args) {
        // Задание 1
        double dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var weightOfAllBoxers = boxer1 + boxer2;
        var weightDifference = boxer2 - boxer1;
        System.out.println("Общий вес боксеров" + weightOfAllBoxers);
        System.out.println("Разница в весе боксеров" + weightDifference);
        double difference = boxer2 % boxer1;
        System.out.println(difference);
        var openingHours = 640;
        var watch = 8;
        var employees = 640 / 8;
        System.out.println("Всего работников в компании" + openingHours / watch);
        employees = employees + 94;
        System.out.println(employees);
        employees = employees * watch;
        System.out.println("Если в компании работает 174 человека, то поделено часов между сотрудниками может быть -" +
                employees * watch);











    }

}





