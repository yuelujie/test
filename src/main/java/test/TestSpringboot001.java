package test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication(exclude=RedisAutoConfiguration.class)
@Configuration
public class TestSpringboot001 extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(TestSpringboot001.class, args);
	}
	
//	@RequestMapping("hello")
//	@ResponseBody
//	public String test001(){
//		return "ddddddddddddd";
//	}

//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//		return builder.sources(TestSpringboot001.class);
//	}
	
	
}
