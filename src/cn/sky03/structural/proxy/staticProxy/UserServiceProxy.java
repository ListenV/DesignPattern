package cn.sky03.structural.proxy.staticProxy;

import cn.sky03.structural.proxy.staticProxy.service.UserService;

public class UserServiceProxy implements UserService {

    private final UserService userService;

    public UserServiceProxy(UserService userService) {
        this.userService = userService;
    }

    public void add() {
        log("add前");
        userService.add();
        log("add后");
    }

    public void del() {
        log("del");
        userService.del();
    }

    public void update() {
        log("update");
        userService.update();
    }

    public void query() {
        log("query");
        userService.query();
    }

    public void log(String msg){
        System.out.println("执行"+msg+"方法");
    }
}
