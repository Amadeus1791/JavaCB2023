package unit13;

public class CharacterStack {
    private char[] stack;
    private int size;
    private int topIndex;
    // private int standardSize;


    public CharacterStack(int size) {
        this.size = size;
        topIndex = -1;
        this.stack = new char[size];
    }

    public void push(char c) {
        topIndex++; //index 0
        if (isFull()) {
            throw new IllegalArgumentException("stack overflow, sorry!!!");
        }
        stack[topIndex] = c;
    }

    public char pop() {
        if (isEmpty()) {
            throw new IllegalArgumentException("stack underflow, aetsch!");
        }
        //   return stack[topIndex--];
        char temp = stack[topIndex];
        topIndex--;
        return temp;
    }

    public char peek() {
        if (isEmpty()) {
            throw new IllegalArgumentException("stack underflow, aetsch!");
        }
        return stack[topIndex];
    }

    public boolean isEmpty() {
        return topIndex == -1;
    }

    public boolean isFull() {
        return topIndex >= size;
    }

    @Override
    public String toString() {
        String newString = "";
        if (isEmpty()) {
            newString += "your stack is empty";
        } else {
            for (int i = topIndex; i >= 0; i--) {
                newString += stack[i] + "\n";
            }
        }
        return newString;
    }
}
