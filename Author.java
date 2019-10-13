package Author;
public class Author {
    private String name;
    private String relationship;
    private char gender;

    public Author(String name, String relationship, char gender) {
        this.name = name;
        this.relationship = relationship;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Author @ (" + this.name + ", " + this.relationship + ", " + this.gender + ").";
    }
}