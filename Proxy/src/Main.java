public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        SMSProxy proxy = new SMSProxy();
        String ms1 =  proxy.sendSMS("123","2222", "Message 1");
        String ms2 = proxy.sendSMS("123","2222", "Message 2");
        String ms3 = proxy.sendSMS("123","2222", "Message 3");
        String ms4 =  proxy.sendSMS("123","2222", "Message 4");
        System.out.println(ms1);
        System.out.println(ms2);
        System.out.println(ms3);
        System.out.println(ms4);
    }
}