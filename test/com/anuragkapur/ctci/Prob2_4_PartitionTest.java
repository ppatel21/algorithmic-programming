package com.anuragkapur.ctci;

import com.anuragkapur.ds.linkedlist.SinglyLinkedListNode;
import org.junit.Assert;
import org.junit.Test;

public class Prob2_4_PartitionTest {

    @Test
    public void testPartition1() throws Exception {
        SinglyLinkedListNode node1 = new SinglyLinkedListNode("5");
        SinglyLinkedListNode node2 = new SinglyLinkedListNode("4");
        SinglyLinkedListNode node3 = new SinglyLinkedListNode("3");
        SinglyLinkedListNode node4 = new SinglyLinkedListNode("2");
        SinglyLinkedListNode node5 = new SinglyLinkedListNode("1");

        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);

        SinglyLinkedListNode partitionedListHead = new Prob2_4_Partition().partition(node1, 3);

        StringBuilder builder = new StringBuilder();
        while (partitionedListHead != null) {
            builder.append(partitionedListHead.getPayload());
            if (partitionedListHead.getNext() != null) {
                builder.append(",");
            }
            partitionedListHead = partitionedListHead.getNext();
        }

        Assert.assertEquals("1,2,5,4,3", builder.toString());
    }

    @Test
    public void testPartition2() throws Exception {
        SinglyLinkedListNode node1 = new SinglyLinkedListNode("1");
        SinglyLinkedListNode node2 = new SinglyLinkedListNode("2");
        SinglyLinkedListNode node3 = new SinglyLinkedListNode("3");
        SinglyLinkedListNode node4 = new SinglyLinkedListNode("4");
        SinglyLinkedListNode node5 = new SinglyLinkedListNode("5");

        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);

        SinglyLinkedListNode partitionedListHead = new Prob2_4_Partition().partition(node1, 3);

        StringBuilder builder = new StringBuilder();
        while (partitionedListHead != null) {
            builder.append(partitionedListHead.getPayload());
            if (partitionedListHead.getNext() != null) {
                builder.append(",");
            }
            partitionedListHead = partitionedListHead.getNext();
        }

        Assert.assertEquals("2,1,3,4,5", builder.toString());
    }
}