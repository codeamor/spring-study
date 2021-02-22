package com.sumin.practice_02;

import com.sumin.practice_02.domain.Course;
import com.sumin.practice_02.domain.CourseRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class Practice02Application {

    public static void main(String[] args) {
        SpringApplication.run(Practice02Application.class, args);
    }

    // JPA 사용 이해를 위해 임시로 만든 코드
    @Bean
    public CommandLineRunner demo(CourseRepository repository) {
        return (args) -> {

            Course course1 = new Course("Spring", "손수민");
            repository.save(course1);

            List<Course> courseList = repository.findAll();

            for (int i = 0; i < courseList.size(); i++) {
                Course c = courseList.get(i);
                System.out.println(c.getTitle());
                System.out.println(c.getTutor());
            }
        };
    }

}
