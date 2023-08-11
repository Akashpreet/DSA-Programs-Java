public class DefaultMethods {
    /**
     * InnerDefaultMethods
     */
    interface Camera {
        void takeSnap();
        void recordVideo();
    }
    interface Wifi{
        String[] getNetwork();
        void internet(String network);
    }
    static class phone{
        void callNumber(int number){
            System.out.println("Calling "+number);
        }
        void pickCall(){
            System.out.println("Connecting....");
        }
        void takeSnap(){
            System.out.println("Taking Pictures with camera");
        }
    }
    static class smartPhone extends phone implements Wifi,Camera{
        public void takeSnap(){
            System.out.println("Taking Pictures with camera");
        }
        public void recordVideo(){
            System.out.println("Recording Videos");
        }
        public void internet(String network){
            System.out.println("Connecting to "+network);
        }
        public String[] getNetwork(){
            System.out.println("Getting list of networks");
            String[] networkList={"Jio","Airtel","Idea"};
            return networkList;
        }
    }
    public static void main(String[] args) {
        smartPhone sp=new smartPhone();
        String str[]=sp.getNetwork();
        for(String i:str){
            System.out.println(i);
        }
    }
}
