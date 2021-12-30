// array based java implementation of Stack 

import java.util.EmptyStackException;

public class ArrayStack<E> implements Stack<E> {
    protected int capacity;
    public static final int capac = 1000;
    protected E S[];
    protected int top = -1;
    
    
    public ArrayStack(){
        this(capac);
    }
    public ArrayStack(int cap){
        capacity = cap;
        S = (E[]) new Object[capacity];
    }


    public int size(){
        return (top + 1);
    }

    public boolean isEmpty(){
        return (top < 0);
    }

    public void push(E element) throws Error {
        if (size() == capacity){
            throw new Error("Stack is full");
        }
        S[++top] = element;
    }

    public E top() throws EmptyStackException{
        if (isEmpty()){
            throw new EmptyStackException();
        }
        return S[top];
    }

    public E pop() throws EmptyStackException{
        E element;
        if (isEmpty()){
            throw new EmptyStackException();
        }
        element = S[top];
        S[top--] = null;
        return element;
    }

    public String toString(){
        String s;
        s = "[";
        if(size() > 0) {
            s+= S[0];
        }
        if(size() > 1){
            for(int i=1; i<= size()-1; i++){
                s += "," + S[i];
            }
        }
        return s + "]";
    }

    public void status(String op, Object element){
        System.out.print("----> " + op);
        System.out.println(" , returns " + element);
        System.out.print("result: size = " + size() + ", isEmpty= " + isEmpty());
        System.out.println(", stack: " + this);
    }
}
