package com.example.springbootstudy.controller.api;

import com.example.springbootstudy.common.ChatException;
import com.example.springbootstudy.common.Response;
import com.example.springbootstudy.common.ErrorCode;
import com.example.springbootstudy.common.TokenUtil;
import com.example.springbootstudy.common.annotations.NeedToken;
import com.example.springbootstudy.controller.UserApi;
import com.example.springbootstudy.controller.req.LoginReq;
import com.example.springbootstudy.controller.req.SetUserReq;
import com.example.springbootstudy.controller.req.SignInReq;
import com.example.springbootstudy.controller.vo.TokenVo;
import com.example.springbootstudy.controller.vo.UidVo;
import com.example.springbootstudy.controller.vo.UserInfoVo;
import com.example.springbootstudy.model.User;
import com.example.springbootstudy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zjianfa
 */
@RestController
public class UserController implements UserApi {

    @Autowired
    private UserService userService;

    @Override
    public Response<UidVo> signIn(SignInReq req) {
        UidVo uidVo = new UidVo();
        try {
            Long uid = userService.signUser(req);
            uidVo.setUid(uid);
        }catch (ChatException e){
            return Response.getFail(e.getCode(), e.getMsg());
        }
        return Response.getOk(uidVo);
    }

    @Override
    public Response<TokenVo> loginIn(LoginReq req) {
        User dbUser = null;
        if (req.getUid() == null && !StringUtils.hasLength(req.getEmail())){
            return Response.getFail(ErrorCode.AUTH_ERROR.getCode(), ErrorCode.AUTH_ERROR.getMsg());
        }
        if (req.getUid() != null){
            dbUser = userService.findUserByUid(req.getUid());
        }else{
            dbUser = userService.findUserByEmail(req.getEmail());
        }
        if (dbUser == null || !dbUser.getPassword().equals(req.getPassword())){
            return Response.getFail(ErrorCode.AUTH_ERROR.getCode(), ErrorCode.AUTH_ERROR.getMsg());
        }
        TokenVo tokenVo = new TokenVo();
        String token = TokenUtil.createToken(String.valueOf(dbUser.getUid()), dbUser.getPassword());
        tokenVo.setToken(token);
        return Response.getOk(tokenVo);
    }

    @Override
    public Response<Void> loginOut(User user) {
        return null;
    }

    @Override
    @NeedToken
    public Response<List<User>> getAllUserList() {
        List<User> userList = userService.getAllUser(5);
        return Response.getOk(userList);
    }

    @Override
    public Response<UserInfoVo> getPersonInfo() {
        // TODO
        return null;
    }

    @Override
    public Response<Boolean> setUserInfo(SetUserReq req) {
        System.out.println(req.toString());
        return Response.getOk(true);
    }

    @Override
    public Response<Boolean> modifiedUserInfo(SetUserReq req) {
        return null;
    }
}
