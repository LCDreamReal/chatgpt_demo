package com.lcdr.chatgpt.service;

import com.lcdr.chatgpt.TestBase;
import com.unfbx.chatgpt.entity.chat.Message;
import jakarta.annotation.Resource;
import org.junit.Test;

public class OpenAi4ChatgptServiceTest extends TestBase {

    @Resource
    private OpenAi4ChatgptService openAi4ChatgptService;

    @Test
    public void testChat() {
        System.out.println(openAi4ChatgptService.chat("请推荐一部好的电影，并附上800字左右的解说"));
    }
}
