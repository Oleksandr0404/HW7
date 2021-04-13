package homework7;

public class Person {

    private String name;
    private Gender gender;
    private int age;

    public Person(String name, int age, Gender gender) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        if (gender.equals(Gender.MALE)) {
            return " - m\n";
        }
        return " - f\n";
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                "}\n";
    }
}
