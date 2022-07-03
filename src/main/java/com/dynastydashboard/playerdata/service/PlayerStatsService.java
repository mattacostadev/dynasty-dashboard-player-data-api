package com.dynastydashboard.playerdata.service;

import java.util.List;

import com.dynastydashboard.playerdata.model.response.PlayerData;

public interface PlayerStatsService {
    public List<PlayerData> retrievePlayerStats(List<String> playerIDs, List<String> statsCategories);
}
