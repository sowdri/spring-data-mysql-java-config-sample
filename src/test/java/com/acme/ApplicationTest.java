package com.acme;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.ApplicationConfig;

/**
 * @author TODO
 */
public class ApplicationTest {

	@Test
	public void bootstrapsApplication() {
		new AnnotationConfigApplicationContext(ApplicationConfig.class);
	}
}
