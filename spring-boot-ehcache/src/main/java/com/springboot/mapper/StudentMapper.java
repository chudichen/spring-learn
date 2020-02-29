package com.springboot.mapper;

import com.springboot.bean.Student;
import org.apache.ibatis.annotations.*;

/**
 * @author Michael Chu
 * @since 2020-02-29 14:51
 */
@Mapper
public interface StudentMapper {

    @Update("update student set sname=#{name}, ssex=#{sex} where sno=#{sno}")
    int update(Student student);

    @Delete("delete from student where sno=#{sno}")
    void deleteStudentBySno(String sno);

    @Select("select * from student where sno=#{sno}")
    @Results(id = "student", value = { @Result(property = "sno", column = "sno", javaType = String.class),
            @Result(property = "name", column = "sname", javaType = String.class),
            @Result(property = "sex", column = "ssex", javaType = String.class) })
    Student queryStudentBySno(String sno);
}
