package zerobase.weather;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication	//이 클래스가 스프링부트의 가장 큰 단위이다
@EnableTransactionManagement //이걸 붙이면 이 프로젝트 안에서 transaction이 동작하게된다
@EnableScheduling 		//이걸 붙여야 스케쥴링 기능을 사용할수있다
				//스케쥴링은 특정 시간이 되었을때 자동으로 특정 작업을 수행하도록하는 것이다
public class WeatherApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeatherApplication.class, args);
	}

}
