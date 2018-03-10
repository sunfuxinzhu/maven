package com.sun.ssh01.service.impl;

import org.springframework.transaction.annotation.Transactional;

import com.sun.ssh01.dao.UserDao;
import com.sun.ssh01.domain.User;
import com.sun.ssh01.service.UserService;

/**  
 * ClassName:UserServiceImpl <br/>  
 * Function:  <br/>  
 * Date:     2018年3月9日 下午5:03:09 <br/>       
 */

@Transactional
public class UserServiceImpl implements UserService {
    private UserDao userDao;
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    @Override
    public User findUserById(Integer id) {
        return userDao.findUserById(id);
    }

}
  
