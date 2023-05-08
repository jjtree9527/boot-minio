package top.inson.boot.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import top.inson.boot.web.biz.ApiHelloBiz;

/**
 * @author jingjitree
 * @description
 * @date 2022/10/10 16:32
 **/
@RestController
@RequestMapping(value = "/hello")
public class ApiHelloController {
    @Autowired
    private ApiHelloBiz apiHelloBiz;


    @PostMapping("/upload")
    public String upload(MultipartFile file){
        apiHelloBiz.upload(file);

        return "success";
    }

}
