class Shape{
    public void area() {
        System.out.println("Printing Area");
    }
}
// Single level
class Triangle extends Shape{
    public void area(int b,int h) {
        System.out.println(0.5*(b*h));
    }
}
// Multilevel
class Rectangle extends Shape{
    public void area(int l,int b) {
        System.out.println(l*b);
    }
}
class Bank{
    public String name;
    protected String email;
    private String password;
    public String getPass(){
        return this.password;
    }
    public void setPass(String pass) {
        this.password=pass;
    }
}
public class Inheritecne {
    public static void main(String[] args) {
        Triangle t1=new Triangle();
        t1.area(1, 2);
        Bank b1=new Bank();
        b1.name="Akashpreet Singh";
        b1.email="akash@gmail.com";
        // b1.password="123456";
        b1.setPass("123456");
        System.out.println(b1.getPass());
    }
}
