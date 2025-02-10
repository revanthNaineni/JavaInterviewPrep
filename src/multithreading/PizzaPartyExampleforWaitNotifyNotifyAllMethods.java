package multithreading;
class PizzaShop {
    private boolean pizzaReady = false;

    // Method for friends waiting for pizza
    public synchronized void waitForPizza() {
        while (!pizzaReady) {
            try {
                System.out.println(Thread.currentThread().getName() + " is waiting for pizza...");
                wait(); // Friends wait until they’re notified
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " got the pizza and is eating!");
    }

    // Method to notify one friend that pizza is ready
    public synchronized void pizzaArrives() {
        pizzaReady = true;
        System.out.println("Pizza arrived! Notifying one friend...");
        notify(); // Notify only one friend waiting
    }

    // Method to notify all friends that pizza is ready
    public synchronized void pizzaArrivesForEveryone() {
        pizzaReady = true;
        System.out.println("Pizza arrived! Notifying all friends...");
        notifyAll(); // Notify all friends waiting
    }
}

public class PizzaPartyExampleforWaitNotifyNotifyAllMethods {
    public static void main(String[] args) throws InterruptedException {
        PizzaShop shop = new PizzaShop();

        // Friends (threads) waiting for pizza
        Thread friend1 = new Thread(shop::waitForPizza, "Friend 1");
        Thread friend2 = new Thread(shop::waitForPizza, "Friend 2");
        Thread friend3 = new Thread(shop::waitForPizza, "Friend 3");

        friend1.start();
        friend2.start();
        friend3.start();

        Thread.sleep(2000); // Simulating time before pizza arrives

        // Uncomment one of the following lines to see notify() or notifyAll() in action:
        
         shop.pizzaArrives();        // Only one friend gets notified and eats
        //shop.pizzaArrivesForEveryone(); // All friends get notified and can eat
    }
}
