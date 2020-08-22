package com.lengleng.service.impl;

import com.lengleng.dao.ProvinceDao;
import com.lengleng.entity.Province;
import com.lengleng.service.ProvinceService;
import com.lengleng.util.SqlSessionUtil;

import java.util.List;

public class ProvinceServiceImpl implements ProvinceService {
    private ProvinceDao p  = SqlSessionUtil.getSession().getMapper(ProvinceDao.class);
    @Override
    public List<Province> getAll() {
        return p.getAll();
    }
}
