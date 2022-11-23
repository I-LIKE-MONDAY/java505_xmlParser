package com.bitc.xmltest.dto;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

// @XmlRootElement : name 속의 태그를 부모 태그로 정하겠다는 의미
@XmlRootElement(name = "response")
public class PharmacyFullDataDto {
  private PharmacyFullDataHeaderDto header;
  private PharmacyFullDataBodyDto body;


//  @XmlRootElement 에 선언된 부모태그에 @XmlElement 로 선언된 header 와 body 를 연결하겠다는 의미
  @XmlElement(name = "header")
  public PharmacyFullDataHeaderDto getHeader() {
    return header;
  }

  public void setHeader(PharmacyFullDataHeaderDto header) {
    this.header = header;
  }

  @XmlElement(name = "body")
  public PharmacyFullDataBodyDto getBody() {
    return body;
  }

  public void setBody(PharmacyFullDataBodyDto body) {
    this.body = body;
  }



}
