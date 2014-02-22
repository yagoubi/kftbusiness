/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.kftgroup.dao.impl;

import com.kftgroup.dao.GenericDao;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;
import javax.management.Query;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;

/**
 *
 * @author asap
 */
public abstract class GenericDaoImpl<T> implements GenericDao<T> {

  private EntityManagerFactory entityManagerFactory;
   
   

    @Override
    public T merge(final T t) {
        this.entityManagerFactory.createEntityManager().merge(t);
        return t;
    }

//    @Override
//    public void delete(final Object id) {
//        this.em.remove(this.em.getReference(type, id));
//    }
//
//    @Override
//    public T find(final Object id) {
//        return (T) this.em.find(type, id);
//    }
//
//    @Override
//    public T update(final T t) {
//        return this.em.merge(t);    
//    }
}
