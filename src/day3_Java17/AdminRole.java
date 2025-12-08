package day3_Java17;

public final class AdminRole implements UserRole {
    @Override
    public String getRoleName() {
        return "ADMIN";
    }

    @Override
    public String permissionSummary() {
        return """
                - Sistemdeki kullanıcıları görebilir.
                - Kullanıcı ekleyip silebilr.
                - Sistem ayarlarını değiştirebilir.
                """;
    }
}
