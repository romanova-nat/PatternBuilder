public class PersonBuilder {

    private String name;
    private String surname;
    private Integer age;
    private String city;

    public PersonBuilder() {
    }

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String city) {
        this.city = city;
        return this;
    }

    public Person build() {
        if (name == null || surname == null) {
            IllegalStateException e = new IllegalStateException();
            System.out.println("Не указаны имя или фамилия");
            return null;
        }

        if (age < 0 || age > 100) {
            Exception e = new Exception();
            System.out.println("Не верный возраст");
            return null;
        }

        if (city == null) {
            return new Person(name, surname, age);
        } else if (age == null) {
            return new Person(name, surname, city);
        } else if (city == null && age == null) {
            return new Person(name, surname);
        }
        return new Person(name, surname, age, city);
    }
}
