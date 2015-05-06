package domain;

import java.util.Optional;

/**
 * Created by nakamurajun on 2015/05/06.
 */
public class Config {

    private static Optional<Integer> port;

    public static Optional<Integer> getPort() {
        if (port == null) {
            String httpPort = System.getProperty("http.port");
            try {
                Integer portNumber = Integer.valueOf(httpPort);
                port = Optional.ofNullable(portNumber);
            } catch (NumberFormatException e) {
                port = Optional.empty();
            }
        }
        return port;
    }


}
