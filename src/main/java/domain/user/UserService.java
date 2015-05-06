package domain.user;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by nakamurajun on 2015/05/06.
 */
public class UserService {

    //TODO
    private Map<Long, User> users = new TreeMap<Long, User>();

    public UserService() {
        users.put(1L, new User(1L, "John Smith"));
        users.put(2L, new User(2L, "L"));
        users.put(3L, new User(3L, "Mike Taylor"));
    }

    public User findById(long id) {
        return users.get(id);
    }

    public Collection<User> findAll() {
        return users.values();
    }

}
