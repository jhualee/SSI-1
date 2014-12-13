package com.guobin.myweb;

import com.guobin.myweb.service.LoginService;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;

/**
 * Created by withnate on 14-12-13.
 */
public class UserAction extends ActionSupport {

    private static final long serialVersionUID = 1L;

    @Autowired
    LoginService loginService;

    public String execute(){
        return SUCCESS;
    }

    public String login() {
        try {
            HttpServletRequest request = ServletActionContext.getRequest();
            HttpServletResponse response = ServletActionContext.getResponse();
            request.setCharacterEncoding("UTF-8");
            response.setContentType("text/html;charset=utf-8");
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            System.out.println("name->" + username + ",password->"
                    + password);
            if ("admin".equals(username) && "123456".equals(password)) {
                return SUCCESS;
            } else {
                return "login";
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return SUCCESS;
    }
}
