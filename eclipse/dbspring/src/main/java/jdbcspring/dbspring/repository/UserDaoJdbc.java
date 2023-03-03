package jdbcspring.dbspring.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import jdbcspring.dbspring.model.User;

@Component
public class UserDaoJdbc implements UserDaoRepository{
    
    @Autowired
    JdbcTemplate jdbcTemplate;


    @Override
    public void createUser(User user){
        String sql="INSERT INTO users (name,lastname,city,age,email)"
                    +"VALUES(?,?,?,?,?)";
        jdbcTemplate.update(
            sql,
            user.getName(),
            user.getLastName(),
            user.getCity(),
            user.getAge(),
            user.getEmail()
        );
        
    };

    @Override
    public void updateUser(User user){
        String sql= "UPDATE users SET name= ?,"
            +"lastname= ?, city=?,"
            +"age=?, email=?";
        jdbcTemplate.update(
            sql,
            user.getName(),
            user.getLastName(),
            user.getCity(),
            user.getAge(),
            user.getEmail()
        );
        
    };

    @Override
    public void removeUser(Long id){
        String sql="DELETE FROM users WHERE id =?";
        jdbcTemplate.update(sql,id);
    };

    @Override
    public User getUserById(Long id){
        String sql="SELECT * FROM users WHERE id=?";
        User u=jdbcTemplate.queryForObject(sql, new UserRowMapper(), id);
        return u;
    };

    @Override
    public List<User> getAllUsers(){
        String sql="SELECT * FROM users";
        List<User> us=jdbcTemplate.query(sql, new UserRowMapper());
        return us;
    };
}
