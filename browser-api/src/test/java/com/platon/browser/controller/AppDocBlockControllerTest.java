package com.platon.browser.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultHandler;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.alibaba.fastjson.JSONObject;
import com.platon.browser.BrowserApiApplication;
import com.platon.browser.req.PageReq;

@WebAppConfiguration
@RunWith(SpringRunner.class)
@SpringBootTest(classes = BrowserApiApplication.class)
@AutoConfigureMockMvc
public class AppDocBlockControllerTest {
    @Autowired
    private WebApplicationContext wac;
    private MockMvc mockMvc;

    @Before
    public void setUp() throws Exception {
        mockMvc = MockMvcBuilders.webAppContextSetup(wac).build(); //初始化MockMvc对象
    }
    
    @Test
    public void blockList() throws Exception{
    	PageReq pageReq = new PageReq();
    	pageReq.setPageNo(0);
    	pageReq.setPageSize(10);
    	mockMvc
    		.perform(MockMvcRequestBuilders.post("/block/blockList")
    		.contentType(MediaType.APPLICATION_JSON_UTF8)
    		.content(JSONObject.toJSONString(pageReq).getBytes()))
    		.andExpect(status().isOk()).andDo(print());
    }
    
    @Test
    public void blockListByNodeId() throws Exception{
    	String requestBody = "{\"nodeId\":\"001\"}";
    	mockMvc
    		.perform(MockMvcRequestBuilders.post("/block/blockListByNodeId")
    		.contentType(MediaType.APPLICATION_JSON_UTF8)
    		.content(requestBody.getBytes()))
    		.andExpect(status().isOk()).andDo(print());
    }
    
    @Test
    public void blockListByNodeIdDownload() throws Exception{
    	mockMvc
    		.perform(MockMvcRequestBuilders.get("/block/blockListByNodeIdDownload")
    		.param("nodeId", "0xef97cb9caf757c70e9aca9062a9f6607ce89c3e7cac90ffee56d3fcffffa55aebd20b48c0db3924438911fd1c88c297d6532b434c56dbb5d9758f0794c6841dc")
    		.param("date", "2019-08-20")
    		.accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
    		.andDo(
				new ResultHandler() {
					@Override
					public void handle(MvcResult result) throws Exception {
						result.getResponse().setCharacterEncoding("UTF-8");
						MockHttpServletResponse contentRespon = result.getResponse();
						InputStream in = new ByteArrayInputStream(contentRespon.getContentAsByteArray());
						FileOutputStream fos = new FileOutputStream(new File("aaa.csv"));
						byte[] byteBuf = new byte[1024];
						while(in.read(byteBuf)!=-1) {
							fos.write(byteBuf);
						}
						fos.close();
					}
			});
    }
    
    @Test
    public void blockDetails() throws Exception{
    	String requestBody = "{\"number\":123}";
    	mockMvc
    		.perform(MockMvcRequestBuilders.post("/block/blockDetails")
    		.contentType(MediaType.APPLICATION_JSON_UTF8)
    		.content(requestBody.getBytes()))
    		.andExpect(status().isOk()).andDo(print());
    }
    
    @Test
    public void blockDetailNavigate() throws Exception{
    	String requestBody = "{\"number\":123,\"direction\":\"next\"}";
    	mockMvc
	    	.perform(MockMvcRequestBuilders.post("/block/blockDetailNavigate")
	    	.contentType(MediaType.APPLICATION_JSON_UTF8)
	    	.content(requestBody.getBytes()))
	    	.andExpect(status().isOk()).andDo(print());
    }
    
}