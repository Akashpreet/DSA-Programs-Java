abstract class bank{
    int rate=1,interest=1,time=1;

    bank(int a,int b,int c){
        this.rate=a;
        this.interest=b;
        this.time=c;
    }
    abstract void roi();
}

class cal extends bank{
    cal(int a,int b,int c){
        super(a, b, c);
    }
    void roi(){
        System.out.println((interest*rate*time)/100);
    }
}
public class Abstraction {
    public static void main(String[] args) {
        bank b=new cal(10, 100, 2);
        b.roi();
    }
}
