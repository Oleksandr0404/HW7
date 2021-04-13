package homework7;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> list = List.of(

                new Person("Petro", 25, Gender.MALE),
                new Person("Olena", 19, Gender.FEMALE),
                new Person("Marek", 50, Gender.MALE),
                new Person("Rasine", 65, Gender.FEMALE),
                new Person("Cherina", 42, Gender.FEMALE),
                new Person("Bridgett", 18, Gender.FEMALE),
                new Person("Jaron", 42, Gender.MALE),
                new Person("Namir", 18, Gender.MALE),
                new Person("John", 10, Gender.MALE),
                new Person("Jane", 78, Gender.FEMALE));

        List<Person> listPersonsWithAgeFrom18To60 = list
                .stream()
                .filter(p -> p.getAge() >= 18)
                .filter(p -> p.getAge() <= 60)
                .collect(Collectors.toList());

        System.out.println(listPersonsWithAgeFrom18To60);

        Set<String> persons = list
                .stream()
                .collect(HashSet::new, (set, person) -> set.add(person.getName() + " " + person.getGender()), HashSet::addAll);

        System.out.println(persons);

    }
}
