package troubleshooting.vaadin.ui.presenters;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import troubleshooting.vaadin.ui.views.LoginView;

@Component
@Slf4j
public class LoginPresenter extends Presenter<LoginView> {

//    @Autowired
//    private LoginModel loginModel;

    @Autowired
    public LoginPresenter(LoginView view) {
        super(view);
    }

    @Override
    public void init() {

        getView().setPresenter(this);

    }

    public void login() {

        String username = getView().getUsername();
        String password = getView().getPassword();

        log.info("Logging in with username = {} and password = {}", username, password);

    }

}
