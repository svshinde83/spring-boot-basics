package com.abc.example;

import com.abc.example.ws.AbstractControllerTest;
import com.abc.example.ws.service.GreetingService;
import org.junit.After;
import org.junit.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;


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