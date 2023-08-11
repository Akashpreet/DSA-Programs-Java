public class Practice {
    static abstract class Pen{
        abstract void write();
        abstract void refill();
    }
    static class fountainPen extends Pen{
        void write(){
            System.out.println("Writing");
        }
        void refill(){
            System.out.println("Refulling");
        }
        void changeNib(){
            System.out.println("Changing Nib");
        }
    }
    static class Monkey{
        void jump(){
            System.out.println("Jumping");
        }
        void bite(){
            System.out.println("Biting");
        }

    }
    interface animal{
        void eat();
        void sleep();
    }
    static class human extends Monkey implements animal{
        void speak(){
            System.out.println("Hello");
        }
        public void eat(){
            System.out.println("Eating");
        }
        public void sleep(){
            System.out.println("Sleeping");
        }
    }
    public static void main(String[] args) {
        fountainPen fp=new fountainPen();
        fp.changeNib();

        human h=new human();
        h.sleep();
    }   
}
