package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import mockit.Expectations;
import mockit.Mocked;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoJmockitApplicationTests {

	private static Logger log = LoggerFactory.getLogger(DemoJmockitApplicationTests.class);
	
	@Mocked
	ClassB classB;
	
	@Test
	public void testMockedWithNewOperatorInstance() {
		
		new Expectations() {{
	        classB.getGrettings(); result = "Hello from mocked ClassB";
	    }};
	    
		ClassA classA = new ClassA();
		
		log.info("ClassA: {}", classA.getMessage());
		log.info("ClassA type: {}", classA.getType());
		
	}

}
