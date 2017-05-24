package com.gobuy.portal.pojo;

/**
 * Created by ldb on 2017/5/23.
 */
public class CartItem {

    private long id;
    private String title;
    private long price;
    private String image;
    private Integer num;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String[] getImages(){
        if(getImage()!=null){
            String[] images=getImage().split(",");
            return images;
        }
        return null;
    }


}
