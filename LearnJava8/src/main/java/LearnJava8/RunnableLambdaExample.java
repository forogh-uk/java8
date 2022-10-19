package LearnJava8;

public class RunnableLambdaExample {

    public static void main(String[] args) {
        //psvm short cut

        //interface

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runable: ");

            }
        };
        new Thread(runnable).start();
        //java 8

        //() -> {}s

        Runnable runableLambda=()-> System.out.println("Inside lambda runnable");

        new Thread(runableLambda).start();

        new Thread(() -> System.out.println("inside Runnable 2")).start();
    }

}
