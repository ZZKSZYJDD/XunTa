package com.zut.DIUDIU.Control;

import com.google.code.kaptcha.Constants;
import com.google.code.kaptcha.impl.DefaultKaptcha;
import com.google.code.kaptcha.util.Config;
import com.zut.DIUDIU.Dao.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Properties;

@RestController
public class LoginController {


    String kaptchaText = new String();
    @Autowired
    DefaultKaptcha kaptcha;

    @RequestMapping("/loginUser")
    public String login(HttpSession session){
        return "0";
    }

    @RequestMapping( "/registerUser")
    public String register(HttpSession session){
        return "0";
    }

    @Bean
    public DefaultKaptcha initKaptcha(){
        DefaultKaptcha kaptcha = new DefaultKaptcha();
        Properties properties = new Properties();
        Config config = new Config(properties);
        kaptcha.setConfig(config);
        return kaptcha;
    }
    //添加响应头信息
    @RequestMapping(path = "/captcha")
    public void getCaptcha(HttpServletResponse response, HttpSession session) throws IOException {

        //设置Http Cache 响应头
        response.setDateHeader("Expires", 0);
        // Set standard HTTP/1.1 no-cache headers.
        response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate");
        // Set IE extended HTTP/1.1 no-cache headers (use addHeader).
        response.addHeader("Cache-Control", "post-check=0, pre-check=0");
        // Set standard HTTP/1.0 no-cache header.
        response.setHeader("Pragma", "no-cache");

        //设置返回图片的格式
        // return a jpeg
        response.setContentType("image/png");
        // create the text for the image

        //产生随机数
        String capText = kaptcha.createText();
        kaptchaText = capText;
        // store the text in the session
        session.setAttribute(Constants.KAPTCHA_SESSION_KEY, capText);
        // create the image with the text

        //转换成图片并且输出
        BufferedImage bi = kaptcha.createImage(capText);
        ServletOutputStream out = response.getOutputStream();
        // write the data out
        ImageIO.write(bi, "png", out);
        try {
            out.flush();
        } finally {
            out.close();
        }

    }
}
