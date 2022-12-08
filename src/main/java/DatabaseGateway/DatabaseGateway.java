package DatabaseGateway;

import MakeRequestUseCase.RequestRequest;
import RegisterUseCase.RegisterDBRequest;
import entities.Request;
import entities.User;

import java.util.HashMap;

public interface DatabaseGateway {
    boolean validateAndLogin(String email, String password);

    boolean exists(String email);
    void save(RegisterDBRequest request);

    String storeRequestInfo(Request requestRequest);

    boolean assignClosestDriver(String requestID);

    HashMap<String, Object> getLoggedInUser();

    boolean updateUser(User user);
}
