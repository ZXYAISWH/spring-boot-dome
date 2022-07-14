package zxy.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ConfigurationProperties(prefix = "user")
public class Configs {
    @Value("${user.names}")
    private String name;
    @Value("${user.age}")
    private String age;
//    @Value("${user.wife}")
    private String[] wife;
}
