package com.xujd.controller;

import com.xujd.model.UserInfo;
import com.xujd.service.UserInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;


@Controller
@RequestMapping("/user")
public class UserInfoController {
    @Resource
    private UserInfoService userInfoService;

    /**
     * 用户登入
     * @param userInfo
     * @return
     */
    @RequestMapping("/login")
    public String login(UserInfo userInfo, Model model){
        String msg="";
        //根据登入账号判断该用户是否存在
        UserInfo user = userInfoService.selectUserByLoginName(userInfo.getLoginName());
        if(user==null){
            msg="该用户不存在！";
        }else{
            if(user.getPassword().equals(userInfo.getPassword())){
                //验证成功进入主界面
                model.addAttribute("userInfo",user);
                return "/main";
            }else{
                msg="密码错误！";
            }
        }
        model.addAttribute("msg",msg);
        return "/login";
    }

}
