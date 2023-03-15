package org.xdt.controller;

import cn.hutool.core.lang.Dict;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.xdt.propetry.ApplicationProperty;
import org.xdt.propetry.DeveloperProperty;

/**
 * @author XDT
 * @ClassName PropertyController
 * @Description: TODO
 * @Date 2023/3/15 15:31
 **/
@RestController
public class PropertyController {
    private final ApplicationProperty applicationProperty;
    private final DeveloperProperty developerProperty;

    @Autowired
    public PropertyController(ApplicationProperty applicationProperty, DeveloperProperty developerProperty) {
        this.applicationProperty = applicationProperty;
        this.developerProperty = developerProperty;
    }

    @GetMapping("/property")
    public Dict index() {
        return Dict.create().set("applicationProperty", applicationProperty).set("developerProperty", developerProperty);
    }
}
