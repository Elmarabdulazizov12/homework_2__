import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            int age = generateRandomAge(random);
            int temperature = random.nextInt(51) - 20;
            String result = permission(age, temperature);
            System.out.printf("Возраст: %d, Температура: %d -> %s%n", age, temperature, result);
        }
    }

    public static String permission(int age, int temperature) {
        if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) {
            return "Можно идти гулять";
        } else if (age < 20 && temperature >= 0 && temperature <= 28) {
            return "Можно идти гулять";
        } else if (age > 45 && temperature >= -10 && temperature <= 25) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }

    public static int generateRandomAge(Random random) {
        return random.nextInt(101);
    }
}
