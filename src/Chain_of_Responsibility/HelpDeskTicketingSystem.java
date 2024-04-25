package Chain_of_Responsibility;

public class HelpDeskTicketingSystem {
    private SupportHandler supportHandler;

    public HelpDeskTicketingSystem() {
        HardwareSupportHandler hardwareHandler = new HardwareSupportHandler();
        SoftwareSupportHandler softwareHandler = new SoftwareSupportHandler();
        NetworkSupportHandler networkHandler = new NetworkSupportHandler();
        hardwareHandler.setNextHandler(softwareHandler);
        softwareHandler.setNextHandler(networkHandler);

        supportHandler = hardwareHandler;
    }

    public void processSupportRequest(SupportRequest request) {
        supportHandler.handleRequest(request);
    }

    @Override
    public String toString() {
        return "HelpDeskTicketingSystem{" +
                "supportHandler=" + supportHandler +
                '}';
    }
}
