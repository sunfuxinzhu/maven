package com.sun.ssh01.dao.impl;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.sun.ssh01.dao.UserDao;
import com.sun.ssh01.domain.User;

/**  
 * ClassName:UserDaoImpl <br/>  
 * Function:  <br/>  
 * Date:     2018年3月9日 下午4:38:28 <br/>       
 */
public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

    @Override
    public User findUserById(Integer id) {
        return getHibernateTemplate().get(User.class, id);
    }

}
  
