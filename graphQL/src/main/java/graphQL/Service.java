package graphQL;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import reactor.core.publisher.FluxSink;


@SpringBootApplication
//@Import(GraphqlConfiguration.class)
public class Service {
	
	public static Map<String, FluxSink<Post>> cache = new HashMap<String, FluxSink<Post>>();
	
	public static void main(String[] args) {
		SpringApplication.run(Service.class, args);
	}

}
