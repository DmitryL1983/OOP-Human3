public class Human {
    int yearOfBirth;
    String name;
    String town;
    String jobTitle;

    Human(String name, String town, int yearOfBirth, String jobTitle) {
        if (name == null || name.isBlank()) {
            this.name = "Укажите имя";
        } else
            this.name = name;

        if (town == null || town.isBlank()) {
            this.town = "Укажите город";
        } else
            this.town = town;

        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        } else
            this.yearOfBirth = 0;

        if (jobTitle == null || jobTitle.isBlank()) {
            this.jobTitle = "Укажите должность";
        } else
            this.jobTitle = jobTitle;
    }

    void greeting() {
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + yearOfBirth + " году. Я работаю на должности " + jobTitle + ". Будем знакомы!");
        Main.printSeparator();
    }
}

