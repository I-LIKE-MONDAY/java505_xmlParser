package com.bitc.xmltest.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.processing.Generated;
import java.util.List;

@Generated("jsonschema2pojo")
public class BoxOfficeResult {

  @SerializedName("boxofficeType")
  @Expose
  private String boxofficeType;
  @SerializedName("showRange")
  @Expose
  private String showRange;
  @SerializedName("dailyBoxOfficeList")
  @Expose
  private List<DailyBoxOffice> dailyBoxOfficeList = null;

  public String getBoxofficeType() {
    return boxofficeType;
  }

  public void setBoxofficeType(String boxofficeType) {
    this.boxofficeType = boxofficeType;
  }

  public String getShowRange() {
    return showRange;
  }

  public void setShowRange(String showRange) {
    this.showRange = showRange;
  }

  public List<DailyBoxOffice> getDailyBoxOfficeList() {
    return dailyBoxOfficeList;
  }

  public void setDailyBoxOfficeList(List<DailyBoxOffice> dailyBoxOfficeList) {
    this.dailyBoxOfficeList = dailyBoxOfficeList;
  }

}