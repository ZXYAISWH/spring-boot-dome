package zxy.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ConfigurationProperties(prefix = "school")
@PropertySource("classpath:school.properties")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class School {
    @Value("${school.name}")
    private String name;
    @Value("${school.age}")
    private Integer age;
    @Value("${school.loc}")
    private String loc;

}
