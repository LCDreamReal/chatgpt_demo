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
        System.out.println(openAi4ChatgptService.chat("春江潮水连海平，海上明月共潮生，整首诗"));
    }
}
