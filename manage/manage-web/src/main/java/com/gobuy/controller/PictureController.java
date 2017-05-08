package com.gobuy.controller;

import com.gobuy.service.PictureService;
import com.gobuy.common.util.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

/**
 * Created by ldb on 2017/5/7.
 */
@Controller
public class PictureController {

    @Autowired
    private PictureService pictureService;

    @RequestMapping("/pic/upload")
    @ResponseBody
    public String uploadPic(MultipartFile uploadFile){
        Map map = pictureService.uploadPicture(uploadFile);
        String json = JsonUtils.objectToJson(map);
        return json;
    }

}
