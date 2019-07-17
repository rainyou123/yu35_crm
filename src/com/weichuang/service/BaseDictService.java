package com.weichuang.service;

import com.weichuang.pojo.BaseDict;

import java.util.List;

public interface BaseDictService {
    List<BaseDict> getBaseDictByTypeCode(String typeCode);
}
