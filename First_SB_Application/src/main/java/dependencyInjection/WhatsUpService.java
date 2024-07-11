package dependencyInjection;

import org.springframework.stereotype.Component;

@Component
public class WhatsUpService implements MessageService{

    @Override
    public void sendMessage(String message){
    	System.out.println("This is from WhatsUpService");
        System.out.println(message);
    }
}

