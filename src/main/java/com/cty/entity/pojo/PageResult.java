package com.cty.entity.pojo;

import lombok.Data;

import java.util.List;
@Data
public class PageResult{
    private long total;
    private List rows;

    public PageResult(long total, List rows) {
        this.total = total;
        this.rows = rows;
    }
}
