package dbspring2.jpa.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import dbspring2.jpa.model.User;

@Repository
public interface UserDaoRepository extends CrudRepository<User,Long> {
    
    public List<User> findByCity(String cityString);

    public List<User> findByAgeBetween(Integer min, Integer max);

    public List<User> findByNameAndLastName(String name, String lastname);

}
