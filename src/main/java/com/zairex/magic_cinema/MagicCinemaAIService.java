package com.zairex.magic_cinema;
import dev.langchain4j.service.AiServices;
import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.V;
import dev.langchain4j.service.spring.AiService;

@AiService
public interface MagicCinemaAIService {
    @UserMessage("""
            Generate a welcoming greeting to the managing movies platform called {{platform}}
            use less than 120 characters and use enthusiastic tone
            """)
    String generateGreeting(@V("platform") String platform);

}
