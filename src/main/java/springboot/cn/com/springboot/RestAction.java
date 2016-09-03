package springboot.cn.com.springboot;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * json返回
 * @author 93501
 *
 */
@RestController
@RequestMapping("rest")
public class RestAction {
		/**
		 * 基本用例
		 * @return
		 */
	 @RequestMapping("/hello")
	    public Object greeting() {
		 	Map<String, String> map = new HashMap<String, String>();
		 	map.put("data", "这是数据");
		 	map.put("result", "1");
	        return map;
	    }
	 /**
	  * 参数传递
	  * @param name
	  * @return
	  */
	 @RequestMapping("/test/{name}")
	    public String greeting2(@PathVariable("name")String name) {
	        return "hello-"+name;
	    }
}
