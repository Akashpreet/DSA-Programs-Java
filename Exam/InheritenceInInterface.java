public class InheritenceInInterface {
    interface sampleInterface{
        void meth1();
        void meth2();
    }

    interface sampleInterface2 extends sampleInterface{
        void meth3();
        void meth4();
    }

    static class myClass implements sampleInterface2{
        public void meth1(){
            System.out.println("Meth1");
        }
        public void meth2(){
            System.out.println("Meth2");
        }
        public void meth3(){
            System.out.println("Meth3");
        }
        public void meth4(){
            System.out.println("Meth4");
        }
    }
    public static void main(String[] args) {
        myClass cls=new myClass();
        cls.meth1();
        cls.meth2();
        cls.meth3();

    }
}
