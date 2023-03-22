public class Main {
    public static void main(String[] args) {
        int x = 200;
        //исходная
        int y = 1000;
        //пополнение
        int bonus = y >= 1000 ? y / 100 : 0;
        int z = x + y + bonus;

        System.out.println("Итоговый счет: " + z);
        System.out.println("Бонус: " + bonus);
    }
}