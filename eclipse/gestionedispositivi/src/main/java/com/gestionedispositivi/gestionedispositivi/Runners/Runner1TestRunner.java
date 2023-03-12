package com.gestionedispositivi.gestionedispositivi.Runners;

import com.gestionedispositivi.gestionedispositivi.Services.DeviceService;
import com.gestionedispositivi.gestionedispositivi.Services.UserService;
import com.gestionedispositivi.gestionedispositivi.auth.entity.ERole;
import com.gestionedispositivi.gestionedispositivi.auth.entity.Role;
import com.gestionedispositivi.gestionedispositivi.auth.entity.User;
import com.gestionedispositivi.gestionedispositivi.auth.repository.RoleRepository;
import com.gestionedispositivi.gestionedispositivi.models.Device;
import com.gestionedispositivi.gestionedispositivi.models.DeviceStatus;
import com.gestionedispositivi.gestionedispositivi.models.DeviceType;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner1TestRunner implements ApplicationRunner {

    @Autowired 
    private UserService userService;
    
    @Autowired 
    private DeviceService deviceService;

    @Autowired 
    RoleRepository roleRepository;

    public void run(ApplicationArguments args) throws Exception {
      Role adminRole = new Role();
      adminRole.setRoleName(ERole.ROLE_ADMIN);
      roleRepository.save(adminRole);

      Set<Role> roles = new HashSet<>();
      roles.add(adminRole);
      
      // Create a new user with an admin role
      User user1 = new User();
      user1.setName("Gino");
      user1.setUsername("RinoFino");
      user1.setEmail("Gino@Rino.Fino");
      user1.setPassword("ginetto12");
      user1.setRoles(roles);
        
      // Save the user to the database
      userService.saveUser(user1);

      // Create a new device
      Device device1 = new Device();
      device1.setDeviceType(DeviceType.SMARTPHONE);
      device1.setDeviceStatus(DeviceStatus.DISPOSITIVO_ASSEGNATO);
      device1.setUser(user1);
      deviceService.save(device1);
    }
}