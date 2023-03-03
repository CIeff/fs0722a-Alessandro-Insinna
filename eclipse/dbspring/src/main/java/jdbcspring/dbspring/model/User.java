package jdbcspring.dbspring.model;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    
    @Id
    private Long id;
    private String name;
    private String lastName;
    private String city;
    private int age;
    private String email;


    public User( String name, String lastName, String city, int age, String email) {
        this.name = name;
        this.lastName = lastName;
        this.city = city;
        this.age = age;
        this.email = email;
    }
    
    

}
