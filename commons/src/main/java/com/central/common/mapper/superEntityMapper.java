package com.central.common.mapper;

import com.central.common.model.SuperEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author Jason.Chen
 * @create 2023/11/16 16:46
 */
@Mapper
public interface superEntityMapper {

    List<SuperEntity> getAllUsers();

    SuperEntity getUserById(int id);
}
