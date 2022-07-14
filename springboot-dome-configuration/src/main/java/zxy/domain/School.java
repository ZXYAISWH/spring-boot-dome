package zxy.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class School {
    private String name;
    private Integer age;
    private String loc;
}
