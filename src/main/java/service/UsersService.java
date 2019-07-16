package service;

import mapper.UsersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.Users;
import pojo.UsersQueryVO;

import java.util.List;

/**
 * @author dw
 * @description TODO
 * @date: 2019/7/14 16:29
 */
@Service
public class UsersService {
    // 注入对象
    @Autowired
    private UsersMapper usersMapper;
    // 查询所有用户
    public List<Users> QueryUsersByQueryVO(UsersQueryVO vo) {
        List<Users> list = usersMapper.queryUsers(vo);
        return list;
    }
}
