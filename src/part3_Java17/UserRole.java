package part3_Java17;

public sealed interface UserRole permits AdminRole, CustomerRole{
    String getRoleName();
    String permissionSummary();
}
