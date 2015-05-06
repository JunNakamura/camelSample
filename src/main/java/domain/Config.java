package domain;

import java.util.Optional;

/**
 * Created by nakamurajun on 2015/05/06.
 */
public class Config {

    private static Optional<Integer> port = Optional.empty();;

    public static Optional<Integer> getPort() {
        return port;
    }

    public static void init(String[] args) {
        if (args != null && args.length > 0) {
            try {
                Integer argsPort = Integer.valueOf(args[0]);
                port = Optional.ofNullable(argsPort);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }

        }
    }
}
