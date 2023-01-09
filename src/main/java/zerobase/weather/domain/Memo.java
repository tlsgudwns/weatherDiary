package zerobase.weather.domain;


import jdk.nashorn.internal.objects.annotations.Constructor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "memo")
public class Memo { //스프링부트의 이 클래스와 데이터베이스의 테이블을 매핑하는것이 JPA이다
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String text;
}
