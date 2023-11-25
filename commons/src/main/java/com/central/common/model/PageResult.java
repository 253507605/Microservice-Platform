package com.central.common.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Author Jason.Chen
 * @create 2023/11/7 11:05
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PageResult<T> {

    /**
     * 总数
     */
    private Long count;

    /**
     * 是否成功，0失败，1成功
     */
    private int code;

    /**
     * 当前页结果集
     */
    private List<T> data;
}
