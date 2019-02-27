package com.csbr.prod.Controller;

import com.csbr.prod.Dao.UsersDao;
import com.csbr.prod.Pojo.UsersEntity;
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
public class UsersController {


    @Autowired
    private UsersDao usersDao;

    @RequestMapping("/user")
    public SendMessage fun(@RequestBody UsersEntity jsons){
    //   System.out.println(jsons.getAge());
        // usersDao.save(jsons);
        // usersDao.delete(jsons.getId());
        // usersDao.count();
        // usersDao.findByUsernameAndPassword(jsons.getUsername(),jsons.getPassword());
        // UsersEntity user=(UsersEntity)usersDao.findById(jsons.getId());
        // return SendMessage.Success(usersDao.findById(json.getId()));
        Object aa=usersDao.findByUsernameAndPassword(jsons.getUsername(),jsons.getPassword());
        if(aa==null){
            return SendMessage.Fail("error");
        }
        return SendMessage.Success(aa);
    }

    @RequestMapping("/user1/{id}/{age}")
    public SendMessage fun1(@PathVariable Integer id,@PathVariable Integer age){
        return SendMessage.Success(usersDao.findById(id));
    }

}
