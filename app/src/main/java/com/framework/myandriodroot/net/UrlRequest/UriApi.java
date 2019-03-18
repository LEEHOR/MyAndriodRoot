package com.framework.myandriodroot.net.UrlRequest;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * @author Leehor
 * 版本：
 * 创建日期：2019/3/18
 * 描述：
 */
public interface UriApi {
    /**
     * 页面
     * http://192.168.43.173/api/trades/{userId}
     */
  //  @GET("homes/index/{num}.json")
  //  Observable<DailyTimeLine> getDailyTimeLine(@Path("num") String num);


    /**
     * 登录接口
     * http://www.wanandroid.com/user/login
     * @param username 用户名
     * @param password 密码
     */
   // @POST("/user/login")
   // @FormUrlEncoded
   // Observable<DataResponse<User>> login(@Field("username") String username, @Field("password") String password);

}
