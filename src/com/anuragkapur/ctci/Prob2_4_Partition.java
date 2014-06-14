package com.anuragkapur.ctci;

import com.anuragkapur.ds.linkedlist.SinglyLinkedListNode;

/**
 * @author: anuragkapur
 * @since: 14/06/14
 */

public class Prob2_4_Partition {

    public SinglyLinkedListNode partition(SinglyLinkedListNode headNode, int value) {

        SinglyLinkedListNode runner = headNode;
        SinglyLinkedListNode previous = headNode;
        SinglyLinkedListNode tail = null;
        int totalNodes = 0;

        while(runner != null) {
            tail = runner;
            runner = runner.getNext();
            totalNodes ++;
        }

        runner = headNode;
        int count = 0;

        while (count < totalNodes) {

            // Eject runner
            previous.setNext(runner.getNext());
            SinglyLinkedListNode temp = new SinglyLinkedListNode(runner.getPayload());

            // Check boundary conditions and update head and tail if required
            if (runner.equals(headNode)) {
                headNode = runner.getNext();
                runner = headNode;
                previous = headNode;
            } else if (runner.equals(tail)) {
                tail = previous;
                runner = tail;
                previous = tail;
            } else {
                previous = runner;
                runner = runner.getNext();
            }

            // add ejected node to head or tail depending on value
            if (Integer.valueOf(temp.getPayload()) < value) {
                // add to head
                temp.setNext(headNode);
                headNode = temp;
            } else {
                // add to tail
                tail.setNext(temp);
                tail = temp;
            }

            count ++;
        }

        return headNode;
    }
}
