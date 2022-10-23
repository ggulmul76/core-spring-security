package io.security.corespringsecurity.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ConfingController {

    @GetMapping("/config")
    public String config() {
        return "admin/config";
    }
}
