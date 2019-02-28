package com.dxm.anymock.common.base.entity;

import com.alibaba.fastjson.JSONObject;

import javax.servlet.http.HttpServletRequest;
import javax.validation.constraints.NotNull;

public class RequestType {

    @NotNull
    private String method;

    @NotNull
    private String uri;

    public RequestType() {}

    public RequestType(HttpServletRequest request) {
        this.method = request.getMethod();
        this.uri = request.getRequestURI();
    }

    public RequestType(HttpInterface httpInterface) {
        this.method = httpInterface.getRequestMethod();
        this.uri = httpInterface.getRequestUri();
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }
}
