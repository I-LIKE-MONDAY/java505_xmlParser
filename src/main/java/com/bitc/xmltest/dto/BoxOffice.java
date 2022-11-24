package com.bitc.xmltest.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.processing.Generated;

@Generated("jsonschema2pojo")
public class BoxOffice {

  @SerializedName("boxOfficeResult")
  @Expose
  private BoxOfficeResult boxOfficeResult;

  public BoxOfficeResult getBoxOfficeResult() {
    return boxOfficeResult;
  }

  public void setBoxOfficeResult(BoxOfficeResult boxOfficeResult) {
    this.boxOfficeResult = boxOfficeResult;
  }

}