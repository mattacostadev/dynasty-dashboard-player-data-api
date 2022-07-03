package com.dynastydashboard.playerdata.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dynastydashboard.playerdata.model.request.PlayerDataRequest;
import com.dynastydashboard.playerdata.model.response.PlayerDataResponse;
import com.dynastydashboard.playerdata.service.PlayerDataService;
import com.google.gson.Gson;

@RestController
public class PlayerDataController {
    @Autowired
    private PlayerDataService playerDataService;

    Logger logger = LoggerFactory.getLogger(PlayerDataController.class);

    @PostMapping("/data")
    public ResponseEntity<PlayerDataResponse> retrieveData(@RequestBody PlayerDataRequest playerDataRequest) {
        logger.info("Start of player data API. Request received: {}", new Gson().toJson(playerDataRequest));
        PlayerDataResponse playerDataResponse = playerDataService.retrievePlayerData(playerDataRequest);

        logger.info("End of player data API. Sending response: {}", new Gson().toJson(playerDataResponse));
        return new ResponseEntity<PlayerDataResponse>(playerDataResponse, HttpStatus.OK);
    }
}