package com.baseurak.AwesomeGreat;

import com.baseurak.AwesomeGreat.post.PostService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.assertj.core.api.Assertions.*;

public class AppConfigTest {

    @Test
    void basicScan() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        String[] beanDefinitionNames = ac.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            Object bean = ac.getBean(beanDefinitionName);
            System.out.println("name = " + beanDefinitionName + " ::: object = " + bean);
        }
//        PostService postService = ac.getBean(PostService.class);
//        assertThat(postService).isInstanceOf(PostService.class);
    }
}
