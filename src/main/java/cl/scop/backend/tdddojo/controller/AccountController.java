package cl.scop.backend.tdddojo.controller;

import cl.scop.backend.tdddojo.model.bff.AccountBffResume;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AccountController {

    @RequestMapping("/account")
    public List<AccountBffResume> account() {
        return null;
    }

}