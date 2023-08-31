public class Main {
    public static void main(String[] args) {

        int initialBalanse = 500;
        int addend = 1700;

        int bonus = 0;
        if (addend > 1000) ;
        {
            bonus = addend / 100;
        }
        int finalBalans = initialBalanse + addend + bonus;
        System.out.println("Итоговый баланс: " + finalBalans);
        System.out.println("Бонус: + bonus");

    }
}
