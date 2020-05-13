package it.mariani.titti.controller;

import it.mariani.titti.core.utility.logger.Logger;
import it.mariani.titti.core.utility.logger.LoggerFactory;
import java.security.Principal;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ctrl-user")
public class UserController {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping(value = "/me")
    public Principal user(Principal principal) {
        logger.info("Principal is: '{}'", principal);
        return principal;
    }

}
