package defining_classes.p7_google;

class Child {
    private String name;
    private String birthday;

    public Child(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String toString() {
        return name + " " + birthday;
    }
}
