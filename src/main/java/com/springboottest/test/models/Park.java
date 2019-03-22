package com.springboottest.test.models;

import io.swagger.annotations.ApiModelProperty;

/**
 * 物业信息类
 */
public class Park {
//    @ApiModelProperty(value="物业名字",dataType="String",name="Name",example="浩迪")
//    private String Name;

    @ApiModelProperty(value="物业编号",dataType="String",name="ParkNumber",example="63544")
    private String ParkNumber;

    @ApiModelProperty(value="物业Id",dataType="String",name="ParkId",example="dddd")
    private String ParkId;


    public void setParkNumber(String parkNumber) {
        ParkNumber = parkNumber;
    }

    public void setParkId(String parkId) {
        ParkId = parkId;
    }


    public String getParkId() {
        return ParkId;
    }

    public String getParkNumber() {
        return ParkNumber;
    }
}
