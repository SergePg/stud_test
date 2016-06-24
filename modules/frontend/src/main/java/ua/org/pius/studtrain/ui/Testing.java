package ua.org.pius.studtrain.ui;

import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by SKulik on 23.06.2016.
 */
@Component("testingUI")
@Scope("prototype")
@Theme("testingTheme")
public class Testing extends UI {
    @Override
    protected void init(VaadinRequest vaadinRequest) {
        VerticalLayout layout = new VerticalLayout();
        Label label = new Label("Hello world!");
        layout.setSizeFull();
        layout.addComponent(label);
        setContent(layout);
    }
}
