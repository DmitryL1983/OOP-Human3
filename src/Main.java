public class Main {

    public static void printSeparator() { //Разделитель строк
        System.out.println("===================================================================================================================================");
    }

    public static void main(String[] args) {
        Human human = new Human("Максим", "Минск", 1988, "бренд-менеджер");
        human.greeting();

        Human human1 = new Human("Аня", "Москва", 1993, "методист образовательных программ");
        human1.greeting();

        Human human2 = new Human("Катя", "Калининград", 1992, "продакт-менеджер");
        human2.greeting();

        Human human3 = new Human("Артём", "Москва", 1995, "Директор по развитию бизнеса");
        human3.greeting();

    }

}