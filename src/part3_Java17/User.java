package part3_Java17;

public record User(
        String id,
        String name,
        UserRole role,
        AccountStatus status
) {
}
