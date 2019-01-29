package com.yixun.qugou.util;

public class AjaxResult {
    private boolean success=true;
    private String message="操作成功";
    //返回到前台的对象
    private Object resultObj;

    public boolean isSuccess() {
        return success;
    }

    public AjaxResult setSuccess(boolean success) {
        this.success = success;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public AjaxResult setMessage(String message) {
        this.message = message;
        return this;
    }

    public Object getResultObj() {
        return resultObj;
    }

    public AjaxResult setResultObj(Object resultObj) {
        this.resultObj = resultObj;
        return this;
    }
    public static AjaxResult me(){
        return new AjaxResult();
    }
}
