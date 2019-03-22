package com.springboottest.test.controller;

import com.springboottest.test.service.ParkService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * 物业信息控制器
 */

@Api("ParkController相关api")
@Controller
@RequestMapping(value="/ParkSvc")
public class ParkController {

    @Autowired
    private ParkService parkService;



    @ResponseBody
    @GetMapping(value = "/all")
    @ApiOperation(value="获取所有物业信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNum",value ="首页",required = false,paramType = "Int"),
            @ApiImplicitParam(name = "pageSize",value ="分页数",required = false,paramType = "Int")
    })
    public Object findAllPark(@RequestParam(name = "pageNum",defaultValue = "1",required = false)int pageNum,@RequestParam(name = "pageSize", defaultValue = "10",required = false)int pageSize){
        try {
            return parkService.findAllPark(pageNum,pageSize);
        }
        catch (Exception e)
        {
            throw e;
        }
    }

}
