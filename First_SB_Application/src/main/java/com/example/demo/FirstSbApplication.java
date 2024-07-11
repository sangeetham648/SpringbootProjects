package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.customer.Customer;

import dependencyInjection.MessageSender;
import dependencyInjection.MessageSender1;
import dependencyInjection.MessageSender2;
import dependencyInjection.MessageSender3;
import dependencyInjection.MessageSender4;

@SpringBootApplication(scanBasePackages = { "com" })
public class FirstSbApplication {

	public static void main(String[] args) {
		
		System.out.println("welcome to SpringBoot application");
		
		ConfigurableApplicationContext context = SpringApplication.run(FirstSbApplication.class, args);
		
//		Customer c = context.getBean(Customer.class);
//		Customer c = context.getBean(Customer.class,"Sangeetha","Erode"); not able to pass value to constructor
//		c.display();
		
		String message = "Hi, good morning have a nice day!.";
	
		MessageSender messageSender = context.getBean(MessageSender.class);
        messageSender.sendMessage(message);
        
//		MessageSender1 messageSender1 = context.getBean(MessageSender1.class);
//        MessageSender2 messageSender2 = context.getBean(MessageSender2.class);
//        MessageSender3 messageSender3 = context.getBean(MessageSender3.class);
//        MessageSender4 messageSender4 = context.getBean(MessageSender4.class);
//        
//       
//        messageSender1.sendMessage("message1");
//        messageSender2.sendMessage("message2");
//        messageSender3.sendMessage("message3");
//        messageSender4.sendMessage("message4");
	}

}
