package com.cangle.hapimity.model.basic;

/**
 * @author raorui
 * @date 2022/6/17 15:18
 */
public class PageRequest {
    protected Integer pageIndex = 1;

    protected Integer pageSize = 20;

    public Integer getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
