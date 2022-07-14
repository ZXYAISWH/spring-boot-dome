package zxy;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import zxy.config.Config;

@SpringBootApplication
@EnableConfigurationProperties(Config.class)
public class SpringbootConfiguration {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootConfiguration.class,args);
    }
}
