package com.dynastydashboard.playerdata.model.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import com.dynastydashboard.playerdata.model.response.PlayerStats;

@Table(schema = "stats", name = "game_receiving")
public class PlayerGameReceivingStats extends PlayerStats {
    @Id
    @Column(name = "id", nullable = false)
    private int ID;

    @Column(name = "player_id", nullable = false)
    private String playerID;

    @Column(name = "targets", nullable = false)
    private int targets;

    @Column(name = "receptions", nullable = false)
    private int receptions;

    @Column(name = "receiving_yards", nullable = false)
    private int receivingYards;

    @Column(name = "receiving_touchdowns", nullable = false)
    private int receivingTouchdowns;

    @Column(name = "game_id", nullable = false)
    private String gameID;

    public int getID() { return ID; }
    public void setID(int ID) { this.ID = ID; }

    public String getPlayerID() { return playerID; }
    public void setPlayerID(String playerID) { this.playerID = playerID; }

    public int getTargets() { return targets; }
    public void setTargets(int targets) { this.targets = targets; }

    public int getReceptions() { return receptions; }
    public void setReceptions(int receptions) { this.receptions = receptions; }

    public int getReceivingYards() { return receivingYards; }
    public void setReceivingYards(int receivingYards) { this.receivingYards = receivingYards; }
    
    public int getReceivingTouchdowns() { return receivingTouchdowns; }
    public void setReceivingTouchdowns(int receivingTouchdowns) { this.receivingTouchdowns = receivingTouchdowns; }

    public String getGameID() { return gameID; }
    public void setGameID(String gameID) { this.gameID = gameID; }
}