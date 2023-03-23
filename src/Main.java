public class Main {
    public static void main(String[] args) {
        int first = 200;
        //исходная
        int put = 1000;
        //пополнение
        int bonus = put >= 1000 ? put / 100 : 0;
        int summary = first + put + bonus;

        System.out.println("Итоговый счет: " + summary);
        System.out.println("Бонус: " + bonus);
    }
}