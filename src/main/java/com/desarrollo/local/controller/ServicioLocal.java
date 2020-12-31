package com.desarrollo.local.controller;

import java.util.List;

import com.desarrollo.local.model.LocalModel;
import com.desarrollo.local.model.Locales;
import com.desarrollo.local.services.LocalServices;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServicioLocal {
    LocalServices l = new LocalServices();
    Logger logger = (Logger) LoggerFactory.getLogger(ServicioLocal.class);

    @RequestMapping("/")
    public String servicioLocal() throws Exception {
         return l.getLocales();
    }

    @RequestMapping("/comuna/{comuna_nombre}")
    @ResponseBody
    public List<LocalModel> getLocalesByComuna(@PathVariable("comuna_nombre") String comuna_nombre) throws Exception {
        logger.info("Path variable  " + comuna_nombre);
        return l.getLocalesByComuna(comuna_nombre);

    }

    

}