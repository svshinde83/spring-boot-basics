package test.example;

import org.junit.After;
import org.junit.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import test.example.ws.AbstractControllerTest;
import test.example.ws.service.GreetingService;


/**
 * Created by svshinde83 on 24/01/2017.
 */
@Transactional
public class ApplicationTest extends AbstractControllerTest {


    @Autowired
    private GreetingService service;


    @Before
    public void setUp() {
    }

    @After
    public void after() {
    }


}