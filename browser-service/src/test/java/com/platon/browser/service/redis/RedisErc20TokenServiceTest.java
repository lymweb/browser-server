package com.platon.browser.service.redis;

import com.alibaba.fastjson.JSONObject;
import com.platon.browser.BrowserServiceApplication;
import com.platon.browser.config.redis.RedisCommands;
import com.platon.browser.config.redis.RedisFactory;
import com.platon.browser.dao.mapper.Erc20TokenMapper;
import com.platon.browser.elasticsearch.dto.Block;
import com.platon.browser.elasticsearch.dto.Transaction;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.redis.core.ZSetOperations;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.util.ReflectionTestUtils;

import javax.annotation.Resource;
import java.util.*;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.Silent.class)
public class RedisErc20TokenServiceTest {
	@Mock
	private RedisFactory redisFactory;
	@Mock
	private Erc20TokenMapper erc20TokenMapper;
	@Mock
	private RedisTemplate<String,String> redisTemplate;
	@Spy
	@InjectMocks
	private RedisErc20TokenService target;

	@Before
	public void setup(){
		ReflectionTestUtils.setField(target,"prefixKey","prefix");
		ReflectionTestUtils.setField(target,"maxItemCount",12);
		when(erc20TokenMapper.totalErc20Token(any())).thenReturn(40);
		ZSetOperations<String,String> operations = mock(ZSetOperations.class);
		when(redisTemplate.opsForZSet()).thenReturn(operations);
		when(redisTemplate.hasKey(any())).thenReturn(true);
		when(operations.size(any())).thenReturn(30L);
		//when(operations.rangeByScore(any(),any(),any())).thenReturn(Collections.EMPTY_SET);
		RedisCommands commands = mock(RedisCommands.class);
		when(redisFactory.createRedisCommands()).thenReturn(commands);
		when(commands.get(anyString())).thenReturn("90");

		ValueOperations<String,String> valueOperations = mock(ValueOperations.class);
		when(redisTemplate.opsForValue()).thenReturn(valueOperations);
		when(redisTemplate.hasKey(any())).thenReturn(true);
	}

	@Test
	public void test() {
		target.getCacheKey();
		target.addTokenCount(55);
		target.getTokenCount();
	}

	
}
