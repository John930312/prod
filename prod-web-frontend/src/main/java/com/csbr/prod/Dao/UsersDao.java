package com.csbr.prod.Dao;

import com.csbr.prod.Pojo.UsersEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

/**
 * Created by YangYuFan on 2019/2/26.
 */
@Component
public interface UsersDao extends CrudRepository<UsersEntity,Integer> {
    Object findById(Integer integer);
    Object findByUsernameAndPassword(String name,String pass);
}
