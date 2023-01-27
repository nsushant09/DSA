package LinkedList;

import java.util.LinkedList;

/**
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order, and each of their nodes contains a single digit.
 * Add the two numbers and return the sum as a linked list.
 * <p>
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 * Input: l1 = [2,4,3], l2 = [5,6,4]
 * Output: [7,0,8]
 * Explanation: 342 + 465 = 807.
 */
public class AddTwoNumbers {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(2);
        list1.add(4);
        list1.add(3);

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(5);
        list2.add(6);
        list2.add(4);

        System.out.println(addTwoNumber(list1, list2));

    }

    public static LinkedList<Integer> addTwoNumber(LinkedList<Integer> list1, LinkedList<Integer> list2){
        LinkedList<Integer> finalList = new LinkedList<>();


        return finalList;
    }

}



