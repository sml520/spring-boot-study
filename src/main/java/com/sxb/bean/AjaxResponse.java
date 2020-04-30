package com.sxb.bean;

/**
 * Created by 张元亮 on 2020/4/3.
 */
public class AjaxResponse {

    /**
     * 请求是否处理成功
     */
    private boolean isok;

    /**
     * 请求响应状态码（200、400、500）
     */
    private int code;

    /**
     * 请求结果描述信息
     */
    private String message;

    /**
     * 请求结果数据
     */
    private Object data;

    private AjaxResponse() {

    }

    public boolean isIsok() {
        return isok;
    }

    public void setIsok(boolean isok) {
        this.isok = isok;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }


    /**
     * 请求成功的响应，不带查询数据（用于删除、修改、新增接口）
     *
     * @return
     */
    public static AjaxResponse success() {
        AjaxResponse resultBean = new AjaxResponse();
        resultBean.setIsok(true);
        resultBean.setCode(200);
        resultBean.setMessage("success");
        return resultBean;
    }


    /**
     * 请求成功的响应，带有查询数据（用于数据查询接口）
     *
     * @param data
     * @return
     */
    public static AjaxResponse success(Object data) {
        AjaxResponse resultBean = new AjaxResponse();
        resultBean.setIsok(true);
        resultBean.setCode(200);
        resultBean.setMessage("success");
        resultBean.setData(data);
        return resultBean;
    }


}
