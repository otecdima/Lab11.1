public class Main {
    public static void main(String[] args) {
        User user = User.builder().name("Dmytro").age(18).occupation("UCU student").gender(Gender.MALE).build();
        System.out.println(user);
    }
}