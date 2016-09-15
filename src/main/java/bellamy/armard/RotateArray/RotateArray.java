package bellamy.armard.RotateArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * Created by armardbellamy on 9/14/16.
 */
public abstract class RotateArray implements List{

    static ArrayList<Integer> numberList = new ArrayList<Integer>();


    public static void main(String[] args) {


        for (int i = 1; i< 7; i++){
            numberList.add(i);
        }

        printList();

        rotateList(numberList, 7);

        printList();


    }

    public static void rotateList (ArrayList list,Integer numberOfElementsToRotate){
        for (int i = 0; i < numberOfElementsToRotate; i++){
            ArrayList<Integer> removedItems = new ArrayList<Integer>();
            Integer removed = (Integer) list.remove(0);
            removedItems.add(removed);
            list.addAll(list.size(), removedItems);
        }
    }

    public static void printList(){
        System.out.print("[");
        for (Integer number: numberList){
            System.out.print(number + " ");
        }
        System.out.println("]");
    }




}
