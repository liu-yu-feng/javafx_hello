import com.liu.dao.UserDao;
import com.liu.domain.User;
import com.liu.service.UserService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;

public class Test {

    @org.junit.Test
    public void test01(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");

        UserService userService = applicationContext.getBean("userServiceImpl", UserService.class);
        for (User user : userService.queryUser()) {
            System.out.println(user);
        }
//        System.out.println(userService.queryUserById(3));
//        userService.addUser(new User("liuyufeng","123456","898785895","eeeeeeeeee"));
//        userService.updateUser(new User(6,"liuyufeng","520","898785895","eeeeeeeeee"));
//        userService.deleteUser(new User(6,"liuyufeng","123456","898785895","eeeeeeeeee"));
    }
//    @org.junit.Test
//    public void test02() throws IOException {
//        String resource = "mybatis-config.xml";
//        InputStream inputStream = Resources.getResourceAsStream(resource);
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//
//        SqlSession sqlSession = sqlSessionFactory.openSession();
//        UserDao userDao = sqlSession.getMapper(UserDao.class);
//        for (User user : userDao.queryUser()) {
//            System.out.println(user);
//        }
//    }

}
