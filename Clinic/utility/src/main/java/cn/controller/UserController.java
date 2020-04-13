package cn.controller;


import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.HttpClientUtils;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@Slf4j
public class UserController {
    private String serverUrl = "http://localhost:9001";
    private String id = "client";
    private String server = "123";
    private String redirectUri = "http://localhost:9001/login";

    @GetMapping("/oauth2/code")
    public void code(HttpServletResponse response) {
        try {
            String url = serverUrl + "/oauth/authorize?response_type=code&client_id=" + id + "" +
                    "&redirect_url=" + URLEncoder.encode(redirectUri, "UTF-8") + "&scope=app";
            response.sendRedirect(url);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    @GetMapping("/login")
    public String callback(String code,Model model) {
        CloseableHttpClient httpClient = null;
        CloseableHttpResponse httpResponse = null;
        try {
            httpClient = HttpClientBuilder.create().build();
            HttpPost post = new HttpPost(serverUrl + "/oauth/token");
            List<NameValuePair> list = new ArrayList<NameValuePair>();
            list.add(new BasicNameValuePair("grant_type", "authorization_code"));
            list.add(new BasicNameValuePair("scope", "app"));
            list.add(new BasicNameValuePair("redirect_uri", redirectUri));
            list.add(new BasicNameValuePair("code", code));
            list.add(new BasicNameValuePair("client_id", id));
            list.add(new BasicNameValuePair("client_secret", server));
            HttpEntity entity = new UrlEncodedFormEntity(list);
            post.setEntity(entity);
            //post.addHeader("accept","text/html,application/xhtml+xml,q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9");
           // post.addHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/73.0.3683.75 Safari/537.36");

            httpResponse = httpClient.execute(post);
            HttpEntity httpEntity = httpResponse.getEntity();
            System.out.println("结果" + httpResponse.getStatusLine());
            String result = null;
            if (httpEntity != null) {
                result=EntityUtils.toString(httpEntity);
                System.out.println("响应长度"+httpEntity.getContentLength());
            }
            if(httpResponse.getStatusLine().getStatusCode()==200){
                Map<String, String> map = new HashMap<String, String>();
                ObjectMapper om=new ObjectMapper();
                map = om.readValue(result, Map.class);
                System.out.println(map);
                model.addAttribute("token",map);
                return "index";
            }else{
                System.out.println("失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            HttpClientUtils.closeQuietly(httpClient);
            HttpClientUtils.closeQuietly(httpResponse);
        }
        return "error";
    }


}
