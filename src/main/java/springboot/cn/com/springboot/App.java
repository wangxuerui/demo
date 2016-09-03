package springboot.cn.com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * Hello world!
 * 程序启动主方法
 */
@EnableAsync
@SpringBootApplication
public class App 
{		
	
		/**
		 * 启动方式分为俩种 1.mian方法入口，2。mvn springboot:run
		 * @param args
		 */
	    public static void main(String[] args) {
	    	SpringApplication app = new SpringApplication(App.class);
	    	//禁止使用命令执行
	    	app.setAddCommandLineProperties(false);
	        app.run(args);
	    }
}
