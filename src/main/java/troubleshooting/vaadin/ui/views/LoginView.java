package troubleshooting.vaadin.ui.views;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.FlexLayout;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.ParentLayout;
import com.vaadin.flow.router.Route;
import troubleshooting.vaadin.ui.layouts.LoginLayout;
import troubleshooting.vaadin.ui.presenters.LoginPresenter;

@org.springframework.stereotype.Component
@Route(value = "", layout = LoginLayout.class)
@ParentLayout(LoginLayout.class)
@PageTitle("Login")     // TODO: <--- i18n ???
public class LoginView implements View<LoginPresenter> {

    @Id("lblUsername")
    private Label lblUsername;

    @Id("lblPassword")
    private Label lblPassword;

    @Id("txtUsername")
    private TextField txtUsername;

    @Id("pwdPassword")
    private PasswordField pwdPassword;

    @Id("btnLogin")
    private Button btnLogin;

    private LoginPresenter presenter;

    // TODO: How to add all the components above to this?
    private FlexLayout loginPanelContainer;

    // TODO: How to connect this in the UI layer?
    public void login() {
        presenter.login();
    }

    public String getUsername() {
        return txtUsername.getValue();
    }

    public String getPassword() {
        return pwdPassword.getValue();
    }

    @Override
    public void clear() {
        txtUsername.clear();
        pwdPassword.clear();
    }

    @Override
    public Component asComponent() {
        return loginPanelContainer;
    }

    @Override
    public void setPresenter(LoginPresenter presenter) {
        this.presenter = presenter;
    }
}
