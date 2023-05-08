package top.inson.boot.web.biz;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
import top.inson.boot.util.MinioUtil;

/**
 * @author jingjitree
 * @description
 * @date 2022/10/10 16:33
 **/
@Slf4j
@Component
public class ApiHelloBiz {
    @Autowired
    private MinioUtil minioUtil;


    public void upload(MultipartFile file) {
        log.info("上传文件测试 fileName: {}", file.getOriginalFilename());

        String fileUrl = minioUtil.upload(file);
        log.info("文件路径fileUrl：{}", fileUrl);
    }
}
