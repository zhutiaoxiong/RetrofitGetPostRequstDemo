package com.example.maintest;

import java.util.HashMap;
import java.util.Map;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Path;
@Deprecated
public interface GetRequest_Interface {
//    @GET("openapi.do?keyfrom=Yanzhikai&key=2032414398&type=data&doctype=json&version=1.1&q=car")
//    Call<Translation>  getCall();
//    // @GET注解的作用:采用Get方法发送网络请求
//
//    // getCall() = 接收网络请求数据的方法
//    // 其中返回类型为Call<*>，*是接收数据的类（即上面定义的Translation类）
//    // 如果想直接获得Responsebody中的内容，可以定义网络请求返回值为Call<ResponseBody>
//
//    /**
//     * method：网络请求的方法（区分大小写）
//     * path：网络请求地址路径
//     * hasBody：是否有请求体
//     */
//    @HTTP(method = "GET", path = "blog/{id}", hasBody = false)
//    Call<ResponseBody> getCall(@Path("id") int id);
//    // {id} 表示是一个变量
//    // method 的值 retrofit 不会做处理，所以要自行保证准确
//
//
//    /**
//     *表明是一个表单格式的请求（Content-Type:application/x-www-form-urlencoded）
//     * <code>Field("username")</code> 表示将后面的 <code>String name</code> 中name的取值作为 username 的值
//     */
//    @POST("/form")
//    @FormUrlEncoded
//    Call<ResponseBody> testFormUrlEncoded1(@Field("username") String name, @Field("age") int age);
//
//    /**
//     * {@link Part} 后面支持三种类型，{@link RequestBody}、{@link okhttp3.MultipartBody.Part} 、任意类型
//     * 除 {@link okhttp3.MultipartBody.Part} 以外，其它类型都必须带上表单字段({@link okhttp3.MultipartBody.Part} 中已经包含了表单字段的信息)，
//     */
//    @POST("/form")
//    @Multipart
//    Call<ResponseBody> testFileUpload1(@Part("name") RequestBody name, @Part("age") RequestBody age, @Part MultipartBody.Part file);
//
//
//
//    // 具体使用
//    GetRequest_Interface service = retrofit.create(GetRequest_Interface.class);
//    // @FormUrlEncoded
//    Call<ResponseBody> call1 = service.testFormUrlEncoded1("Carson", 24);
//
//    //  @Multipart
//    RequestBody name = RequestBody.create(textType, "Carson");
//    RequestBody age = RequestBody.create(textType, "24");
//
//    MultipartBody.Part filePart = MultipartBody.Part.createFormData("file", "test.txt", file);
//    Call<ResponseBody> call3 = service.testFileUpload1(name, age, filePart);
//
//
//    /**
//     *表明是一个表单格式的请求（Content-Type:application/x-www-form-urlencoded）
//     * <code>Field("username")</code> 表示将后面的 <code>String name</code> 中name的取值作为 username 的值
//     */
//    @POST("/form")
//    @FormUrlEncoded
//    Call<ResponseBody> testFormUrlEncoded2(@Field("username") String name, @Field("age") int age);
//
//    /**
//     * Map的key作为表单的键
//     */
//    @POST("/form")
//    @FormUrlEncoded
//    Call<ResponseBody> testFormUrlEncoded2(@FieldMap Map<String, Object> map);
//
//
//
//    // 具体使用
//    // @Field
//    Call<ResponseBody> call2 = service.testFormUrlEncoded1("Carson", 24);
//
//    // @FieldMap
//    // 实现的效果与上面相同，但要传入Map
//    Map<String, Object> map = new HashMap<>();
//        map.put("username", "Carson");
//                map.put("age", 24);
//                Call<ResponseBody> call3 = service.testFormUrlEncoded2(map);
}
