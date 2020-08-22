package com.lengleng.service.impl;

import com.lengleng.dao.CityDao;
import com.lengleng.entity.City;
import com.lengleng.service.CityService;
import com.lengleng.util.SqlSessionUtil;
import com.lengleng.util.TransactionInvocationHandler;

import java.util.List;
import java.util.Map;

public class CityServiceImpl implements CityService {
    private CityDao cityDao = SqlSessionUtil.getSession().getMapper(CityDao.class);
    @Override
    public List<City> selectTest(Map map) {
        return cityDao.selectTest(map);
    }
}
