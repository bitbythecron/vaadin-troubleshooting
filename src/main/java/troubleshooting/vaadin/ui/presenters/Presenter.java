package troubleshooting.vaadin.ui.presenters;

import troubleshooting.vaadin.ui.views.View;

import javax.annotation.PostConstruct;

public abstract class Presenter<VIEW extends View> {

    private VIEW view;

    public Presenter(VIEW view) {
        this.view = view;
    }

    @PostConstruct
    public abstract void init();

    public VIEW getView() {
        return view;
    }

    public void setView(VIEW view) {
        this.view = view;
    }
}
