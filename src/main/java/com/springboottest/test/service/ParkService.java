package com.springboottest.test.service;

import com.github.pagehelper.Page;
import com.springboottest.test.models.Park;

import java.util.List;

/**
 * 物业服务接口
 */
public interface ParkService {

    /**
     * 分页获取所有物业
     * @param pageNum
     * @param pageSize
     * @return
     */
    List<Park> findAllPark(int pageNum, int pageSize);
}
