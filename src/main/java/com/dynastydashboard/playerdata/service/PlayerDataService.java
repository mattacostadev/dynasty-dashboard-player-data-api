package com.dynastydashboard.playerdata.service;

import com.dynastydashboard.playerdata.model.request.PlayerDataRequest;
import com.dynastydashboard.playerdata.model.response.PlayerDataResponse;

public interface PlayerDataService {
    public PlayerDataResponse retrievePlayerData(PlayerDataRequest playerDataRequest);
}
