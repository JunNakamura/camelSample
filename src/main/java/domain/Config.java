package domain;

import java.util.Optional;

/**
 * Created by nakamurajun on 2015/05/06.
 */
public class Config {

    private static Optional<Integer> port;

    public static int getPort() {
        return getIntFromProperty("http.port", port, 9000);
    }

    private static Optional<Integer> hawtioPort;

    public static int getHawtioPort() {
       return getIntFromProperty("hawtio.port", hawtioPort, 8088);
    }

    private static int getIntFromProperty(String propertyKey, Optional<Integer> maybeValue, int defaultValue) {
        if (maybeValue == null) {
            String property = System.getProperty(propertyKey);
            try {
                Integer number = Integer.valueOf(property);
                maybeValue = Optional.ofNullable(number);
            } catch (NumberFormatException e) {
                maybeValue = Optional.empty();
            }
        }
        return maybeValue.orElse(defaultValue);
    }


}
