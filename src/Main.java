public class Main {
    public static void main(String[] args) {

        int amout = 5000; // стоимость билета
        int rubMili = 20; // количество рублей для одной бонусной милли

        int mili = amout / rubMili; // количество бонусных милль
        System.out.println("Начислино " + mili + " бонусных миль");
    }
}
