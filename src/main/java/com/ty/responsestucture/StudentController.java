package com.ty.responsestucture;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@PostMapping("/save")
	public ResponseStucture<Student> saveStudent(@RequestBody Student student) {
		ResponseStucture<Student> resp = new ResponseStucture<Student>();
		resp.setStatusCode(200);
		resp.setMessage("success");
		resp.setData(student);

		return resp;

	}

	public String saveStudent() {
		return "message";
	}
	
	public Student saveStudentToDb() {
		return new Student();
	}

}
