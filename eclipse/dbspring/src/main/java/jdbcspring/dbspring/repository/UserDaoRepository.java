package jdbcspring.dbspring.repository;

import jdbcspring.dbspring.model.User;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface UserDaoRepository {

    public void createUser(User user);
    public void updateUser(User user);
    public void removeUser(Long id);
    public User getUserById(Long id);
    public List<User> getAllUsers();
    
}
