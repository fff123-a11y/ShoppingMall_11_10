package zhenkai;

import Spring.ConponentScan;
import Spring.ZhenkaiApplication;
import zhenkai.service.UserService;

@ConponentScan("com.Spring")

public class Test {
    public static void main(String[] args) {
        ZhenkaiApplication application = new ZhenkaiApplication(AppConfig.class);

        UserService userService = (UserService) application.getBean("userService",UserService.class);
//        userService.test();
    }
}
