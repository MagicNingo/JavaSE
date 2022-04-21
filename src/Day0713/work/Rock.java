package Day0713.work;

public class Rock {
    public String name;

    public Rock() {
    }

    public Rock(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Rock{" +
                "name='" + name + '\'' +
                '}';
    }
}
