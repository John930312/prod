package com.csbr.prod.Dao;

import com.csbr.prod.Pojo.TestEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

/**
 * Created by YangYuFan on 2019/2/26.
 */
@Component
public interface TestDao extends CrudRepository<TestEntity,Integer> {
    Object findById(Integer integer);
}
