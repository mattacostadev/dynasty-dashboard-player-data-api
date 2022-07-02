package com.dynastydashboard.playerdata.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.dynastydashboard.playerdata.model.response.PlayerData;
import com.dynastydashboard.playerdata.model.response.PlayerStats;
import com.dynastydashboard.playerdata.service.PlayerStatsService;

@Service
public class PlayerStatsServiceImpl implements PlayerStatsService {
    public List<PlayerData> retrievePlayerStats(List<String> playerIDs, List<String> statsCategories) {
        Map<String, List<PlayerStats>> allPlayerStats = new HashMap<String, List<PlayerStats>>();

        statsCategories.forEach(
            sC -> allPlayerStats.put(sC, retrieveCategoryStats(sC, playerIDs))
        );

        List<PlayerData> playerData = new ArrayList<PlayerData>();

        playerIDs.forEach(
            pID -> playerData.add(mapDataToPlayer(pID, allPlayerStats))
        );

        return playerData;
    }

    private List<PlayerStats> retrieveCategoryStats(String statsCategory, List<String> playerIDs) {
        // TODO: Entities, Repositories

        return new ArrayList<PlayerStats>();
    }

    private PlayerData mapDataToPlayer(String playerID, Map<String, List<PlayerStats>> allPlayerStats) {
        PlayerData playerData = new PlayerData();
        Map<String, List<PlayerStats>> playerStats = new HashMap<String, List<PlayerStats>>();

        for(String k: allPlayerStats.keySet()) {
            playerStats.put(k, new ArrayList<PlayerStats>());

            List<PlayerStats> playerStatsForCategory = 
                allPlayerStats.get(k).stream().filter(x -> x.getPlayerID().equals(playerID)).toList();
            
            playerStats.get(k).addAll(playerStatsForCategory);
        }

        playerData.setPlayerID(playerID);
        playerData.setPlayerStats(playerStats);

        return playerData;
    }
}
