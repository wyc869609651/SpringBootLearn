package com.example.demo.dao;

import com.example.demo.entity.UserBean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDaoTest {

    @Autowired
    private  UserDao userDao;

    @Test
    public void testInsert(){
        Date date = new Date();
        String dateStr = SimpleDateFormat.getDateTimeInstance().format(date);
        UserBean user = new UserBean("wx04", "123456", "wx04@qq.com", "啊啦啦啦", dateStr);
        userDao.insert(user);
        System.out.println(user);
    }

    @Test
    public void testUpdate(){
        userDao.updateNickName("wx04", "哒哒哒");
        List<UserBean> userList = userDao.getAll();
        for (UserBean user :
                userList) {
            System.out.println(user);
        }
    }

    @Test
    public void testDelete(){
        userDao.delete("wx04");
        List<UserBean> userList = userDao.getAll();
        for (UserBean user :
                userList) {
            System.out.println(user);
        }
    }
}
