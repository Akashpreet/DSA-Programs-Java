import java.util.*; 
public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");

        System.out.println(list);

        Iterator itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        for(String fruits : list){
            System.out.println(fruits);
        }
        System.out.println("Returning element: "+list.get(1));

        list.set(1, "Peas");
        System.out.println("Modified element: "+list.get(1));

        List<String> list2=new ArrayList<String>();
        list2.add("Apple");
        list2.add("Mango");
        list2.add("Grapes");
        list2.add("Banana");
        Collections.sort(list2);

        for(String i: list2){
            System.out.println(i);
        }

        // list2.remove(0);
        list2.addAll(list);
        for(String j: list2){
            System.out.println(j);
        }
        list2.removeAll(list);
        for(String i:list2){
            System.out.println(i);
        }
        list.retainAll(list2);
    }
}
