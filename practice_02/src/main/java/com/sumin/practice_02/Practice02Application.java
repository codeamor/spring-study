package com.sumin.practice_02;

import com.sumin.practice_02.domain.Course;
import com.sumin.practice_02.domain.CourseRepository;
import com.sumin.practice_02.service.CourseService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.List;

@EnableJpaAuditing
@SpringBootApplication
public class Practice02Application {

    public static void main(String[] args) {
        SpringApplication.run(Practice02Application.class, args);
    }

    // JPA 사용 이해를 위해 임시로 만든 코드

    @Bean
    public CommandLineRunner demo(CourseRepository courseRepository, CourseService courseService) {
        return (args) -> {
            courseRepository.save(new Course("수민이의 Spring", "손수민"));

            System.out.println("데이터 인쇄");
            List<Course> courseList = courseRepository.findAll();
            for (int i = 0; i < courseList.size(); i++) {
                Course course = courseList.get(i);
                System.out.println(course.getId());
                System.out.println(course.getTitle());
                System.out.println(course.getTutor());
            }

            Course new_course = new Course("수민이의 React", "손수민");
            courseService.update(1L, new_course);
            courseList = courseRepository.findAll();
            for (int i = 0; i < courseList.size(); i++) {
                Course course = courseList.get(i);
                System.out.println(course.getId());
                System.out.println(course.getTitle());
                System.out.println(course.getTutor());
            }
        };
    }

}
