package com.springlog.springlogmessage;

import com.springlog.springlogmessage.components.DemoBean;
import com.springlog.springlogmessage.components.EmployeeBean;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.logging.Logger;

@SpringBootApplication
public class SpringLogMessageApplication {

    public static final Logger logger = LoggerFactory.getLogger(SpringConceptsApplication.class);
    public static void main(String[] args) {
        logger.log("Welcome to Spring Concept Demo");
        ApplicationContext context = SpringApplication.run(SpringConceptsApplication.class, args);
        logger.log("Checking Context: {}", context.getBean(DemoBean.class));
        logger.log("\n*** Example Using @Autowire annotation on property *");
        EmployeeBean employeeBean=context.getBean(EmployeeBean.class);
        employeeBean.setEid(104);
        employeeBean.setEname("Spring Framework Guru");
        employeeBean.showEmployeeDetails();
    }

}
