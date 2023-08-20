package XMLMap;

public class MySrting {
    public  String result;

    public String getResult() {
        return result;
    }

    public  void setResult(String result) {
        this.result = result;
    }

    public MySrting() {
    }

    public MySrting(String name) {
        this.result = name;
    }

    @Override
    public String toString() {
        return result;
    }
}
