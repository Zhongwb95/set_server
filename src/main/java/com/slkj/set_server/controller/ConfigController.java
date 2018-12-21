package com.slkj.set_server.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slkj.set_server.entity.Config;

@RestController
public class ConfigController {
	
	@RequestMapping("/config")
	public Config index(Integer number) {
		Config cc = new Config();
		cc.setNumber(number);
		cc.setPort("8808");
		cc.setUrl("http:\\baidu.com");
        return cc;
    }
}
