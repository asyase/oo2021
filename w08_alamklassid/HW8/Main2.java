package HW8;

public class Main2 {

    public static void main(String[] arg) {
        System.out.println("-------Tavaline inimene--------");

        SimplePerson p1 = new SimplePerson();

        p1.dailyCalories();
        p1.howManyCalories();

        p1.eaten(1800);
        System.out.println("Inimene sõi 1500 kalori jagu toitu");
        p1.isTheCalorieIntakeDone(p1.dailyCalories);
        p1.howManyCalories();

        System.out.println("---------------");

        System.out.println("------Sportlane------");

        Sportsman p2 = new Sportsman();

        p2.dailyCalories();
        p2.howManyCalories();

        p2.eaten(2200);
        System.out.println("Sportlane sõi 2300 kalori jagu toitu");
        p2.isTheCalorieIntakeDone(p2.dailyCalories);

        p2.howManyCalories();
        p2.eaten(400);
        System.out.println("Sportlane sõi veel 400 kalori jagu toitu");
        p2.isTheCalorieIntakeDone(p2.dailyCalories);
        p2.howManyCalories();
        System.out.println("---------------");
    }
}
