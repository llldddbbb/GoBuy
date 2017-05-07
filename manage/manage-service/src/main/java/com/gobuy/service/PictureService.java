package com.gobuy.service;

import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

/**
 * Created by ldb on 2017/5/7.
 */
public interface PictureService {

    Map uploadPicture(MultipartFile file);
}
