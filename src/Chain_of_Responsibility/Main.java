package Chain_of_Responsibility;

public class Main {
    public static void main(String[] args) {
        HelpDeskTicketingSystem ticketingSystem = new HelpDeskTicketingSystem();

        SupportRequest request = new SupportRequest(1, "hardware", SupportRequest.Type.HARDWARE, SupportRequest.Priority.HIGH);

        ticketingSystem.processSupportRequest(request);
        System.out.println(ticketingSystem);
    }
}

