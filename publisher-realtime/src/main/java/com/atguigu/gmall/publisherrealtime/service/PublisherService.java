package com.atguigu.gmall.publisherrealtime.service;

import com.atguigu.gmall.publisherrealtime.bean.NameValue;

import java.util.List;
import java.util.Map;

public interface PublisherService {
    Map<String, Object> doDauRealtime(String td);

    List<NameValue> doStatsByItem(String itemName, String date, String t);
}
