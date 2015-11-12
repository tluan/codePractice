/**
 * Created by EricaTuLuan on 11/11/15.
 */
import java.io.*;
import java.util.*;
public class Merge  {
   public static void MergeSort(LinkedList<Integer> inputLinkedList){
       LinkedList<Integer> leftLinkedList=new  LinkedList<Integer>();
       LinkedList<Integer> rightLinkedList=new  LinkedList<Integer>();

       int m=inputLinkedList.size();
       if(inputLinkedList.size()>1) {
           for (int i = 0; i <= m / 2-1; i++) {
               leftLinkedList.add(inputLinkedList.get(i));
           }
           for (int i = m / 2; i< m; i++) {
               rightLinkedList.add(inputLinkedList.get(i));
           }


           MergeSort(leftLinkedList);
           MergeSort(rightLinkedList);
           MergeLinkedlist(inputLinkedList, leftLinkedList, rightLinkedList);
       }
   }
    public static void MergeLinkedlist(LinkedList<Integer> combinedLinkedList,LinkedList<Integer> leftLinkedList,LinkedList<Integer> rightLinkedList){
        int l=0;
        int r=0;
        int k=0;
       //LinkedList<Integer> m=new LinkedList<Integer>();
        //System.out.print("c"+leftLinkedList.get(0)+rightLinkedList.get(0));
        while(l<leftLinkedList.size()&&r<rightLinkedList.size()) {
            if (leftLinkedList.get(l).compareTo(rightLinkedList.get(r)) < 0) {

                combinedLinkedList.set(k,leftLinkedList.get(l));
                l++;
                k++;


            } else {
                combinedLinkedList.set(k,rightLinkedList.get(r));
                r++;
                k++;

            }
        }
            while(l<leftLinkedList.size()){
                combinedLinkedList.set(k,leftLinkedList.get(l));
                l++;
                k++;


            }
            while(r<rightLinkedList.size()){
                combinedLinkedList.set(k,rightLinkedList.get(r));
                r++;
                k++;

            }

        for(int i=0;i<combinedLinkedList.size();i++){
            System.out.println("Combine4  "+combinedLinkedList.get(i));
        }

        }



    }

