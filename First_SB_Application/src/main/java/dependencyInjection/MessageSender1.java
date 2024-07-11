package dependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MessageSender1 {

//	 private MessageService messageService;
//
//	    private MessageService smsService;
//
//	    // @Autowired
//	    public MessageSender1(@Qualifier("smsService") MessageService messageService){
//	        this.messageService = messageService;
//	        System.out.println("constructor based dependency injection 1");
//	    }
//
//	    @Autowired
//	    public MessageSender1(@Qualifier("emailService") MessageService messageService,
//	                         MessageService smsService){
//	        this.messageService = messageService;
//	        this.smsService = smsService;
//	        System.out.println("constructor based dependency injection 2");
//	    }
//
//
//	    public void sendMessage(String message){
//	        this.messageService.sendMessage(message);
//	        this.smsService.sendMessage(message);
//	    }
	    
}