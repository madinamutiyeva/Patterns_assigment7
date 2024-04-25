package Chain_of_Responsibility;

public class NetworkSupportHandler implements SupportHandler {
    private SupportHandler nextHandler;

    @Override
    public void handleRequest(SupportRequest request) {
        if (request.getType() == SupportRequest.Type.NETWORK) {
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        } else {
            System.out.println("No handler available to handle this request.");
        }
    }

    public void setNextHandler(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public String toString() {
        return "NetworkSupportHandler{" +
                "nextHandler=" + nextHandler +
                '}';
    }
}