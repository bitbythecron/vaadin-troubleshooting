package troubleshooting.vaadin.ui.views;

import com.vaadin.flow.component.Component;
import troubleshooting.vaadin.ui.presenters.Presenter;

public interface View<PRESENTER extends Presenter> {

    public void clear();

    public Component asComponent();

    public void setPresenter(PRESENTER presenter);

}
