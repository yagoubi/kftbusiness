/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.kftgroup.dao;

/**
 *
 * @author asap
 */
public interface GenericDao <T> {
    
    T merge(T t);
//    T find(final Object id);
//    T update(T t);
//    void delete(Object id);
    
}
