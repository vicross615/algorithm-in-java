package algorithms;

public class Main {

    public static void main(String[] args) {
        IntStack intStack = new IntStack();

        if(!intStack.isFull()){
            intStack.push(2);
            intStack.push(5);
            intStack.push(9);
            intStack.push(23);

        }

        System.out.println(intStack.pop());
    }
}
