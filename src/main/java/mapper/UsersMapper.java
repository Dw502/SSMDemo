package mapper;

import pojo.Users;
import pojo.UsersQueryVO;

import java.util.List;

public interface UsersMapper {

    // 定义对数据库的操作
    // 查询所有用户
    public List<Users> queryUsers(UsersQueryVO vo);
    // 根据id查询用户
//    public Users queryUsersById(int id);
}
