package com.teradata.socialvantage.service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class AsyncServiceTest {

	@Autowired
	private AsyncService asyncService;
	
	@Test
	public void test() {
		asyncService.getGoogleSearch("smartphones");
	}

}
