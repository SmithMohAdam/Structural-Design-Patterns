import java.util.HashMap;
import java.util.Map;

public class SMSProxy {

    private ConcreateSMSService concreateSMSService;

    Map<String , Integer> count = new HashMap<String, Integer>();

    public String sendSMS(String senderNumber , String receiverNumber , String msg){

        if(concreateSMSService == null){
            concreateSMSService = new ConcreateSMSService();
        }
        if(!count.containsKey(senderNumber)){
            count.put(senderNumber,1);
            return concreateSMSService.sendSMS(senderNumber,receiverNumber,msg);
        }else {
            int val = count.get(senderNumber);
            System.out.println("The count value is : "+val);
            if (val>=3){
                return  "The customer exceed the limit ";
            }else {
                count.replace(senderNumber,val+1);
                return concreateSMSService.sendSMS(senderNumber,receiverNumber,msg);
            }

        }

    }
}
