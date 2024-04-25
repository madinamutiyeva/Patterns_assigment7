package Proxy_Design_Pattern;

public interface DocumentService {
    Document downloadDocument(String documentId, String userId);

    void uploadDocument(Document document, String userId);

    void editDocument(Document document, String userId);
}