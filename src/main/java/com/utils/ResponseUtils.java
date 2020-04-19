package com.utils;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;

/**
 * @description 文件下载工具类
 * @date 2019-01-06 15:53
 */
public class ResponseUtils {

    /**
     * 默认的路径是项目布置的static下面的upload中，当然你也可以换成你本地的D:\下面任意一个文件夹下面
     */
    private static final String UPLOAD_PATH = System.getProperty("user.dir") + "\\src\\main\\resources\\static\\upload\\";


    /**
     * 构建下载类
     */
    public static ResponseEntity<byte[]> buildResponseEntity(String fileName) throws IOException {
        //获取文件
        InputStream is = new FileInputStream(UPLOAD_PATH + fileName);
        byte[] body = new byte[is.available()];
        is.read(body);
        HttpHeaders headers = new HttpHeaders();

        //文件名解码
        headers.add("Content-Disposition", "attchement;filename=" + URLEncoder.encode(fileName, "UTF-8"));
        //设置Http状态码
        HttpStatus statusCode = HttpStatus.OK;
        //返回数据
        return new ResponseEntity<>(body, headers, statusCode);
    }
}
