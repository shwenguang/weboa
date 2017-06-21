package com.harmony.wenguang.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.harmony.wenguang.dao.TestDao;
import com.harmony.wenguang.dao.dataobject.TestDO;

@Controller
public class IndexController {
	@Resource
	TestDao testDao;
    @RequestMapping("*")
	public String no404(){
	    return "404";
	}
	@RequestMapping(value="/hello.do")
	@ResponseBody
	public String index(){
		testDao.create();
		TestDO testDo = new TestDO();
		testDo.setId(1L);
		testDo.setName("YYYY");
		testDao.insert(testDo);
		testDo.setId(2L);
		testDo.setName("22222");
		testDao.insert(testDo);
		List<TestDO> list = testDao.queryAll();
		if(list!=null){
			for(TestDO dd : list){
				System.out.println(dd.getId()+"----"+dd.getName());
			}
		}
		System.out.println(">>>>>>>ssss>>>>>>");
		return "hello world";
	}
	@RequestMapping(value="/tojsp.do")
	public ModelAndView tojsp(){
        ModelAndView mv = new ModelAndView("hello");
        System.out.println(">>>>>>>ssss>>>>>>");
        return mv;
	}
}
