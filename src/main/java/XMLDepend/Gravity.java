package XMLDepend;

public class Gravity implements IGravity{
    public static String name1, name2;
    public static double m1, m2, r;
    public final static double G = Math.pow(10, -11) * 6.674;

    public Gravity() {
    }
    public Gravity(String name1, String name2){
        this.name1 = name1;
        this.name2 = name2;
    }
    public String getName() {
        return name2;
    }

    public void setName(String name) {
        name1 = name;
    }

    public double getM1() {
        return m1;
    }

    public void setM1(double m1) {
        Gravity.m1 = m1;
    }

    public double getM2() {
        return m2;
    }

    public void setM2(double m2) {
        Gravity.m2 = m2;
    }

    public double getR() {
        return r;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        Gravity.name1 = name1;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        Gravity.name2 = name2;
    }

    public void gravityCalculation(){
        System.out.println("XMLDepend.Gravity for " + name1 + " and " + name2 + " : " + G * m1 + m2 / (r * r));
    }

   public void setR(double r) {
        this.r = r;
    }
    public void initMethod(){

        setR(5);
    }
}
