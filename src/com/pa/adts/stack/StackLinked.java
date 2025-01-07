package com.pa.adts.stack;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class StackLinked<E> implements Stack<E> {
    private Node top;
    private int size;

    public StackLinked() {
        size=0;
        top=null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return top==null;
    }

    @Override
    public E peek() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.elem;
    }

    @Override
    public void push(E elem) throws FullStackException {
        top = new Node(elem,top);
         size++;
    }

    @Override
    public E pop() throws EmptyStackException {
        E elem = peek();
        top=top.next;
        size--;
        return elem;
    }

    @Override
    public Iterator<E> iteratorInverse() {
        return new IteratorInverse();
    }

    private class IteratorInverse implements Iterator<E> {
        private Stack<Node> reverseStack;

        public IteratorInverse() {
            reverseStack = new StackArray<>();
            Node current = top;
            while(current != null){
                reverseStack.push(current);
                current=current.next;
            }

        }

        @Override
        public boolean hasNext() {
            return !reverseStack.isEmpty();
        }

        @Override
        public E next() {
            if(!hasNext()){
                throw new NoSuchElementException();
            }
            return reverseStack.pop().elem;
        }
    }
    @Override
    public Iterator<E> iterator() {
        return new IteratorStack();
    }
    private class IteratorStack implements Iterator<E> {
        private Node current;

        public IteratorStack() {
            current=top;
        }

        @Override
        public boolean hasNext() {
            return current!=null;
        }

        @Override
        public E next() {
            if(!hasNext()){
                throw new NoSuchElementException();
            }
            E elem=current.elem;
            current=current.next;
            return elem;
        }
    }

    private class Node{
        private E elem;
        private Node next;

        public Node(E elem) {
            this(elem,null);
        }

        public Node(E elem, Node next) {
            this.elem = elem;
            this.next = next;
        }


    }

}
