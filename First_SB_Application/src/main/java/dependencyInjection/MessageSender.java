package dependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {

//	@Autowired
//	@Qualifier("emailService")
//	private MessageService messageService;
//
//	@Autowired
//	private MessageService smsSService;
//
//	@Autowired
//	private MessageService whatsUpService;
//
//	public void sendMessage(String message) {
//		this.messageService.sendMessage(message); // This email
//		this.smsSService.sendMessage(message); // This SMS
//		this.whatsUpService.sendMessage(message); // This WHATS up
//	}

	
	  private MessageService messageService;
//	  
//	  @Autowired public void setMessageService(@Qualifier("emailService")
//	  MessageService messageService) { this.messageService = messageService;
//	  System.out.println("setter based dependency injection"); }
//	  
//	  public void sendMessage(String message){
//	  this.messageService.sendMessage(message); }
//	  
	 
	
	   @Autowired 
	   public MessageSender(@Qualifier("emailService") MessageService messageService){ 
		   this.messageService = messageService;
		   System.out.println("constructor based dependency injection"); 
	  }
	  
	
	/*
	 * @Autowired public MessageSender(@Qualifier("emailService") MessageService
	 * messageService, MessageService smsService) { this.messageService =
	 * messageService; this.smsService = smsService;
	 * System.out.println("constructor based dependency injection 2"); }
	 */
	  public void sendMessage(String message) {
	  this.messageService.sendMessage(message); //Email service
//	  this.smsService.sendMessage(message); 
	  }//SMS service }
	 	 

}

//TO run
/*
 * String message = "Hi, good morning have a nice day!."; ApplicationContext
 * applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
 * 
 * MessageSender messageSender =
 * applicationContext.getBean(MessageSender.class);
 * messageSender.sendMessage(message);
 */