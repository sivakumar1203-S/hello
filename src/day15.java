public class day15 {
    static void main() throws InterruptedException{
        Runnable chefTask = () -> {
            String[] items = {"Meals", "Rotti", "Briyani"};
            for (int i = 0; i < items.length; i++) {
                System.out.println("Cooking Items : " + items[i]);
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Thread chefThread = new Thread(chefTask, "chef_thread");
        chefThread.start();
        chefThread.join();
    }
}