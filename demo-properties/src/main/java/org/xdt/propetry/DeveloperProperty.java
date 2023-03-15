package org.xdt.propetry;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author XDT
 * @ClassName DeveloperProperty
 * @Description: TODO
 * @Date 2023/3/15 15:31
 **/
@Data
@ConfigurationProperties(prefix = "developer")
@Component
public class DeveloperProperty {
    private String name;
    private String website;
    private String qq;
    private String phoneNumber;
}
