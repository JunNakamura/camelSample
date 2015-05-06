import domain.Config;
import domain.user.UserRouteBuilder;
import org.apache.camel.spring.Main;

import java.util.Optional;

/**
 * Created by nakamurajun on 2015/05/06.
 */
public class MyApp {

    private MyApp() {

    }

    public static void main(String[] args) throws Exception {
        EmbeddedHawtio.run();

        Main main = init();
        main.run();
    }

    private static Main init() {
        Main main = new Main();
        main.enableHangupSupport();
        return main;
    }
}
