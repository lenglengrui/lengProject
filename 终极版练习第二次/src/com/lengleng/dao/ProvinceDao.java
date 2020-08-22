package com.lengleng.dao;

import com.lengleng.entity.Province;

import java.util.List;
import java.util.Map;

public interface ProvinceDao {
    List<Province> getAll();

    Province select1(String s);

    List<Province> selectTest(Map pram);
}
