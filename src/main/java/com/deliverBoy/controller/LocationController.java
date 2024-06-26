package com.deliverBoy.controller;

import com.deliverBoy.service.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/location")
public class LocationController {

    @Autowired
    private KafkaService kafkaService;

    @PostMapping("/update")
    public ResponseEntity<?> updateLocation(){
        for(int i=0; i<100000;i++){
            this.kafkaService.updateLocation("( "+ Math.round(Math.random() * 100) + " , "+ Math.round(Math.random() * 100) +" )");
        }
        return new ResponseEntity<>(Map.of("message","Location updated"), HttpStatus.OK);
    }


}
