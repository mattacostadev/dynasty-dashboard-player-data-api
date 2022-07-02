package com.dynastydashboard.playerdata.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dynastydashboard.playerdata.model.request.PlayerDataRequest;
import com.dynastydashboard.playerdata.model.response.PlayerData;
import com.dynastydashboard.playerdata.model.response.PlayerDataResponse;
import com.dynastydashboard.playerdata.service.PlayerDataService;
import com.dynastydashboard.playerdata.service.PlayerStatsService;

@Service
public class PlayerDataServiceImpl implements PlayerDataService {
    @Autowired
    private PlayerStatsService playerStatsService;

    Logger logger = LoggerFactory.getLogger(PlayerDataServiceImpl.class);

    public PlayerDataResponse retrievePlayerData(PlayerDataRequest playerDataRequest) {
        logger.info("Start of PlayerDataService");
        PlayerDataResponse playerDataResponse = new PlayerDataResponse();
        
        List<PlayerData> playerData = 
            playerStatsService.retrievePlayerStats(playerDataRequest.getPlayerIDs(), playerDataRequest.getStatsCategories());

        playerDataResponse.setPlayerData(playerData);
        playerDataResponse.setMessage("SUCCESS");

        logger.info("End of PlayerDataService. Status: {}", playerDataResponse.getMessage());
        return playerDataResponse;
    }
}
