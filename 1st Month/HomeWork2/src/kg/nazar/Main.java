package kg.nazar;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Задание 3
        canGoOutside(generateRandomAge(), 40);
        canGoOutside(20, 0);
        canGoOutside(45, -10);
        canGoOutside(1, -25);
        canGoOutside(20, 40);
        System.out.println(generateRandomAge());

    }


    //Задание 1
    public static String canGoOutside(final int age, final float temp) {
        //Задание 2
//        if ((age >= 20 && age <= 45) && (temp >= -20 && temp <= 30)) {
//            System.out.println("Можно идти гулять");
//        } else if (age < 20 && (temp >= 0 && temp <= 28)) {
//            System.out.println("Можно идти гулять");
//        } else if (age > 45 && (temp >= -10 && temp <= 25)) {
//            System.out.println("Можно идти гулять");
//        } else {
//            System.out.println("Отсавайтесь дома");
//        }

        return (age >= 20 && age <= 45) && (temp >= -20 && temp <= 30) ? "Можно идти гулять" :
                age < 20 && (temp >= 0 && temp <= 28) ? "Можно идти гулять" :
                        age > 45 && (temp >= -10 && temp <= 25) ? "Можно идти гулять" :
                                "Отсавайтесь дома";
    }

    public static int generateRandomAge() {
        final Random random = new Random();
//        int random = (int) (Math.random() * 50 + 1);

        return random.nextInt(100) + 1;
    }

}