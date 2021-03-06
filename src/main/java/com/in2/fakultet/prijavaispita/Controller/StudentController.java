
package com.in2.fakultet.prijavaispita.Controller;

import com.in2.fakultet.prijavaispita.Entity.Student;
import com.in2.fakultet.prijavaispita.Service.StudentService;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 *
 * @author nosto
 */

@RestController
@RequestMapping("/student")
public class StudentController {
    
    private StudentService studentService;
    
    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    
    @RequestMapping(method = RequestMethod.GET) 
    public Collection<Student> getAllStudents() {
        return studentService.getAllStudents();
    }
    
    @RequestMapping (value = "/{id}", method = RequestMethod.GET)
    public Student findById (@PathVariable("id")int id ){
        return studentService.findById(id);
    }
    
    
    @RequestMapping (method = RequestMethod.POST)
    public void save(@RequestBody Student student){
        studentService.save(student);
    }
 
   
    @RequestMapping (value = "/{id}", method = RequestMethod.DELETE)
    public void delete (@PathVariable("id")int id ){
        studentService.delete(id);
    }
    
}

