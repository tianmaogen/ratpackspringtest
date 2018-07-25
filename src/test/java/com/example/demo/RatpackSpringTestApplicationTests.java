package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.dao.TestBean4Mock;
import com.example.demo.dao.TestBean4Mock1;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RatpackSpringTestApplicationTests {

	@MockBean
	private TestBean4Mock testBean4Mock;
	@MockBean
	private TestBean4Mock1 testBean4Mock1;

	@Test
	public void contextLoads() {
	}

}
