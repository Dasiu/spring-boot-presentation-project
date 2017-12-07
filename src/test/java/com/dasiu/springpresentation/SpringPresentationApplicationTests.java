package com.dasiu.springpresentation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringPresentationApplicationTests {

	@Autowired
	private HelloWorldService helloWorldService;

	@Test
	public void shouldReturnHelloWorldManualVersion() {
		// given
		String str = "hello world";

		// when
		HelloWorldService helloWorldService = new HelloWorldService();
		String result = helloWorldService.greet();

		// then
		assertThat(result).isNotNull()
				.isNotBlank()
				.isEqualTo(str);
	}

	@Test
	public void shouldReturnHelloWorldDependencyInjectionVersion() {
		// given
		String str = "hello world";

		// when
		String result = helloWorldService.greet();

		// then
		assertThat(result).isNotNull()
				.isNotBlank()
				.isEqualTo(str);
	}

}
