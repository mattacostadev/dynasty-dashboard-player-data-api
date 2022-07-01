package com.dynastydashboard.playerdata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dynastydashboard.playerdata.model.request.PlayerDataRequest;
import com.dynastydashboard.playerdata.model.response.PlayerDataResponse;
import com.dynastydashboard.playerdata.service.PlayerDataService;

@RestController
public class PlayerDataController {
    @Autowired
    PlayerDataService playerDataService;

    @PostMapping("/data")
    public ResponseEntity<PlayerDataResponse> retrieveData(@RequestBody PlayerDataRequest playerDataRequest) {

        PlayerDataResponse playerDataResponse = playerDataService.processPlayerDataRequest(playerDataRequest);

        return new ResponseEntity<PlayerDataResponse>(playerDataResponse, HttpStatus.OK);
    }
}