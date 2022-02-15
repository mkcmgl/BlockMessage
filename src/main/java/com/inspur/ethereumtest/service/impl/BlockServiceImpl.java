package com.inspur.ethereumtest.service.impl;
import com.alibaba.fastjson.JSONObject;
import com.inspur.ethereumtest.pojo.Blockbynumber;
import com.inspur.ethereumtest.service.BlockService;
import com.inspur.ethereumtest.util.HttpClientUtil;
import org.springframework.stereotype.Service;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;
/**

 * @Description: ${todo}
 * @date 2022/1/21 22:48
 */
@Service("request")
public class BlockServiceImpl implements BlockService {
    private final static String url = "https://mainnet.infura.io/v3/be9b66ce5b594ca5b6a4b286695ac9b0";
    /**
     * 获取区块高度
     * @param map
     * @return
     */
    @Override
    public JSONObject getBlockMessage(Map<String, Object> map) {
        String post = "";
        JSONObject data = new JSONObject();
        if (map.size() > 0) {
            data = (JSONObject) JSONObject.toJSON(map);
        }
        try {
            post = HttpClientUtil.post(url, data);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return (JSONObject) JSONObject.parse(post);
    }


}