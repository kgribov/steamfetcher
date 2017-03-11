package com.kgribov.steam.fetcher.http;

import java.util.List;

public class DotaMatchJson {

    private Long matchId;
    private Long matchSeqNum;
    private Long startTime;
    private Integer lobbyType;
    private Integer radiantTeamId;
    private Integer direTeamId;
    private List<DotaPlayerJson> players;

    public Long getMatchId() {
        return matchId;
    }

    public Long getMatchSeqNum() {
        return matchSeqNum;
    }

    public Long getStartTime() {
        return startTime;
    }

    public Integer getLobbyType() {
        return lobbyType;
    }

    public Integer getRadiantTeamId() {
        return radiantTeamId;
    }

    public Integer getDireTeamId() {
        return direTeamId;
    }

    public List<DotaPlayerJson> getPlayers() {
        return players;
    }

    @Override
    public String toString() {
        return "DotaMatchJson{" +
                "matchId=" + matchId +
                ", matchSeqNum=" + matchSeqNum +
                ", startTime=" + startTime +
                ", lobbyType=" + lobbyType +
                ", radiantTeamId=" + radiantTeamId +
                ", direTeamId=" + direTeamId +
                ", players=" + players +
                '}';
    }
}
