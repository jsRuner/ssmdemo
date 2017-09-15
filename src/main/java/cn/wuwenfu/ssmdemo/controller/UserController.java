package cn.wuwenfu.ssmdemo.controller;

import cn.wuwenfu.ssmdemo.pojo.User;
import cn.wuwenfu.ssmdemo.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;


@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private IUserService userService;

    @RequestMapping("/showUser")
    public String toIndex(HttpServletRequest request,Model model){
        int userId = Integer.parseInt(request.getParameter("id"));
        User user = this.userService.getUserById(userId);
        model.addAttribute("user", user);
        return "showUser";
    }

    @RequestMapping("/list")
    public String listUser(HttpServletRequest request,Model model){
        List<User> users = this.userService.getUsers();
        model.addAttribute("users",users);
        return "userList";
    }

    @RequestMapping("/get")
    public String getUser(HttpServletRequest request,Model model){
        int userId = Integer.parseInt(request.getParameter("id"));
        User user = this.userService.getUserById(userId);
        model.addAttribute("user", user);
        return "userGet";
    }

    @RequestMapping("/edit")
    public String editUser(HttpServletRequest request,Model model){

        if (request.getMethod().equals("GET")){
            int userId = Integer.parseInt(request.getParameter("id"));
            User user = this.userService.getUserById(userId);
            model.addAttribute("user", user);
            return "userEdit";
        }else{
            User user = new User();
            user.setId(Integer.parseInt(request.getParameter("id")));
            user.setUserName(request.getParameter("userName"));
            user.setPassword(request.getParameter("password"));
            user.setAge(Integer.parseInt(request.getParameter("age")));

            this.userService.editUser(user);
            return "redirect:list";
        }
    }

    @RequestMapping("/add")
    public String addUser(HttpServletRequest request,Model model){

        System.out.println(request.getMethod());

        if (request.getMethod().equals("GET")){
            System.out.println("加载表单");
            return "userAdd";
        }else{

            User user = new User();
            user.setUserName(request.getParameter("userName"));
            user.setPassword(request.getParameter("password"));
            user.setAge(Integer.parseInt(request.getParameter("age")));

            this.userService.addUser(user);


            return "redirect:list";
        }
    }

    @RequestMapping("/delete")
    public String deleteUser(HttpServletRequest request,Model model){
        int userId = Integer.parseInt(request.getParameter("id"));
        this.userService.deleteUser(userId);

        return "redirect:list";
    }


}
