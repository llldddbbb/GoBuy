package com.gobuy.portal.service.impl;

import com.gobuy.common.pojo.GoBuyResult;
import com.gobuy.common.util.HttpClientUtil;
import com.gobuy.common.util.JsonUtils;
import com.gobuy.pojo.ItemDesc;
import com.gobuy.pojo.ItemParamItem;
import com.gobuy.portal.pojo.ItemInfo;
import com.gobuy.portal.service.ItemService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by ldb on 2017/5/21.
 */
@Service
public class ItemServiceImpl implements ItemService {

    @Value("${REST_BASE_URL}")
    private String REST_BASE_URL;

    @Value("${ITEM_INFO_URL}")
    private String ITEM_INFO_URL;

    @Value("${ITEM_DESC_URL}")
    private String ITEM_DESC_URL;

    @Value("${ITEM_PARAM_URL}")
    private String ITEM_PARAM_URL;

    @Override
    public ItemInfo getItemById(long itemId) {
        try{
            String json = HttpClientUtil.doGet(REST_BASE_URL + ITEM_INFO_URL + itemId);
            if(StringUtils.isNotBlank(json)){
                GoBuyResult goBuyResult = GoBuyResult.formatToPojo(json,ItemInfo.class);
                if(goBuyResult.getStatus()==200){
                    return (ItemInfo)goBuyResult.getData();
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String getItemDescById(long itemId) {
        try{
            String json = HttpClientUtil.doGet(REST_BASE_URL + ITEM_DESC_URL + itemId);
            if(StringUtils.isNotBlank(json)){
                GoBuyResult goBuyResult = GoBuyResult.formatToPojo(json,ItemDesc.class);
                if(goBuyResult.getStatus()==200){
                    ItemDesc itemDesc=(ItemDesc)goBuyResult.getData();
                    return itemDesc.getItem_desc();
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String getItemParamById(long itemId) {
        try{
            String json = HttpClientUtil.doGet(REST_BASE_URL + ITEM_PARAM_URL + itemId);
            if(StringUtils.isNotBlank(json)){
                GoBuyResult goBuyResult = GoBuyResult.formatToPojo(json,ItemParamItem.class);
                if(goBuyResult.getStatus()==200){
                    ItemParamItem itemParamItem=(ItemParamItem)goBuyResult.getData();
                    String paramData = itemParamItem.getParam_data();
                    //生成html
                    // 把规格参数json数据转换成java对象
                    List<Map> jsonList = JsonUtils.jsonToList(paramData, Map.class);
                    StringBuffer sb = new StringBuffer();
                    sb.append("<table cellpadding=\"0\" cellspacing=\"1\" width=\"100%\" border=\"0\" class=\"Ptable\">\n");
                    sb.append("    <tbody>\n");
                    for(Map m1:jsonList) {
                        sb.append("        <tr>\n");
                        sb.append("            <th class=\"tdTitle\" colspan=\"2\">"+m1.get("group")+"</th>\n");
                        sb.append("        </tr>\n");
                        List<Map> list2 = (List<Map>) m1.get("params");
                        for(Map m2:list2) {
                            sb.append("        <tr>\n");
                            sb.append("            <td class=\"tdTitle\">"+m2.get("k")+"</td>\n");
                            sb.append("            <td>"+m2.get("v")+"</td>\n");
                            sb.append("        </tr>\n");
                        }
                    }
                    sb.append("    </tbody>\n");
                    sb.append("</table>");
                    //返回html片段
                    return sb.toString();
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return "";
    }
}
