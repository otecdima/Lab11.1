import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BuilderTest {
    @Test
    public void testBuilder() {
        User userFirst = User.builder().name("Dmytro").age(18).occupation("UCU student").gender(Gender.MALE).build();
        User userSecond = User.builder().name("Olga").age(23).occupation("CEO").gender(Gender.FEMALE).build();
        Assertions.assertEquals(
                "User(age=18, gender=MALE, weight=0.0, height=0.0, occupations=[UCU student])",
                userFirst.toString());
        Assertions.assertEquals(
                "User(age=23, gender=FEMALE, weight=0.0, height=0.0, occupations=[CEO])",
                userSecond.toString());
    }
}
