package com.zjw.oa.service;

import com.zjw.oa.entity.Dk;
import com.zjw.oa.entity.Dto.UserDto;
import com.zjw.oa.entity.Hys;
import com.zjw.oa.entity.User;

import java.util.List;

public interface UserService {

    User login(User user);

    List<User> getUserList(User user);

    void addDk(Dk dk) throws Exception;

    List<UserDto> getDkList(UserDto userDto);

    List<Hys> hysList();

    void updateHys(Hys hys)throws Exception;
    User getUser(User user);

}
