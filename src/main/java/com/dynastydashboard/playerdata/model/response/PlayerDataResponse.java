package com.dynastydashboard.playerdata.model.response;

public class PlayerDataResponse {
    private String message;

    private PlayerStats playerStats;

    private PlayerInfo playerInfo;

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }

    public PlayerStats getPlayerStats() { return playerStats; }
    public void setPlayerStats(PlayerStats playerStats) { this.playerStats = playerStats; }

    public PlayerInfo getPlayerInfo() { return playerInfo; }
    public void setPlayerInfo(PlayerInfo playerInfo) { this.playerInfo = playerInfo; }
}
