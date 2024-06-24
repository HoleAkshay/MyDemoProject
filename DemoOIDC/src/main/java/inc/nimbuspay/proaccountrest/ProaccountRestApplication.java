package inc.nimbuspay.proaccountrest;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication
@RestController
@EnableMethodSecurity
public class ProaccountRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProaccountRestApplication.class, args);
	}

    
    @GetMapping("/home")
    @PreAuthorize("hasRole('Admin')")
    public String getHome (){  
            Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        System.out.println("Principle : "+authentication.getPrincipal());
        System.out.println("Authorities: " + authentication.getAuthorities());
         return "Hello";
    }


//     @EnableMethodSecurity
//     public class MethodSecurityConfig {
       
//    }
   


}
