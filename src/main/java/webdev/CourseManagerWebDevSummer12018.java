package webdev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourseManagerWebDevSummer12018 {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(CourseManagerWebDevSummer12018.class);
		app.setWebApplicationType(WebApplicationType.REACTIVE); 
		app.run(args);
	//	SpringApplication.run(CourseManagerWebDevSummer12018.class, args);
		
	}
}
