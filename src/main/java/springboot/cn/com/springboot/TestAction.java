package springboot.cn.com.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import springboot.cn.com.springboot.domain.User;
/**
 * 调整至魔板注解 与 路径注解
 * @author 93501
 *
 */
@Controller
@RequestMapping("model")
public class TestAction {
	
	Logger logger=LoggerFactory.getLogger(TestAction.class);
	
	@Autowired
	 User user;
	
	@Autowired
	AsyncTest Async;

	 /**
	  * 接受参数与传递参数
	  * @param name
	  * @param model
	  * @return
	  */
	 @RequestMapping("/test/{name}")
	    public String greeting2(@PathVariable("name")String name,Model model) {
		 	model.addAttribute("name", name);
		 	Async.async1();Async.async2();Async.async3();
	        return "hello";
	    }
	 
	  	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	    @ResponseBody
	    public String sayWorld(@PathVariable("name") String name) {
	  		logger.info("名字" + user.getName()); 
	        System.out.println("ages:" + user.getAge());
	        return "Hello " + name;
	    }
}
