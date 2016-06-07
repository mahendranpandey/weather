package com.mahendra.controller;

import com.mahendra.entity.KaAll;
import java.time.LocalDate;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/")
public class LocationController {   
    
    @RequestMapping(method=RequestMethod.GET)
    public String index(){
        return"index";
    }
    
    @RequestMapping(value="SubmitLocation/{cityName}", method=RequestMethod.POST)
    public ModelAndView displayData(@RequestParam("cityName") String cityName
                                                                       ){
       
        int current_year = LocalDate.now().getYear();
        int current_day = LocalDate.now().getDayOfYear();
        
        System.out.println(current_year+" "+current_day);
        
        Configuration configuration =new Configuration().configure("/Connection/hibernate.cfg.xml");
        StandardServiceRegistryBuilder builder =new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
        SessionFactory sf = configuration.buildSessionFactory(builder.build());
        Session s=sf.openSession();
        s.beginTransaction();
        
        List<KaAll> k_ap=s.createCriteria(KaAll.class).add(Restrictions.eq("day",current_day+1)).list();
        s.getTransaction().commit();
        s.close();
        
        ModelAndView mv=new ModelAndView("DisplayData");
        mv.addObject("data",k_ap);
        return mv;
          
    }
    
}