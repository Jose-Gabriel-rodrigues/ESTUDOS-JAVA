package Lambdas;

public class Threads {
    public static void main(String[] args) {

        // resolução da aula 191 //
        Runnable trabalho1 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Tarefa #01");
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                    }
                }
            }
        };

        Runnable trabalho2 = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Tarefa #02");
                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                }
            }
        };

        Runnable trabalho3 = Threads::trabalho3;

        Thread t1 = new Thread(trabalho1);
        Thread t2 = new Thread(trabalho2);
        Thread t3 = new Thread(trabalho3);

        t1.start();
        t2.start();
        t3.start();
    }

    static void trabalho3() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Tarefa #03");
            try {
                Thread.sleep(100);
            } catch (Exception e) {
            }
        }
    }
}
