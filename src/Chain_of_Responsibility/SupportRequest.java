package Chain_of_Responsibility;

// Класс для представления обращений в службу поддержки
public class SupportRequest {
    private int id;
    private String description;
    private Type type;
    private Priority priority;

    public SupportRequest(int id, String description, Type type, Priority priority) {
        this.id = id;
        this.description = description;
        this.type = type;
        this.priority = priority;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public Type getType() {
        return type;
    }

    public Priority getPriority() {
        return priority;
    }

    // Типы обращений
    public enum Type {
        HARDWARE, SOFTWARE, NETWORK
    }

    // Приоритеты обращений
    public enum Priority {
        LOW, MEDIUM, HIGH
    }
}
