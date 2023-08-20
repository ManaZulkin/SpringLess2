package XMLMap;

public class MyKey {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MyKey() {
    }

    public MyKey(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
