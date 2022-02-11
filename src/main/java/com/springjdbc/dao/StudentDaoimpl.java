package com.springjdbc.dao;
import javax.swing.tree.RowMapper;
import com.springjdbc.dao.rowMappingIms;
import org.springframework.jdbc.core.JdbcTemplate;
import com.springjdbc.entities.Student;
public class StudentDaoimpl implements StudentDao
{
    private JdbcTemplate jdbcTemplate;
	@Override
	public int insert(Student student) 
	{
		String query = "insert into springjdbc(id,name,city) values(?,?,?)";
		int r = this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
	    return r;
	}
	@Override
	public int change(Student student) 
	{
		String query2 = "update springjdbc set name=? , city=?  where id=?";
		int r2 =  this.jdbcTemplate.update(query2,student.getName(),student.getCity(),student.getId());
		return r2;
	}
	@Override
	public int remove(int studentId) 
	{
		String query3 = "DELETE FROM springjdbc where id=?";
		int r3 = this.jdbcTemplate.update(query3,studentId);
		return r3;
	}
	@Override
	public Student getStudent(int studentId) 
	{
		String query4 = "select * from springjdbc where id=?";
		rowMappingIms rowMapper=new  rowMappingIms();
		Student student=this.jdbcTemplate.queryForObject(query4, rowMapper,studentId);
		return student;
	}
	public JdbcTemplate getJdbcTemplate() 
	{
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) 
	{
		this.jdbcTemplate = jdbcTemplate;
	}

	
	
    
}
