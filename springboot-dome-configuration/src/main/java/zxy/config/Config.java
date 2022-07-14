package zxy.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "user")
public class Config {
    @Value("${user.names}")
    private String name;
    @Value("${user.age}")
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Config() {
    }

    public Config(String name, String age) {
        this.name = name;
        this.age = age;
    }
}
