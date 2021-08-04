package com.example.springbootstudy.common;

import com.auth0.jwt.interfaces.Claim;
import com.example.springbootstudy.common.annotations.NeedToken;
import com.example.springbootstudy.common.annotations.PassToken;
import com.example.springbootstudy.model.User;
import com.example.springbootstudy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;
import java.util.Map;

/**
 * @author zjianfa
 */
public class TokenInterceptor implements HandlerInterceptor {
    private final static String TOKEN_HEADER = "token";
    @Autowired
    UserService userService;

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object object){
        // 从 http 请求头中取出 token
        String token = httpServletRequest.getHeader(TOKEN_HEADER);

        // 如果不是映射到方法直接通过
        if(!(object instanceof HandlerMethod)){
            return true;
        }

        HandlerMethod handlerMethod=(HandlerMethod)object;
        Method method = handlerMethod.getMethod();

        // 检查是否有 passtoken 注释，有则跳过认证
        if (method.isAnnotationPresent(PassToken.class)) {
            PassToken passToken = method.getAnnotation(PassToken.class);
            if (passToken.required()) {
                return true;
            }
        }

        // 检查有没有需要用户权限的注解
        if (method.isAnnotationPresent(NeedToken.class)) {
            NeedToken userLoginToken = method.getAnnotation(NeedToken.class);
            if (userLoginToken.required()) {
                // 执行认证
                if (token == null) {
                    throw new RuntimeException("无token，请重新登录");
                }
                Map<String, Claim> claimMap = TokenUtil.verifyToken(token);
                // 获取 token 中的 user id
                Long userId =  claimMap.get("uid").asLong();
                User user = userService.findUserByUid(userId);
                if (user == null || user.getPassword() == null) {
                    throw new RuntimeException("用户不存在，请重新登录");
                }
                String newToken = TokenUtil.verifyToken(claimMap,user.getPassword());
                if (!StringUtils.hasLength(newToken)){
                    return false;
                }
                httpServletResponse.setHeader("token", newToken);
            }
        }
        return true;
    }
}
