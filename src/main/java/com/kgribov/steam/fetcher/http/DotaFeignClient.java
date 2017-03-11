package com.kgribov.steam.fetcher.http;

import feign.Param;
import feign.RequestLine;

interface DotaFeignClient {

    @RequestLine("GET /IDOTA2Match_570/GetMatchHistory/V001/?format={format}&key={key}&start_at_match_id={start_at_match_id}")
    DotaFetchPageJson fetchDotaMatches(@Param("format") String format,
                                       @Param("key") String key,
                                       @Param("start_at_match_id") Long startAtMatchId);
}
