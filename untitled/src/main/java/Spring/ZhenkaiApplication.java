package Spring;

import zhenkai.service.UserService;

public class ZhenkaiApplication {

    private Class configclass;

    public ZhenkaiApplication(Class configclass){
        this.configclass = configclass;
    }


    public Object getBean(String Beanname, Class<UserService> userServiceClass){
        return null;
    }
}
