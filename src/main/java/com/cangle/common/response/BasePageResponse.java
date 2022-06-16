package com.cangle.common.response;

import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author raorui
 * @date 2022/6/16 14:47
 */
public class BasePageResponse<T> {
    /**
     * 当前页码
     */
    private Integer number;

    /**
     * 页码大小
     */
    private Integer size;

    /**
     * 页码总数
     */
    private Integer totalPages;

    /**
     * 总数据
     */
    private Long totalElements;

    /**
     * data
     */
    private T content;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public Long getTotalElements() {
        return totalElements;
    }

    public void setTotalElements(Long totalElements) {
        this.totalElements = totalElements;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }
}