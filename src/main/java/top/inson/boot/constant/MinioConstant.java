package top.inson.boot.constant;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author jingjitree
 * @description
 * @date 2022/10/10 15:43
 **/
@Getter
@Setter
@Component
@ConfigurationProperties(prefix = "minio")
public class MinioConstant {

    private String endpoint;
    private String bucketName;
    private String accessKey;
    private String secretKey;

}
