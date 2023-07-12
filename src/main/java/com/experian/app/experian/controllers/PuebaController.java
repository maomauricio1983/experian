package com.experian.app.experian.controllers;


import com.experian.app.experian.models.entities.PruebaRequest;
import com.experian.app.experian.models.entities.PruebaResponse;
import com.experian.app.experian.services.PruebaRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/experian")
@RestController
public class PuebaController {


    @Autowired
    private PruebaRequestService service;


    @PostMapping("/prueba")
    public PruebaResponse prueba(@RequestBody PruebaRequest request) {
        PruebaResponse response = new PruebaResponse();
        service.guardar(request);
        response.setReturnValue("RetornoPrueba");
        return response;
    }
}
