package com.bitc.xmltest.service;

import com.bitc.xmltest.dto.DailyBoxOffice;

import java.util.List;

public interface BoxOfficeService {
  public List<DailyBoxOffice> getDailyBoxOfficeListJson(String serviceUrl);
}
