package domain.user;

/**
 * Created by nakamurajun on 2015/05/06.
 */
public class User {

    public final Long id;

    public final String name;

    User(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
