package com.abc.example.ws.repository;

import com.abc.ws.model.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by svshinde83 on 24/01/2017.
 */
@Repository
public interface GreetingRepository extends JpaRepository<Greeting, Long> {

}
