import java.util.ArrayList;

class MyStack {
    ArrayList<Integer> list = new ArrayList<>();

  
    public int peek() {
        return list.get(list.size() - 1);
    }

    
    public void push(int newData) {
        list.add(newData);
    }

  
    public int pop() {
        return list.remove(list.size() - 1);
    }
}

public class StackDemo {
    public static void main(String[] args) {
        MyStack stack = new MyStack();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(24);
        stack.push(11);

        System.out.println("Top element is: " + stack.peek());
        System.out.println("New Top element is: " + stack.pop());
        System.out.println("Top element after pop is: " + stack.peek());
    }
}
