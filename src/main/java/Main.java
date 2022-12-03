public class Main {
    public static void main(String[] args) {
        User user = User.builder().name("Oles").age(31).occupation("UCU").gender(Gender.MALE).build();
        System.out.println(user);
    }
}
