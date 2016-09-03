package springboot.cn.com.springboot;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
/**
 * 打包War包
 * @author 93501
 *
 */
public class ServletInitializer extends SpringBootServletInitializer {  
	  
    @Override  
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {  
        return application.sources(App.class);  
    }  
  
} 