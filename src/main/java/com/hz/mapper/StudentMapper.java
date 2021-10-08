package com.hz.mapper;

import com.hz.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 罗远
 * @date 2021-08-06-17:55
 */
@Mapper
public interface StudentMapper {
    @Select("select * from student")
    public List<Student> findAll();
}
