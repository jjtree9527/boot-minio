package top.inson.boot.core;

import io.minio.MinioClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import top.inson.boot.constant.MinioConstant;

/**
 * @author jingjitree
 * @description
 * @date 2022/10/10 15:45
 **/
@Slf4j
@Configuration
public class MinioConfiguration {
    @Autowired
    private MinioConstant minioConstant;

    @Bean
    public MinioClient minioClient(){
        log.info("注入minio客户端");

        return MinioClient.builder()
                .endpoint(minioConstant.getEndpoint())
                .credentials(minioConstant.getAccessKey(), minioConstant.getSecretKey())
                .build();
    }

}
