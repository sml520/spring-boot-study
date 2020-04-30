package com.sxb.bean;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;


/**
 *
 * @author 张元亮
 * @date 2020/4/3
 */
@Data
@Slf4j
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    private String name;

    private int age;

    public void test() {
        log.info("打印日志信息...");
    }

    public static void main(String[] args) throws JsonProcessingException {

        Person person = new Person();
        person.setName("张三");
        person.setAge(18);

        ObjectMapper mapper = new ObjectMapper();
        // 将java对象转换为json字符串
        String json = mapper.writeValueAsString(person);
        System.out.println(json);

        // 将json字符串转换为java对象
        Person p = mapper.readValue(json, Person.class);
        System.out.println(p);
    }
}
