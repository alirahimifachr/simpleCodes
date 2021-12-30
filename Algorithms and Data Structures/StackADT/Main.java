// test of stacks

public class Main {
    public static void main(String[] args) {
        Object o;
        ArrayStack<Integer> A = new ArrayStack<Integer>();
        A.status("new ArrayStack<Integer> A", null);
        
        A.push(77);
        A.status("A.push(77)", null);
        
        A.push(88);
        A.status("A.push(88)", null);
        
        o = A.pop();
        A.status("A.pop()", o);

        A.push(55);
        A.status("A.push(55)", null);

        A.push(99);
        A.status("A.push(55)", null);

        A.push(33);
        A.status("A.push(55)", null);

        ArrayStack<String> B = new ArrayStack<String>();
        B.status("new ArrayStack<String> B", null);

        B.push("AAA");
        B.status("B.push(AAA)", null);

        B.push("CCC");
        B.status("B.push(CCC)", null);

        o = B.pop();
        B.status("B.pop()", o);

        B.push("Babe");
        B.status("B.push(Babe)", null);
    }
}
