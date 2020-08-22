package com.lengleng.controller;

import com.lengleng.dao.CityDao;
import com.lengleng.dao.ProvinceDao;
import com.lengleng.entity.City;
import com.lengleng.entity.Province;
import com.lengleng.service.CityService;
import com.lengleng.service.impl.CityServiceImpl;
import com.lengleng.util.SqlSessionUtil;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        CityService cityService = new CityServiceImpl();
        Map<String,String> pra = new HashMap<>();
        pra.put("cityName1","太原");
        pra.put("cityName2","包头");
        List<City> cities =  cityService.selectTest(pra);
        for (City city: cities
             ) {
            System.out.println(city);
        }
    }
}
