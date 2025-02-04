package solid;

//High-level modules should not depend on low-level modules; both should depend on abstractions. 
//Additionally, abstractions should not depend on details; 
//details should depend on abstractions. This principle promotes loose coupling between classes.

interface MessageService {
    void sendMessage(String message);
}

class EmailService implements MessageService {
    public void sendMessage(String message) {
        System.out.println("Email sent");
    }
}

class SmsService implements MessageService {
    public void sendMessage(String message) {
        System.out.println("SMS sent");
    }
}

public class DependencyInversion {
	
	private MessageService messageService;
	
	public DependencyInversion(MessageService messageService) {
        this.messageService = messageService;
    }

	public void notify(String message) {
        messageService.sendMessage(message);
    }
	
}
