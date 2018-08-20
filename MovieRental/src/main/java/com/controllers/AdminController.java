/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controllers;

import com.factories.AdminFactory;
import com.google.gson.Gson;
import com.model.Admin;
import com.services.AdminService;
import com.services.impl.AdminServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 *
 * @author Herbert
 */

@CrossOrigin(origins = "http://localhost:8080/")
@RestController
@RequestMapping(path = "/com")
public class AdminController {
    @Autowired
    private AdminServiceImpl adminService;

    @GetMapping(path = "/addAdmin/{adminId}/{adminName}/{adminPassword}")
    public @ResponseBody
    String addAdmin(@PathVariable String adminId, @PathVariable String adminName, @PathVariable String adminPassword)
    {
        Admin admin = AdminFactory.buildAdmin(adminId, adminName, adminPassword);
        adminService.create(admin);
        return new Gson().toJson(admin);
    }

    @RequestMapping(value="/delete/{adminId}", method = RequestMethod.DELETE)
    public void deleteAdmin(@PathVariable Admin adminId)
    {
        adminService.delete(adminId);
        System.out.println("Record deleted");
    }
    
    
}
