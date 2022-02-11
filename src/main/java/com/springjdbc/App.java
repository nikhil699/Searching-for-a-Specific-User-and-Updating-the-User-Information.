package com.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springjdbc.dao.StudentDao;
import com.springjdbc.entities.Student;
public class App 
{
  public static void main(String[] args) 
  {
    
    ApplicationContext context = new ClassPathXmlApplicationContext("com/springjdbc/index.xml");
    StudentDao studentdao = context.getBean("studentdao",StudentDao.class);
 //   Student student = new Student();
//    student.setId(666);
//    student.setName("John");
//    student.setCity("Lucknow");
//    int result = studentdao.insert(student);
//    update query
//    student.setId(666);
//    student.setName("Johny");
//    student.setCity("Kashmir");
//    int result = studentdao.change(student);
//    System.out.println("Record Changed "+result);

//    int result = studentdao.remove(666);
//    System.out.println("Record Removed "+result);
    Student student = studentdao.getStudent(103);
    System.out.println(student);
  }
}

//insert query
// String query = "insert into springjdbc(id,name,city) values(?,?,?)";



