package springboot.cn.com.springboot;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;
@Aspect
@Configuration
public class Aop {
	@Pointcut("execution(* springboot.cn.com.springboot.TestAction.greeting2(..))")
	public void pointCut(){
		
	}
	@Before("pointCut()")
	public void before(){
		System.out.println(1223);
	}
	
	@After("pointCut()")
	public void after(){
		System.out.println("after");
	}
}
