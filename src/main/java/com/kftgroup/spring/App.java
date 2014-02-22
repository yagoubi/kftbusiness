package com.kftgroup.spring;

import com.kftgroup.dao.GenericDao;
import com.kftgroup.dao.impl.GenericDaoImpl;
import com.kftgroup.kftcommon.model.Artisan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext ctx =                                                                              
            new ClassPathXmlApplicationContext("beans.xml");                    

       //Get bean from context.

     //  GenericDaoImpl genericDaoImpl =  (GenericDaoImpl) ctx.getBean("genericDaoImpl");

     // Invoke bean method.
       
       Artisan artisan= new Artisan();
       artisan.setName("yagoubi");
       artisan.setPrenom("Taoufik");
       

       // genericDaoImpl.merge(ctx);
    }
}
