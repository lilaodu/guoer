package com.ruoyi.business.entity;


import com.ruoyi.business.enums.BizEnums;
import lombok.Data;

import java.io.Serializable;

@Data
public class BaseResponse implements Serializable {

    private String code;
    private String msg;
    private Object data;

    public BaseResponse() {
    }

    public BaseResponse(String msg) {
        this.msg = msg;
    }

    public BaseResponse(String msg, Object data) {
        this.code = BizEnums.SUCCESS.getCode();
        this.msg = msg;
        this.data = data;
    }

    public BaseResponse(String code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public  Boolean isSuccess() {
        return BizEnums.SUCCESS.getCode().equals(this.code);
    }

    public static BaseResponse success() {
        return new BaseResponse(BizEnums.SUCCESS.getCode(), BizEnums.SUCCESS.getDesc());
    }

    public static BaseResponse success(Object data) {
        return new BaseResponse(BizEnums.SUCCESS.getCode(), BizEnums.SUCCESS.getDesc(), data);
    }

    public static BaseResponse success(String msg, Object data) {
        return new BaseResponse(BizEnums.SUCCESS.getCode(), msg, data);
    }

    public static BaseResponse error() {
        return new BaseResponse(BizEnums.ERROR.getCode(), BizEnums.ERROR.getDesc(), "");
    }

    public static BaseResponse error(String msg) {
        return new BaseResponse(BizEnums.ERROR.getCode(), msg, "");
    }

    public static BaseResponse error(String code, String msg) {
        return new BaseResponse(code, msg, "");
    }


}
