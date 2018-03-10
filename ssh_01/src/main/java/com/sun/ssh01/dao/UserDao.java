package com.sun.ssh01.dao;

import com.sun.ssh01.domain.User;

/**  
 * ClassName:UserDao <br/>  
 * Function:  <br/>  
 * Date:     2018年3月9日 下午4:37:56 <br/>       
 */
public interface UserDao {

    User findUserById(Integer id);

}
  
