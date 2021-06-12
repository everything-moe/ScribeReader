package moe.everything.scribe.reader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("moe.everything")
public class ScribeReaderApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScribeReaderApplication.class, args);
	}

}
