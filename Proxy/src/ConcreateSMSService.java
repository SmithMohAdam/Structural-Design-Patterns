public class ConcreateSMSService extends SMSService{
    @Override
    public String sendSMS(String senderNumber, String receiverNumber, String msg) {
        return "Message : " + msg + " From Number : "+senderNumber + " To receiver : "+receiverNumber;
    }
}
