//利用链表实现下压堆栈


import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import org.jetbrains.annotations.NotNull;

import java.awt.event.ItemEvent;
import java.util.Iterator;

public class StackByNode<Item> implements Iterable<Item> {
    private Node first;
    private int N;

    private class Node {
        Item item;
        Node next;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return N;
    }

    public void push(Item item) {
        //向栈顶添加新元素
        Node oldFirst = first;//移动链表头
        first = new Node();
        first.item = item;
        first.next = oldFirst;
        N++;
    }

    public Item pop() {
        Item item = first.item;
        //通过移动表头指针，删除栈顶（链表头）元素
        first = first.next;
        N--;
        return item;
    }


    @NotNull
    @Override
    public Iterator<Item> iterator() {
        return new ListInterator();
    }

    private class ListInterator implements Iterator<Item> {
        private Node current = first;

        public boolean hasNext() {
            return current != null;
        }

        public void remove() {
        }

        @Override
        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;
        }
    }

    public static void main(String[] args) {
        StackByNode<String> s = new StackByNode<String>();
        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            if (!item.equals("-")) {
                s.push(item);
            } else if (!s.isEmpty()) {
                StdOut.print(s.pop() + " \n");
            }
        }
        StdOut.println("(" + s.size() + " left on stack)");
    }

}
