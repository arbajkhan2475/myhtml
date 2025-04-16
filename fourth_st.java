
// 2). Implement Runnable Inteface

class B implements Runnable {

    public void run() {

        try {

            for (int i = 0; i <= 5; i++) {

                System.out.println("Hello Arbaj");
                Thread.sleep(1000); // sleep means rest
            }

        }

        catch (Exception e) {

            System.out.println("Error Aaaye toh handle ker lena.");
        }

    }

}

public class fourth_st {

    public static void main(String[] args) throws Exception {

        B obj = new B();

        Thread basit = new Thread(obj);

        basit.start();

        for (int i = 0; i <= 5; i++) {

            System.out.println("Hello Rohit");
            Thread.sleep(1000);
        }

    }

}
