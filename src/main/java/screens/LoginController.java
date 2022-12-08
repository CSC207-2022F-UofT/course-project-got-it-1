package screens;
import LoginUseCase.LoginInputBoundary;
import LoginUseCase.LoginRequest;

/**
 * Calls the interactor to handle the user login function
 */
public class LoginController implements Controller {

    final LoginInputBoundary inputBoundary;
    public LoginController(LoginInputBoundary inputBoundary){
        this.inputBoundary = inputBoundary;
    }

     public void login(String username, String password){
        LoginRequest request = new LoginRequest(username, password);
        inputBoundary.login(request);
    }
}
