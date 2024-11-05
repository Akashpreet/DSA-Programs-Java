import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static void calcSubset(List<Integer> A,List<List<Integer> > res,List<Integer> subset,int index)
    {
        res.add(new ArrayList<>(subset));
        for (int i = index; i < A.size(); i++) {
            subset.add(A.get(i));
            calcSubset(A, res, subset, i + 1);
            subset.remove(subset.size() - 1);
        }
    }

    public static List<List<Integer>>subsets(List<Integer> A)
    {
        List<Integer> subset = new ArrayList<>();
        List<List<Integer> > res = new ArrayList<>();

        int index = 0;
        calcSubset(A, res, subset, index);

        return res;
    }
    public static void main(String[] args)
    {
        List<Integer> array = List.of(1, 2, 3);
        List<List<Integer> > res = subsets(array);
        for (List<Integer> subset : res) {
            for (Integer num : subset) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
