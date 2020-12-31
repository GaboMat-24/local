package com.desarrollo.local.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import ch.qos.logback.core.subst.Token.Type;

import java.net.http.HttpClient;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.desarrollo.local.model.LocalModel;
import com.desarrollo.local.model.Locales;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.jayway.restassured.path.json.JsonPath;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LocalServices {
    Logger logger = (Logger) LoggerFactory.getLogger(LocalServices.class);
    @Autowired
    RestTemplate restTemplate = new RestTemplate();

    public String getLocales() {
        final String uri = "https://farmanet.minsal.cl/maps/index.php/ws/getLocalesRegion?id_region=7";
        String result = restTemplate.getForObject(uri, String.class);
        return result;
    }

    public List<LocalModel>  getLocalesByComuna(String comuna_nombre) throws Exception {
        final String uri = "https://farmanet.minsal.cl/maps/index.php/ws/getLocalesRegion?id_region=7";
        logger.info("la uri es = "+uri);
        String result = restTemplate.getForObject(uri, String.class);
        final Gson gson = new Gson();
        final java.lang.reflect.Type Listalocales = new TypeToken<List<LocalModel>>() {}.getType();
        //logger.info("result = "+result);
        //String result2 = JsonPath.from(result).get("{comuna_nombre -> "+comuna_nombre+" }");
        //return result2;
        final List<LocalModel> local = gson.fromJson(result, Listalocales);
        return local;
    }
    
    
    


    

}