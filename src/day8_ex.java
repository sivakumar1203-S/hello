  public class day8_ex {

   
    sealed interface LoginResult permits LoginSuccess, LoginFailure, LoginLoading {

    }
    record LoginSuccess(String time) implements LoginResult {

    }
    record LoginFailure(String reason)  implements LoginResult {

    }

    record LoginLoading(String expectedTime)  implements LoginResult {

    }

    record Random(String reason){

    }

    static void handleLogin(LoginResult result) {
        switch (result) {
            case LoginSuccess success -> System.out.println("Login Success at : " + success.time());
            case LoginFailure failure -> System.out.println("Login Failure because of : " + failure.reason());
            case LoginLoading loading -> System.out.println("Login Loading : " + loading.expectedTime());
        }
    }

        static void main() {
        LoginResult LoginSuccess = new LoginSuccess("2026-06-13:06:13:53");
        LoginResult LoginFailure = new LoginFailure("network issue");
        LoginResult LoginLoading = new LoginLoading("Check after 7 hours");

        handleLogin(LoginSuccess);
        handleLogin(LoginFailure);
        handleLogin(LoginLoading);
    }
}