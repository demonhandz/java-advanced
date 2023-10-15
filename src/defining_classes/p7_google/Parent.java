package defining_classes.p7_google;

class Parent {
    private String name;
    private String birthday;

    public Parent(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String toString() {
        return name + " " + birthday;
    }
}
