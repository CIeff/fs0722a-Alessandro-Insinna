package jdbcspring.dbspring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import jdbcspring.dbspring.model.User;

@Configuration
public class UserConfiguration {
    
    @Bean
    @Scope("prototype")
    public User testUser() {
        return new User("Mario","Rossi","Roma",30,"ma.rio@rossi.issi");
    }

}
