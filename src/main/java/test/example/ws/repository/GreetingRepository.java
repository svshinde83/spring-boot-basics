package test.example.ws.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import test.example.ws.model.Greeting;

/**
 * Created by svshinde83 on 24/01/2017.
 */
@Repository
public interface GreetingRepository extends JpaRepository<Greeting, Long> {

}
