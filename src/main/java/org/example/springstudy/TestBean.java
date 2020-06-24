package org.example.springstudy;

/**
 * @author Kirill Zotov
 */

//Bean и Объект это примерно схожие вещи
public class TestBean {
    private String name;

    public TestBean(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
