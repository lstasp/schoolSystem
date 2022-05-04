package com.school.students.demo.jpaschool;

import com.school.students.demo.jpaschool.services.SearchService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
@TestPropertySource(locations = "classpath:application-test.properties")
class JpaSchoolApplicationTests {

	@Autowired
	private SearchService searchService;

	@Test
	void contextLoads() {
	}

	@Test
	@Sql(scripts = "insert-studentCourses.sql", executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD)
	@Sql(scripts = "delete-studentCourses.sql", executionPhase = Sql.ExecutionPhase.AFTER_TEST_METHOD)
	void queryCoursesByStudentTest(){
		assert(searchService.queryCoursesByStudent(1)).equals(2L);
	}

}
