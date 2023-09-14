package exam01;

public class LoginService {

    private static LoginService instance;   // 정적으로 변경

    private LoginService() {}

    public static LoginService getInstance() {
        if (instance == null) { // 필요할 때 처음에만 만들고 이후에 공유 가능하게 만듦 (singleton pattern)
            instance = new LoginService();
        }
        return instance;
    }
}
