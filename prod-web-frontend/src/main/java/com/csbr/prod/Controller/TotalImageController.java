package com.csbr.prod.Controller;

import com.csbr.prod.Dao.TotalImageDao;
import com.csbr.prod.Pojo.TotalImageEntity;
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
public class TotalImageController {


    @Autowired
    private TotalImageDao totalImageDao;

    @RequestMapping("/indexImage")
    public SendMessage indexImage(@RequestBody TotalImageEntity jsons){
        
        return SendMessage.Success(totalImageDao);
    }

    @RequestMapping("/indexImage1/{id}/{src}")
    public SendMessage indexImage1(@PathVariable Integer id,@PathVariable String src){
        return SendMessage.Success(totalImageDao.findById(id));
    }

}
