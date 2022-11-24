package com.bitc.xmltest.service;

import com.bitc.xmltest.dto.BoxOffice;
import com.bitc.xmltest.dto.BoxOfficeResult;
import com.bitc.xmltest.dto.DailyBoxOffice;
import com.google.gson.Gson;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

@Service
public class BoxOfficeServiceImpl implements BoxOfficeService {

  @Override
  public List<DailyBoxOffice> getDailyBoxOfficeListJson(String serviceUrl) {
    List<DailyBoxOffice> itemList = null;
    URL url = null;
    HttpURLConnection urlConn = null;
    BufferedReader reader = null; // 웹 서버에서 응답으로 넘겨주는 데이터를 받아오는 스트림

    try {
      url = new URL(serviceUrl);
      urlConn = (HttpURLConnection) url.openConnection();
      urlConn.setRequestMethod("GET");

//      웹 사이트 연결이 완료
      reader = new BufferedReader(new InputStreamReader(urlConn.getInputStream()));
//      StringBuilder : 문자열을 효과적으로 사용하기 위한 클래스
//      문자열은 연결 연산자 사용시 str1 = "문자열", str2 = "만들기" --> str1 + str2 --> str2의 데이터가 str1로 들어가서 합쳐지는게 아니라 새로운 문자열(새로운 메모리 영역)이 생성되는 것임. -> 신규 문자열에 "문자열 만들기"를 넣은 후 이것이 출력되는것임.
//      하지만 StringBuilder sb는 한번 만들어지면 해당 변수에 append를 통해 원본 그대로에 계속 문자열을 붙여서 사용하는것임. 좀 더 효율이 높다!
      StringBuilder sb = new StringBuilder();
      String line;

      while ((line = reader.readLine()) != null) {
        sb.append(line);
      }

//      Gson 객체 사용
      Gson gson = new Gson();
//      Gson을 통해서 가져온 데이터를 BoxOffice 클래스 타입으로 변환
      BoxOffice boxOffice = gson.fromJson(sb.toString(), BoxOffice.class); // 여러 문자열들이 append를 통해 추가된 sb를 toString()을 통해 실제 문자열로 바꿔줌

      itemList = boxOffice.getBoxOfficeResult().getDailyBoxOfficeList();

    } catch (IOException e) {
      throw new RuntimeException(e);
    } finally {
      if (reader != null) {
        try {
          reader.close();
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }
      if (urlConn != null) {
        urlConn.disconnect();
      }
      return itemList;
    }

  }
}
