package com.bitc.xmltest.service;

import com.bitc.xmltest.dto.PharmacyFullDataItemDto;

import java.util.List;

public interface PharmacyFullDataService {

  List<PharmacyFullDataItemDto> getItemList() throws Exception;

  List<PharmacyFullDataItemDto> getItemListUrl(String url) throws Exception;
}
