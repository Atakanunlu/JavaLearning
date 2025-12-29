package part3_Java17;

public final class CustomerRole implements UserRole {
    @Override
    public String getRoleName() {
        return "USER";
    }

    @Override
    public String permissionSummary() {
        return """
                - Kendi profilini görebilir.
                - Siparişlerini görebilir.
                - Destek talebi oluşturabilir.
                """;
    }
}
