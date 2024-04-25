package Proxy_Design_Pattern;

public class DocumentServiceImpl implements DocumentService {
    @Override
    public Document downloadDocument(String documentId, String userId) {
        return new Document(documentId, "Document Title", "Document Content");
    }

    @Override
    public void uploadDocument(Document document, String userId) {
    }

    @Override
    public void editDocument(Document document, String userId) {
    }
}