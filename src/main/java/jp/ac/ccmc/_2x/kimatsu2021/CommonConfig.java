package jp.ac.ccmc._2x.kimatsu2021;

import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.SessionTrackingMode;
import java.util.Collections;

@Configuration
public class CommonConfig {

    // URLにセッションIDが付与されないようにする
    @Bean
    public ServletContextInitializer servletContextInitializer() {
        ServletContextInitializer initializer = servletContext -> {
            servletContext.setSessionTrackingModes(
                Collections.singleton(SessionTrackingMode.COOKIE)
            );
        };
        return initializer;
    }

}