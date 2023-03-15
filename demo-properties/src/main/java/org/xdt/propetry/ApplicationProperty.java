package org.xdt.propetry;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author XDT
 * @ClassName ApplicationProperty
 * @Description: TODO
 * @Date 2023/3/15 15:29
 **/
@Data
@Component
public class ApplicationProperty {
    @Value("${application.name}")
    private String name;
    @Value("${application.version}")
    private String version;
}
