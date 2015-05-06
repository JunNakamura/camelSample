import domain.Config;
import io.hawt.embedded.Main;

/**
 * Created by nakamurajun on 2015/05/06.
 */
public class EmbeddedHawtio {

    public static void run() throws Exception {
        System.setProperty("hawtio.authenticationEnabled", "false");
        Main main = new Main();
        main.setWarLocation("src/main/resources/webapp/hawtio.war");
        main.setPort(Config.getHawtioPort());
        main.run();
    }
}
