package defining_classes.p7_google;

class Pokemon {
    private String name;
    private String type;

    public Pokemon(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String toString() {
        return name + " " + type;
    }
}
