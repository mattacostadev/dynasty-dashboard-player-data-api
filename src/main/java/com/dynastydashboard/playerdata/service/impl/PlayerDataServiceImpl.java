package com.dynastydashboard.playerdata.service.impl;

import org.springframework.stereotype.Service;

import com.dynastydashboard.playerdata.model.request.PlayerDataRequest;
import com.dynastydashboard.playerdata.model.response.PlayerDataResponse;
import com.dynastydashboard.playerdata.service.PlayerDataService;

@Service
public class PlayerDataServiceImpl implements PlayerDataService {
    public PlayerDataResponse processPlayerDataRequest(PlayerDataRequest playerDataRequest) {
        PlayerDataResponse playerDataResponse = new PlayerDataResponse();

        playerDataResponse.setMessage("SUCCESS");

        return playerDataResponse;
    }
}
