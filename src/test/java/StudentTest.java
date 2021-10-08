import com.BootApplication;
import com.hz.mapper.StudentMapper;
import com.hz.pojo.Student;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @Author luoyuan
 * @Date 2021/8/7  17:34
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = BootApplication.class)
public class StudentTest {

    @Autowired
    private StudentMapper studentMapper;

    @Test
    public void test(){
        List<Student> list = studentMapper.findAll();
        for (Student student : list) {
            System.out.println(student);
        }
    }

}
