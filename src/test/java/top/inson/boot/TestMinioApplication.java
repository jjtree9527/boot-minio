package top.inson.boot;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.inson.boot.util.MinioUtil;

/**
 * @author jingjitree
 * @description
 * @date 2022/10/10 16:52
 **/
@Slf4j
@SpringBootTest
public class TestMinioApplication {
    @Autowired
    private MinioUtil minioUtil;

    @Test
    public void handler(){
        String fileName = "2022-10-10/40d14ae5-39c5-4ac5-8838-4dd6317b3cad.jpg";
        String preview = minioUtil.preview(fileName);
        log.info("预览地址：{}", preview);
    }


}
