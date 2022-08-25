package com.zjw.oa.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.zjw.oa.entity.Gsgg;
import com.zjw.oa.entity.Xmjd;
import com.zjw.oa.service.GgService;
import com.zjw.oa.util.JsonUtil;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/gsxx")
public class GgController {

    @Resource
    private GgService ggService;

    /**
     * 公告
     * @return
     */
    @RequestMapping(value = "/gsgg")
    @ResponseBody
    @CrossOrigin
    public JSONArray getGgList() {
        List<Gsgg> list = ggService.getGgList();
        String jsonStr = JsonUtil.serializeDate(list);
        return JSON.parseArray(jsonStr);
    }

    @RequestMapping(value = "/addGg")
    @ResponseBody
    @CrossOrigin
    public JSONObject addGg(@RequestBody Gsgg gsgg) {

        try{
            ggService.addGg(gsgg);
        }catch (Exception e){
            e.printStackTrace();
            return JSON.parseObject("{success:false,msg:\"失败！\"}");
        }
        return JSON.parseObject("{success:true,msg:\"成功！\"}");
    }

    @RequestMapping(value = "/delGg")
    @ResponseBody
    @CrossOrigin
    public JSONObject delGg(@RequestBody Gsgg gsgg) {

        try{
            ggService.delGg(gsgg);
        }catch (Exception e){
            e.printStackTrace();
            return JSON.parseObject("{success:false,msg:\"失败！\"}");
        }
        return JSON.parseObject("{success:true,msg:\"成功！\"}");
    }

    /**
     * 项目进度
     * @return
     */
    @RequestMapping(value = "/xmjd")
    @ResponseBody
    @CrossOrigin
    public JSONArray getXmList() {
        List<Xmjd> list = ggService.getxmList();
        String jsonStr = JsonUtil.serializeDate(list);
        return JSON.parseArray(jsonStr);
    }

}
