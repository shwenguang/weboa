package com.harmony.wenguang.service.impl;

import org.springframework.stereotype.Service;

import com.harmony.wenguang.service.HtmlService;

@Service
public class HtmlServiceImpl implements HtmlService{
	@Override
	public String getHtml(String path) {
		return "<html><p>Hello Html</p></html>";
	}

}
