package com.gobuy.portal.pojo;

/**
 * Created by ldb on 2017/5/21.
 * 商品基本信息pojo
 */
public class ItemInfo extends com.gobuy.pojo.Item {

    public String[] getImages(){
        if(getImage()!=null){
            String[] images=getImage().split(",");
            return images;
        }
        return null;
    }
}
