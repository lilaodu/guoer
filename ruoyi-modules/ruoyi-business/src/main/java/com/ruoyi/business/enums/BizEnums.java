package com.ruoyi.business.enums;


/**
 * 异常枚举类
 *
 * @author
 */
public enum BizEnums {
    SUCCESS("1", "成功"),
    ERROR("0", "失败"),

    ;

    private String code;
    private String desc;

    BizEnums(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String name) {
        this.desc = name;
    }

}
