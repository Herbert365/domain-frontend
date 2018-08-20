/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.services;

import com.model.Admin;

/**
 *
 * @author Herbert
 */
public interface AdminService {
    
    public Admin create(Admin admin);
    public void delete(Admin admin);

}
