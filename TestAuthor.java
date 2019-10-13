package Author;
public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Valeria", "marry",'F');
        System.out.println(a1);
        a1.setRelationship("marry");
        System.out.println(a1);
    }
}