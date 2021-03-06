package com.haynhanh.troll.model.domain;

import java.util.List;

/**
 * Created by peter on 2/19/17.
 */

public class Domain {

    private Integer status;
    private String message;
    private List<DomainDetail> data = null;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<DomainDetail> getData() {
        return data;
    }

    public void setData(List<DomainDetail> data) {
        this.data = data;
    }

}
