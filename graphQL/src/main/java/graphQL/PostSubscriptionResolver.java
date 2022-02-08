package graphQL;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.reactivestreams.Publisher;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLSubscriptionResolver;

import reactor.core.publisher.Flux;
import reactor.core.publisher.FluxSink;

@Component
public class PostSubscriptionResolver implements GraphQLSubscriptionResolver {
	
	
	
	public Publisher<Post> posts(String category){
		System.out.println("--- subscribing ---");
//		Random random = new Random();
//        return Flux.interval(Duration.ofSeconds(1))
//                .map(num -> new Post(""+ random.nextInt(), "AutoG",  "TECH", "a101", "autog"));
		
		return Flux.create(sink -> {
			System.out.println("-- save sink in cache ---");
			Service.cache.put(category, sink);
		});
               
    }
	
	
	
	}


