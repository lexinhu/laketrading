package com.xn2001.laketrading.laketradingthirdparty;

import com.aliyun.oss.OSSClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

@SpringBootTest
class LaketradingThirdPartyApplicationTests {

    @Autowired
    private OSSClient ossClient;

    @Test
    public void testUpload() throws FileNotFoundException {
        // 上传文件流。
        InputStream inputStream = new FileInputStream("D:\\业务模板图.png");
        ossClient.putObject("laketrading", "3.png", inputStream);
        // 关闭OSSClient。
        ossClient.shutdown();
        System.out.println("上传成功.");
    }


}
