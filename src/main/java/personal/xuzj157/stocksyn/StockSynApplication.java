package personal.xuzj157.stocksyn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

@SpringBootApplication(exclude = MongoAutoConfiguration.class)
public class StockSynApplication {
	public static void main(String[] args) {
		SpringApplication.run(StockSynApplication.class, args);
	}
}
