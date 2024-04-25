package Proxy_Design_Pattern;

public class Main {
    public static void main(String[] args) {
        DocumentService documentService = new DocumentServiceImpl();

        DocumentService documentServiceProxy = new DocumentServiceProxy(documentService);

        Document document = documentServiceProxy.downloadDocument("123", "user1");
    }
}