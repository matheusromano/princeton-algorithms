package queue.domain;

public class FixedCapcityStackOfStrings {
    private String[] s ;
    private int n = 0;

    public FixedCapcityStackOfStrings(int capacity){
        s = new String[capacity];
    }

    public boolean isEmpty(){
        return n == 0;
    }

    public void push(String item){
        s[n++] = item;
    }

    public String pop() {
        String item = s[--n];
        s[n] = null;
        return item;

    }
}
