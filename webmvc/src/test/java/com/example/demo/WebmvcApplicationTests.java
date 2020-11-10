package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class WebmvcApplicationTests {


	
		@Test
		public void testSomar() {
			System.out.println("somar");
			int n1 =5;
			int n2 =5;
			assertEquals(n1, n2);
		}
		
		@Test
		public void testSomar2() {
			System.out.println("somar");
			int n1 =7;
			int n2 =5;
			assertEquals(n1, n2);
		}		

}
