package com.dynastydashboard.playerdata.model.response;

import java.util.List;
import java.util.Map;

public class PlayerData {
    private String playerID;

    Map<String, List<PlayerStats>> playerStats;

    PlayerInfo playerInfo;

    public String getPlayerID() { return playerID; }
    public void setPlayerID(String playerID) { this.playerID = playerID; }

    public Map<String, List<PlayerStats>> getPlayerStats() { return playerStats; }
    public void setPlayerStats(Map<String, List<PlayerStats>> playerStats) { this.playerStats = playerStats; }

    public PlayerInfo getPlayerInfo() { return playerInfo; }
    public void setPlayerInfo(PlayerInfo playerInfo) { this.playerInfo = playerInfo; }
}
