package com.sun.ssh01.web;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.sun.ssh01.domain.User;
import com.sun.ssh01.service.UserService;

/**  
 * ClassName:UserAction <br/>  
 * Function:  <br/>  
 * Date:     2018年3月9日 下午5:04:55 <br/>       
 */
public class UserAction extends ActionSupport implements ModelDriven<User> {
    
    private User model=new User();
    
    @Override
    public User getModel() {
        return model;
    }
   /* private Integer id;
    public void setId(Integer id) {
        this.id = id;
    }*/
    private UserService userService;
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
    public String findUserById(){
        System.out.println();
        model = userService.findUserById(model.getId());
        return SUCCESS;
    }
}
  
