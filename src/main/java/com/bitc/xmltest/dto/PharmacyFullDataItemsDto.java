package com.bitc.xmltest.dto;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "items")
public class PharmacyFullDataItemsDto {
//  item 태그 아래에 요소들이 있음 -> 리스트 타입으로 선언
  private List<PharmacyFullDataItemDto> itemList;

  @XmlElement(name = "item")
  public List<PharmacyFullDataItemDto> getItemList() {
    return itemList;
  }

  public void setItemList(List<PharmacyFullDataItemDto> itemList) {
    this.itemList = itemList;
  }
}
