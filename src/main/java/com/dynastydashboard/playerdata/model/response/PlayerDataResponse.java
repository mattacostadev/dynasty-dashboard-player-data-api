package com.dynastydashboard.playerdata.model.response;

import java.util.List;

public class PlayerDataResponse {
    private String message;

    private List<PlayerData> playerData;

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }

    public List<PlayerData> getPlayerData() { return playerData; }
    public void setPlayerData(List<PlayerData> playerData) { this.playerData = playerData; }
}
