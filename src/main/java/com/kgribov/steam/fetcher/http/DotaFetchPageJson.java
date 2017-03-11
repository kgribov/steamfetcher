package com.kgribov.steam.fetcher.http;

import com.fasterxml.jackson.annotation.JsonRootName;

import java.util.Arrays;

@JsonRootName("result")
public class DotaFetchPageJson {

    private Integer status;
    private Integer numResults;
    private Integer totalResults;
    private Integer resultsRemaining;
    private DotaMatchJson[] matches;

    public Integer getStatus() {
        return status;
    }

    public Integer getNumResults() {
        return numResults;
    }

    public Integer getTotalResults() {
        return totalResults;
    }

    public Integer getResultsRemaining() {
        return resultsRemaining;
    }

    public DotaMatchJson[] getMatches() {
        return matches;
    }

    @Override
    public String toString() {
        return "DotaFetchPageJson{" +
                "status=" + status +
                ", numResults=" + numResults +
                ", totalResults=" + totalResults +
                ", resultsRemaining=" + resultsRemaining +
                ", matches=" + Arrays.toString(matches) +
                '}';
    }
}
