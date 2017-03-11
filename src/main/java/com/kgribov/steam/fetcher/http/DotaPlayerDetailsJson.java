package com.kgribov.steam.fetcher.http;

public class DotaPlayerDetailsJson {

    private Long accountId;
    private Integer playerSlot;
    private Integer heroId;
    private Integer kills;
    private Integer deaths;
    private Integer assists;
    private Integer leaverStatus;
    private Integer lastHits;
    private Integer denies;
    private Integer goldPerMin;
    private Integer xpPerMin;
    private Integer level;

    private Integer item_0;
    private Integer item_1;
    private Integer item_2;
    private Integer item_3;
    private Integer item_4;
    private Integer item_5;

    private Integer backpack_0;
    private Integer backpack_1;
    private Integer backpack_2;

    public Long getAccountId() {
        return accountId;
    }

    public Integer getPlayerSlot() {
        return playerSlot;
    }

    public Integer getHeroId() {
        return heroId;
    }

    public Integer getKills() {
        return kills;
    }

    public Integer getDeaths() {
        return deaths;
    }

    public Integer getAssists() {
        return assists;
    }

    public Integer getLeaverStatus() {
        return leaverStatus;
    }

    public Integer getLastHits() {
        return lastHits;
    }

    public Integer getDenies() {
        return denies;
    }

    public Integer getGoldPerMin() {
        return goldPerMin;
    }

    public Integer getXpPerMin() {
        return xpPerMin;
    }

    public Integer getLevel() {
        return level;
    }

    public Integer getItem_0() {
        return item_0;
    }

    public Integer getItem_1() {
        return item_1;
    }

    public Integer getItem_2() {
        return item_2;
    }

    public Integer getItem_3() {
        return item_3;
    }

    public Integer getItem_4() {
        return item_4;
    }

    public Integer getItem_5() {
        return item_5;
    }

    public Integer getBackpack_0() {
        return backpack_0;
    }

    public Integer getBackpack_1() {
        return backpack_1;
    }

    public Integer getBackpack_2() {
        return backpack_2;
    }

    @Override
    public String toString() {
        return "DotaPlayerDetailsJson{" +
                "accountId=" + accountId +
                ", playerSlot=" + playerSlot +
                ", heroId=" + heroId +
                ", kills=" + kills +
                ", deaths=" + deaths +
                ", assists=" + assists +
                ", leaverStatus=" + leaverStatus +
                ", lastHits=" + lastHits +
                ", denies=" + denies +
                ", goldPerMin=" + goldPerMin +
                ", xpPerMin=" + xpPerMin +
                ", level=" + level +
                ", item_0=" + item_0 +
                ", item_1=" + item_1 +
                ", item_2=" + item_2 +
                ", item_3=" + item_3 +
                ", item_4=" + item_4 +
                ", item_5=" + item_5 +
                ", backpack_0=" + backpack_0 +
                ", backpack_1=" + backpack_1 +
                ", backpack_2=" + backpack_2 +
                '}';
    }
}
