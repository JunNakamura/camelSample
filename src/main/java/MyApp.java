import domain.user.UserRouteBuilder;
import domain.user.UserService;
import org.apache.camel.main.Main;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by nakamurajun on 2015/05/06.
 */
@SpringBootApplication
public class MyApp {

    public static void main(String[] args) throws Exception {
        System.out.println("---start!---");
        Main main = init();
        main.run();
    }

    private static Main init() {
        Main main = new Main();
        main.addRouteBuilder(new UserRouteBuilder());
        main.bind("userService", new UserService());
        return main;
    }
}
