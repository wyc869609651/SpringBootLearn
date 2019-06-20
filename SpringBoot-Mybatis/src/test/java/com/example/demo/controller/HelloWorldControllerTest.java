package com.example.demo.controller;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloWorldControllerTest {
    private MockMvc mvc;

    //初始化执行
    @Before
    public void setUp(){
        mvc = MockMvcBuilders.standaloneSetup(new HelloWorldController()).build();
    }

    //验证controller是否正常相应，并返回打印结果
    @Test
    public void getHello() throws Exception{
        mvc.perform(MockMvcRequestBuilders.get("/helloWorld/hello").accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print())
                .andReturn();
    }

    @Test
    public void testHello() throws Exception{
        mvc.perform(MockMvcRequestBuilders.get("/helloWorld/hello").accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(Matchers.equalTo("Hello world!")));
    }
}
