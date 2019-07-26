package troubleshooting.vaadin.ui.layouts;

import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.orderedlayout.FlexLayout;
import com.vaadin.flow.component.page.Viewport;
import com.vaadin.flow.router.AfterNavigationEvent;
import com.vaadin.flow.router.AfterNavigationObserver;
import com.vaadin.flow.router.RouterLayout;
import com.vaadin.flow.server.InitialPageSettings;
import com.vaadin.flow.server.PWA;
import com.vaadin.flow.server.PageConfigurator;

@HtmlImport("frontend://shared-styles.html")
@Viewport("width=device-width, minimum-scale=1.0, initial-scale=1.0, user-scalable=yes")
@PWA(name = "Vaadin Troubleshooting", shortName = "VT", iconPath = "images/logo-18.png", backgroundColor = "#233348", themeColor = "#233348")
public class LoginLayout extends FlexLayout implements RouterLayout, PageConfigurator, AfterNavigationObserver {

    @Override
    public void afterNavigation(AfterNavigationEvent event) {

    }

    @Override
    public void configurePage(InitialPageSettings settings) {

    }
}
