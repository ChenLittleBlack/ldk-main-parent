package com.ldk.main;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.TimeZone;

/**
 * @author czl
 * @date 2020/09/25 15:20
 */
@SpringBootApplication
@Slf4j
@EntityScan(
        basePackages = {
                "com.ldk.main.entity"
        }
)
@ComponentScan(
        basePackages = {
                "com.ldk.main.service",
                "com.ldk.main"
        }
)
@EnableJpaRepositories(
        basePackages = {
                "com.ldk.main.repository",
                "com.ldk.main"
        }
)
public class LdkRoomApplication {

    public static void main(String[] args) {
        // 时区修正为上海
        TimeZone.setDefault(TimeZone.getTimeZone("Asia/Shanghai"));
        System.setProperty("spring.devtools.restart.enabled", "false");
        ApplicationContext ctx = SpringApplication.run(LdkRoomApplication.class, args);
        log.info(
            "\n" +
            "********************************************************" +
            "\n\n" +
            "[项目启动成功] bean总数:" + ctx.getBeanDefinitionCount() +
            "\n\n" +
            "********************************************************"
        );
    }

}
