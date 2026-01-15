//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Thread thread = new NewThread();

        thread.setName("Jean-Gomis-thread ");
        thread.start();

    }


    private static class NewThread extends Thread {

       @Override
        public void run() {
            System.out.println(" Hello from " + Thread.currentThread().getName());
            //on peut aussi raccourcir avec
           System.out.println(" Hello from " + this.getName());
        }


    }

}