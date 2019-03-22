package com.springboottest.test.dao;


import com.github.pagehelper.Page;
import com.springboottest.test.models.Park;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 物业XML映射接口
 */
@Repository
public interface ParkMapper {
    /**
     * 获取所有物业信息
     * @return
     */
    Page<Park> selectAll();

    /**
     * 根据物业ID获取物业信息
     * @param id
     * @return
     */
    Park selectById(String id);
}