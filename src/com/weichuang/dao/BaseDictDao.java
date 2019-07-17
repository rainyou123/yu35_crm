package com.weichuang.dao;

import com.weichuang.pojo.BaseDict;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Repository
public interface BaseDictDao {

    List<BaseDict> getBaseDictByTypeCode(String typeCode);
}
