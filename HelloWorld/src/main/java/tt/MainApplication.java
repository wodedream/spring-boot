package tt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import tt.beans.Person;
import tt.beans.Pet;

@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);
        Person person = run.getBean("person1",Person.class);
        Pet pet3 = run.getBean("pet1", Pet.class);

        System.out.println(pet3.toString());
    }
}
