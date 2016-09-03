package springboot.cn.com.springboot;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class AsyncTest {
	
	@Async
	public void async1(){
		System.out.println("11");
	}
	
	@Async
	public void async2(){
		System.out.println("22");
	}
	@Async
	public void async3(){
		System.out.println("33");
	}
}
