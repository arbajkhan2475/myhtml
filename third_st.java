
// Multithreading 

// 2 Methods of multithreading.

// 1). Extends Thread Class
// 2). Implement runnable interface

// 1). Extend Thread Class

class A extends Thread {

    public void run() {

        try {

            for (int i = 0; i <= 5; i++) {

                System.out.println("Hello Arbaj.");
                Thread.sleep(1000);
            }

        }

        catch (Exception e) {

            System.out.println("Error Aaaye toh handle ker lena.");
        }

    }

}

public class third_st {

    public static void main(String[] args) throws Exception {

        A obj = new A();

        obj.start();

        for (int i = 0; i <= 5; i++) {

            System.out.println("Hello Aayush.");
            Thread.sleep(1000);
        }

    }

}
