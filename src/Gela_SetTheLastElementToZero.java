import java.util.ArrayList;

public class Gela_SetTheLastElementToZero {

/*
write a program that can set the last element of the Integer arraylist to zero
	            ex:
	                list = [1,2,3,4,5];
	                output: [1,2,3,4,0];


	    HINT --> check day 28 tasks
 */

    public static void main(String[] args) {

        //declaring new Array list
        ArrayList<Integer> arr = new ArrayList<>();

        //assigning values
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        //print array list before changes
        System.out.println(arr);

        //sets last element to 0
        arr.set(arr.size()-1, 0);
        //prints new array list with change
        System.out.println(arr);
    }

}


