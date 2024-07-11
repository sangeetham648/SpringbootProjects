package dependencyInjection;

import org.springframework.stereotype.Component;

@Component("smsSService")
public class SMSService implements MessageService{

    @Override
    public void sendMessage(String message){
    	System.out.println("This is fro SMS service");
        System.out.println(message);
    }
}
