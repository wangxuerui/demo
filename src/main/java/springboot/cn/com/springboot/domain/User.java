package springboot.cn.com.springboot.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
//注入对象
@Component
public class User {
	
	//读取配置文件
	@Value("${name}")
	private String name;
	@Value("${age}")
	private Integer age;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	

}
