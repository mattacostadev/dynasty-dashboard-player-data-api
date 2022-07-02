package com.dynastydashboard.playerdata.model.request;

import java.util.List;

public class PlayerDataRequest {
    private List<String> playerIDs;

    private List<String> statsCategories;

    private List<String> infoCategories;

    public List<String> getPlayerIDs() { return playerIDs; }
    public void setPlayerIDs(List<String> playerIDs) { this.playerIDs = playerIDs; }

    public List<String> getStatsCategories() { return statsCategories; }
    public void setStatsCategories(List<String> statsCategories) { this.statsCategories = statsCategories; }

    public List<String> getInfoCategories() { return infoCategories; }
    public void setInfoCategories(List<String> infoCategories) { this.infoCategories = infoCategories; }
}
