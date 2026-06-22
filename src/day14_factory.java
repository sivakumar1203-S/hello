public class day14_factory {
    interface Notification {
        void send(String to, String message);
    }
    class EmailNotification implements Notification{
        @Override
        public void send(String to, String message) {
            System.out.println("Sending Email: "+message +", to "+to);
        }
    }
    class InstaNotification implements Notification{
        @Override
        public void send(String to, String message) {
            System.out.println("Sending Insta: "+message +", to "+to);
        }
    }
    static Notification getnotification(day14_factory factory, String type){
        return switch (type){
            case "Email"-> factory.new EmailNotification();
            case "Insta"-> factory.new InstaNotification();
            default ->throw new IllegalArgumentException("Invalid notification type: "+type);
        };
    }
    static void main() {
        day14_factory factory = new day14_factory();
        String type = "Insta";
        getnotification(factory, type).send("23674890","Hello World");
    }
}