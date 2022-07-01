package com.dynastydashboard.playerdata.model.request;

import java.util.List;

public class PlayerDataRequest {
    private List<String> playerIDs;

    private boolean includeStats;

    private String statsGranularity;

    public List<String> getPlayerID() { return playerIDs; }
    public void setPlayerID(List<String> playerIDs) { this.playerIDs = playerIDs; }

    public boolean getIncludeStats() { return includeStats; }
    public void setIncludeStats(boolean includeStats) { this.includeStats = includeStats; }

    public String getStatsGranularity() { return statsGranularity; }
    public void setStatsGranularity(String statsGranularity) { this.statsGranularity = statsGranularity; }
}
