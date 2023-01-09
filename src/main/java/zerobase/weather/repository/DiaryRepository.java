package zerobase.weather.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import zerobase.weather.domain.Diary;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface DiaryRepository extends JpaRepository<Diary, Integer> {
    List<Diary> findAllByDate(LocalDate date);

    List<Diary> findAllByDateBetween(LocalDate startDate, LocalDate endDate);

    Diary getFirstByDate(LocalDate date);

    //void deleteById(int id);



    @Transactional  //스프링부트와 db사이의 데이터를 주고받을때 그 과정에서 일어날수있는 예외, 오류들을 바로잡아주는 어노테이션
    void deleteAllByDate(LocalDate date);
}
