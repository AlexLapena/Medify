package com.best.superteam.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Filip Hasson
 */
@Controller
@RequestMapping("/indexAction")
class IndexController
{

    private static final Logger logger = LoggerFactory.getLogger(IndexController.class);

    @Bean
    public ResourceBundleMessageSource messageSource() {
        ResourceBundleMessageSource source = new ResourceBundleMessageSource();
        source.setBasename("messages_en.properties");
        source.setUseCodeAsDefaultMessage(true);
        return source;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String displayRequestPage()
    {
        /*
           I am going to display the helloworld.jsp page now :)
         */
        logger.debug("made it to controller");
        return "schedule";
    }

}
