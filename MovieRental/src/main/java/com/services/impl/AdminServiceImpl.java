/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.services.impl;

import com.model.Admin;
import com.repositories.AdminRepository;
import com.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 *
 * @author Herbert
 */
@Service
public class AdminServiceImpl implements AdminService{

    @Autowired
    private AdminRepository adminRepository;
    
    @Override
    public Admin create(Admin admin) {
        return adminRepository.save(admin);
    }

    @Override
    public void delete(Admin admin) {
    adminRepository.save(admin);
    }
    
}
