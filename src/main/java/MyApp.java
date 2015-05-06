import domain.user.UserRouteBuilder;
import org.apache.camel.spring.Main;

/**
 * Created by nakamurajun on 2015/05/06.
 */
public class MyApp {

    private MyApp() {

    }

    public static void main(String[] args) throws Exception {
        System.out.println("---start!---");
        Main main = init();
        main.run();
    }

    private static Main init() {
        Main main = new Main();
        main.enableHangupSupport();
        //main.addRouteBuilder(new UserRouteBuilder());
        return main;
    }
}