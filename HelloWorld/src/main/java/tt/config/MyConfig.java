package tt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tt.beans.Person;
import tt.beans.Pet;

@Configuration
public class MyConfig {

    @Bean
    public Person person1(){
        return new Person("kk",15);
    }
    @Bean
    public  Pet pet1(){
        return  new Pet("cat");
    }
}
