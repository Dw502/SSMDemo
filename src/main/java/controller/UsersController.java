package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import pojo.Users;
import pojo.UsersQueryVO;
import service.UsersService;

import java.util.List;

/**
 * @author dw
 * @description TODO
 * @date: 2019/7/14 16:29
 */
@Controller
@RequestMapping("/Users") // 让请求窄化
public class UsersController {
    // 注入对象
    @Autowired
    private UsersService usersService;
    @RequestMapping("/QueryUsers")
    public ModelAndView QueryUsers(UsersQueryVO vo) {
        List<Users> list = usersService.QueryUsersByQueryVO(vo);
        ModelAndView mv = new ModelAndView();
        // 指定数据
        mv.addObject("usersList", list);
        // 指定JSP页面进行显示
        // 配置过视图解析器后省略前后缀
        mv.setViewName("test"); // 否则为“/test.jsp"
        return mv;
    }
}
