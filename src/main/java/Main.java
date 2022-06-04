public class Main {
    public static void main(String[] args) {
        Person mom = new PersonBuilder()
                .setName("Анна")
                .setSurname("Вольф")
                .setAge(31)
                .setAddress("Сидней")
                .build();
        System.out.println(mom);

        Person son = mom.newChildBuilder()
                .setName("Антошка")
                .build();
        System.out.println("У " + mom + " есть сын, " + son);

        Person daughter = mom.newChildBuilder()
                .setName("Мария")
                .setAge(9)
                .build();
        daughter.happyBirthday();
        System.out.println("У " + mom + " есть дочь, " + daughter);

        Person withException1 = new PersonBuilder().build();
        System.out.println(withException1);

        Person dad = new PersonBuilder()
                .setName("Игорь")
                .setSurname("Вольф")
                .setAge(-150)
                .build();
        System.out.println(dad);

    }
}
