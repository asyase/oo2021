package HW8second;

public class MainPhone {

    public static void main(String[] args) {
        System.out.println("----------IPHONE-------------");
        Iphone iphone = new Iphone("Iphone 11", "Rose Gold", 12);
        iphone.phoneInfo();
        iphone.battery();
        iphone.dislike();
        iphone.difference();
        iphone.rightNowIsCharging();
        iphone.phoneWasReleased(2019);

        System.out.println("----------HUAWEI-------------");
        Huawei huawei = new Huawei("Huawei P smart", "black", 48);
        huawei.phoneInfo();
        huawei.battery();
        huawei.dislike();
        huawei.difference();
        huawei.rightNowIsCharging();
        huawei.phoneWasReleased(2021);

    }
}
