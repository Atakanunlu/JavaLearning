package part3_Java17;

public class UserService {

    public String buildWelcomeMessage(Object obj){
        if (obj instanceof User user){
            return "Hoş geldin " + user.name() + "rolün " + user.role();
        }else {
            return "Kullanıcı bulunamadı.";
        }
    }

    public int calculateDiscountPercent(AccountStatus status){
        return switch (status){
            case ACTIVE -> 10;
            case PENDING -> 3;
            case BLOCKED -> 0;
        };

    }

    public String buildInsertSql(User user){
        return """
                INSERT INTO users (id,name,role,status)
                VALUES ('%s','%s','%s','%s');
                """.formatted(
                        user.id(),
                user.name(),
                user.role().getRoleName(),
                user.status().name()
        );
    }
}
