package com.sumin.practice_02.domain;

import org.springframework.data.jpa.repository.JpaRepository;

// JPA는 인터페이스를 통해서만 쓸 수 있음. 인터페이스는 클래스에서 멤버가 빠진, 메소드 모음집.
public interface CourseRepository extends JpaRepository<Course, Long> {
}