package com.example.demo.web;

import com.alibaba.fastjson.JSON;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String index() {
        return "Hello World!";
    }

    @RequestMapping("/getinfo")
    public String getinfo() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("message", "success");
        map.put("code", "1");
        map.put("version", "0.0.1.003");
        String mapJson = JSON.toJSONString(map);
        return mapJson;
    }
}
