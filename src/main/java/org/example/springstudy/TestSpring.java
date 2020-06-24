package org.example.springstudy;

import org.springframework.context.support.ClassPathXmlApplicationContext;

//https://www.youtube.com/watch?v=nLCYk1ySY_U
//При создании проекта spring испрользован архитип org.apache.maven.archetypes:maven-archetype-webapp

/**
 * @author Kirill Zotov
 */
public class TestSpring {
    public static void main(String[] args) {

        //этот класс ClassPathXmlApplicationContext считывает инфу из файла applicationContext.xml и помещает все бины в context
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //достаем Bean из applicationContext.xml по его id="testBean", вызываем через метод getBean()
        //используем два аргумента id="testBean" и объкт какого класса хотим получить TestBean.class
        //Объект класса context.getBean("testBean", TestBean.class); помещаем в переменную testBean
        TestBean testBean = context.getBean("testBean", TestBean.class);
        //Вызовим имя getName() из объекта testBean
        System.out.println(testBean.getName());
        //закрыть context
        context.close();
    }
}
