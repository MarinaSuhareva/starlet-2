public class Main {
    public static void main(String[] args) {

        System.out.println("Здравствуйте");

        int ticketPrice = 15810;
        int bonusRate = 20;
        int bonusInMiles = (ticketPrice / bonusRate);
        char whitespace = ' ';

        System.out.println("Ваш бонус от покупки составил:");
        System.out.println(bonusInMiles + (whitespace + "Мили"));
        System.out.println("Счастливого полета!");
    }
}
