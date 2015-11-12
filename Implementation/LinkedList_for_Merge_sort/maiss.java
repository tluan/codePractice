import java.util.LinkedList;

/**
 * Created by EricaTuLuan on 11/11/15.
 */
public class maiss {
    public static void main(String[] args ){
        LinkedList<Integer> a=new LinkedList<Integer>();
        a.add(5);
        a.add(6);
        a.add(8);
        a.add(7);
        a.add(1);
        a.add(4);
        a.add(2);
        a.add(3);
        a.add(11);
        Merge.MergeSort(a);
        for(int i=0;i<a.size();i++){
            System.out.println(a.get(i));
        }
    }
}
