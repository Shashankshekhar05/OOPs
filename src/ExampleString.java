class Strings {
    String value = null;

    public String toString() {
        return this.value;
    }

    public Strings(String value) {
        this.value = value;
    }
}

public class ExampleString {
    public ExampleString() {
    }

    public static void main(String[] args) {
        Strings strings = new Strings("shashank shekhar");
        System.out.println(strings);
    }
}