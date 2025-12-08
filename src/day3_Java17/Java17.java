package day3_Java17;

public class Java17 {
    public static void main(String[] args) {

        UserRole adminRole = new AdminRole();
        UserRole customerRole = new CustomerRole();

        User admin = new User("1","Atakan",adminRole,AccountStatus.ACTIVE);
        User customer = new User("2","Ünlü",customerRole,AccountStatus.PENDING);

        UserService userService = new UserService();

        System.out.println(userService.buildWelcomeMessage(admin));
        System.out.println(userService.buildWelcomeMessage(customer));


        System.out.println("Admin indirim oranı: " + userService.calculateDiscountPercent(admin.status()) + " % ");
        System.out.println("Customer indirim oranı: " + userService.calculateDiscountPercent(customer.status())+ " % ");

        System.out.println("\n Admin icin SQL");
        System.out.println(userService.buildInsertSql(admin));

        System.out.println("\n Customer icin SQL");
        System.out.println(userService.buildInsertSql(customer));

        printRolePermission(adminRole);
        printRolePermission(customerRole);

    }

    private static void printRolePermission(UserRole role){
        System.out.println("\n Rol: " + role.getRoleName());
        System.out.println("Yetkileri: ");
        System.out.println(role.permissionSummary());
    }

}
