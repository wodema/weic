package com.gdut.software;

import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

@SpringBootTest
class SoftwareApplicationTests {

    public static void main(String[] args) throws IOException {
        // 读取配置文件mybatis-config.xml
//        InputStream config = Resources.getResourceAsStream("mybatis-config.xml");
//        // 根据配置文件构建SqlSessionFactory
//        SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(config);
//        // 通过SqlSessionFactory创建SqlSession
//        SqlSession ss = ssf.openSession();
//        // SqlSession执行文件中定义的SQL，并返回映射结果
//        // 添加学生
//        Student student = new Student();
//        student.setName("dzq");
//        student.setAge(21);
//        //ss.insert("mapper.StudentMapper.addStudent", student);
//        WrongQuestions wrongQuestions1 = new WrongQuestions();
//        wrongQuestions1.setQuestion("随便");
//        wrongQuestions1.setKind("计算机");
//        wrongQuestions1.setSid(3);
//        WrongQuestions wrongQuestions2 = new WrongQuestions();
//        wrongQuestions2.setQuestion("英语");
//        wrongQuestions2.setKind("计算机");
//        wrongQuestions2.setSid(3);
        //ss.insert("mapper.WrongQuestionsMapper.addWrongQuestion", wrongQuestions1);
        //ss.insert("mapper.WrongQuestionsMapper.addWrongQuestion", wrongQuestions2);
        // 查询所有网站
        //Student student1 = ss.getMapper(com.gdut.software.mapper.StudentMapper.class).selectStudentById(3);
//        List<WrongQuestions> wrongQuestionsList = ss.selectList("selectQuestionsBySid", 3);
//        for(WrongQuestions ws: wrongQuestionsList){
//            System.out.println(ws);
//        }
        //System.out.println(student1);
        // 提交事务
//        ss.commit();
//        // 关闭 SqlSession
//        ss.close();
    }

}
