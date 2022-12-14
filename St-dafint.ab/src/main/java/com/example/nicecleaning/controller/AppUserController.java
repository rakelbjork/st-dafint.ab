package com.example.nicecleaning.controller;


import com.example.nicecleaning.dto.CreateAppUserDTO;
import com.example.nicecleaning.services.AppUserService;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/user")
@CrossOrigin(origins = {"http://localhost:3000"}, methods = {RequestMethod.GET, RequestMethod.PUT, RequestMethod.POST, RequestMethod.DELETE})
public class AppUserController {

    private final AppUserService appUserService;

    public AppUserController(AppUserService appUserService) {
        this.appUserService = appUserService;
    }

    @PostMapping("/register/{id}")
    public void saveAll(@RequestBody() CreateAppUserDTO createAppUserDTO){

        appUserService.createUser(createAppUserDTO);
    }



}
