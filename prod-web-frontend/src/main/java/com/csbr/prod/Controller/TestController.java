package com.csbr.prod.Controller;

import com.csbr.prod.Dao.TestDao;
import com.csbr.prod.Pojo.TestEntity;
import com.csbr.prod.Utils.SendMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by YangYuFan on 2019/2/26.
 */
@RestController
public class TestController {


    @Autowired
    private TestDao testDao;





    @RequestMapping("/hello")
    public SendMessage fun(@RequestBody TestEntity json){
        testDao.save(json);
        testDao.delete(json.getId());
        testDao.count();
        testDao.findOne(json.getId());
        return SendMessage.Success(testDao.findById(json.getId()));
    }

    @RequestMapping("/hello1/{id}")
    public SendMessage fun(@PathVariable Integer id){
        return SendMessage.Success(testDao.findById(id));
    }

}
