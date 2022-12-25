import lombok.Builder;
import lombok.Singular;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;

enum Gender {
    MALE, FEMALE
}

@SuperBuilder
@ToString
public class User extends Human {
    private int age;
    private Gender gender;
    private double weight;
    private double height;
    @Singular
    public List<String> occupations;

//    public User(String name, int age, Gender gender, double weight, double height) {
//        this.name = name;
//        this.gender = gender;
//        this.age = age;
//        this.weight = weight;
//        this.height = height;
//    }
//
//    public User(String name, int age, Gender gender) {
//        this.name = name;
//        this.gender = gender;
//        this.age = age;
//        this.weight = 0;
//        this.height = 0;
//    }
//
//    public User(String name, Gender gender) {
//        this.name = name;
//        this.gender = gender;
//        this.age = 0;
//        this.weight = 0;
//        this.height = 0;
//    }
//
//    public User(String name) {
//        this.name = name;
//        this.gender = null;
//        this.age = 0;
//        this.weight = 0;
//        this.height = 0;
//    }
}