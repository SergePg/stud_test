package ua.org.pius.studtrain.ui;

import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.UI;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by SKulik on 23.06.2016.
 */
@Component
@Scope("prototype")
@Theme("testingTheme")
public class Testing extends UI {
    @Override
    protected void init(VaadinRequest vaadinRequest) {

    }
}
