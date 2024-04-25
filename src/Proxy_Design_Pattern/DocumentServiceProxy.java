package Proxy_Design_Pattern;

public class DocumentServiceProxy implements DocumentService {
    private DocumentService documentService;

    public DocumentServiceProxy(DocumentService documentService) {
        this.documentService = documentService;
    }

    @Override
    public Document downloadDocument(String documentId, String userId) {

        if (checkAccess(documentId, userId)) {
            return documentService.downloadDocument(documentId, userId);
        } else {
            throw new SecurityException("Access denied");
        }
    }
    @Override
    public void uploadDocument(Document document, String userId) {
        documentService.uploadDocument(document, userId);
    }

    @Override
    public void editDocument(Document document, String userId) {
        documentService.editDocument(document, userId);
    }

    private boolean checkAccess(String documentId, String userId) {
        return true;
    }
}