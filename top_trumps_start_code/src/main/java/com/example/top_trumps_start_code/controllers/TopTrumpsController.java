package com.example.top_trumps_start_code.controllers;

import com.example.top_trumps_start_code.models.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.top_trumps_start_code.services.TopTrumpService;

import java.util.ArrayList;


@RestController
@RequestMapping(value = "/Trumps") //localhost:8080/Trumps
public class TopTrumpsController {

    @Autowired
    TopTrumpService topTrumpService;

    @PostMapping
    public ResponseEntity <String> newGame(@RequestBody ArrayList<Card> cards){
        String message = topTrumpService.callCards(cards);
        return new ResponseEntity<>(message, HttpStatus.OK);
    }

}
