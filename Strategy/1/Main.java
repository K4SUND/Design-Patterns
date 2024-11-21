public class Main{
    public static void main(String[] args) {
        //1. Bubble sort
        Strategy strategy = new BubbleSort();

        // mehemat krnna puluwn ne
        // strategy.doOperation();


        Context context = new Context();
        context.setStragy(strategy);
        context.performSort();
        
        //2. Quick sort
        strategy = new Quicksort();
        context.setStragy(strategy);
        context.performSort();

        //3. Merge sort
        strategy = new MergeSort();
        context.setStragy(strategy);
        context.performSort();
    }
}