package com.kgribov.steam.fetcher.http;

import com.fasterxml.jackson.annotation.JsonRootName;

import java.util.Arrays;

@JsonRootName("result")
public class DotaMatchDetailsJson {

    private Long matchId;
    private Boolean radiantWin;
    private Integer duration;
    private Integer preGameDuration;
    private Long startTime;
    private Long matchSeqNum;
    private Integer towerStatusRadiant;
    private Integer towerStatusDire;
    private Integer barracksStatusRadiant;
    private Integer barracksStatusDire;
    private Integer cluster;
    private Integer firstBloodTime;
    private Integer lobbyType;
    private Integer humanPlayers;
    private Integer leagueid;
    private Integer positiveVotes;
    private Integer negativeVotes;
    private Integer gameMode;
    private Integer flags;
    private Integer engine;
    private Integer radiant_score;
    private Integer dire_score;
    private DotaPlayerDetailsJson[] players;

    public DotaPlayerDetailsJson[] getPlayers() {
        return players;
    }

    public Long getMatchId() {
        return matchId;
    }

    public Boolean getRadiantWin() {
        return radiantWin;
    }

    public Integer getDuration() {
        return duration;
    }

    public Integer getPreGameDuration() {
        return preGameDuration;
    }

    public Long getStartTime() {
        return startTime;
    }

    public Long getMatchSeqNum() {
        return matchSeqNum;
    }

    public Integer getTowerStatusRadiant() {
        return towerStatusRadiant;
    }

    public Integer getTowerStatusDire() {
        return towerStatusDire;
    }

    public Integer getBarracksStatusRadiant() {
        return barracksStatusRadiant;
    }

    public Integer getBarracksStatusDire() {
        return barracksStatusDire;
    }

    public Integer getCluster() {
        return cluster;
    }

    public Integer getFirstBloodTime() {
        return firstBloodTime;
    }

    public Integer getLobbyType() {
        return lobbyType;
    }

    public Integer getHumanPlayers() {
        return humanPlayers;
    }

    public Integer getLeagueid() {
        return leagueid;
    }

    public Integer getPositiveVotes() {
        return positiveVotes;
    }

    public Integer getNegativeVotes() {
        return negativeVotes;
    }

    public Integer getGameMode() {
        return gameMode;
    }

    public Integer getFlags() {
        return flags;
    }

    public Integer getEngine() {
        return engine;
    }

    public Integer getRadiant_score() {
        return radiant_score;
    }

    public Integer getDire_score() {
        return dire_score;
    }

    @Override
    public String toString() {
        return "DotaMatchDetailsJson{" +
                "matchId=" + matchId +
                ", radiantWin=" + radiantWin +
                ", duration=" + duration +
                ", preGameDuration=" + preGameDuration +
                ", startTime=" + startTime +
                ", matchSeqNum=" + matchSeqNum +
                ", towerStatusRadiant=" + towerStatusRadiant +
                ", towerStatusDire=" + towerStatusDire +
                ", barracksStatusRadiant=" + barracksStatusRadiant +
                ", barracksStatusDire=" + barracksStatusDire +
                ", cluster=" + cluster +
                ", firstBloodTime=" + firstBloodTime +
                ", lobbyType=" + lobbyType +
                ", humanPlayers=" + humanPlayers +
                ", leagueid=" + leagueid +
                ", positiveVotes=" + positiveVotes +
                ", negativeVotes=" + negativeVotes +
                ", gameMode=" + gameMode +
                ", flags=" + flags +
                ", engine=" + engine +
                ", radiant_score=" + radiant_score +
                ", dire_score=" + dire_score +
                ", players=" + Arrays.toString(players) +
                '}';
    }
}
