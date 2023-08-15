public class Main {
    public static void main(String[] args) {
        Worker.OnTaskDoneListener doneListener = System.out::println;
        Worker.OnTaskErrorListener errorListener = System.err::println;

        Worker worker = new Worker(doneListener, errorListener);
        worker.start();
    }
}