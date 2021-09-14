package task2;

public class TestAuthor {
    public static void test() {
        Author author = new Author("Pushkin", "bozhe.hrani.imperatritsu@mail.ru", 'm');
        System.out.println("Testing author " + author.getName() + " with email " + author.getEmail() + " who is " +
                ((author.getGender() == 'm') ? ("male") : ("female")) + "\n");
        System.out.println("Changing " + author.getName() + "`s email\n");
        author.setEmail("new." + author.getEmail());
        System.out.println(author.getName() + "`s new email is " + author.getEmail());
    }
}
