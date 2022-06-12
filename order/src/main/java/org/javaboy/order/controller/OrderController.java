package org.javaboy.order.controller;

import io.seata.rm.tcc.api.BusinessActionContext;
import org.javaboy.common.RespBean;
import org.javaboy.common.feign.OrderServiceApi;
import org.javaboy.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 江南一点雨
 * @微信公众号 江南一点雨
 * @网站 http://www.itboyhub.com
 * @国际站 http://www.javaboy.org
 * @微信 a_java_boy
 * @GitHub https://github.com/lenve
 * @Gitee https://gitee.com/lenve
 */
@RestController
public class OrderController implements OrderServiceApi {

    @Autowired
    OrderService orderService;

    @Override
    public boolean prepare(BusinessActionContext actionContext, String userId, String productId, Integer count) {
        return orderService.prepare(actionContext, userId, count,productId);
    }

    @Override
    public boolean commit(BusinessActionContext actionContext) {
        return orderService.commit(actionContext);
    }

    @Override
    public boolean rollback(BusinessActionContext actionContext) {
        return orderService.rollback(actionContext);
    }
}
