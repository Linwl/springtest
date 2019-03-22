package com.springboottest.test.service.Impl;


import com.springboottest.test.service.ParkService;
import com.springboottest.test.dao.ParkMapper;
import com.springboottest.test.models.Park;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParkServiceImpl  implements ParkService {

    @Autowired
    private ParkMapper parkMapper;

    @Override
    public List<Park> findAllPark(int pageNum, int pageSize) {

        List<Park> parkList = parkMapper.selectAll();
        return parkList;
    }
}
