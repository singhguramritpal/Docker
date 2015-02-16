package demo;

import java.net.UnknownHostException;

import org.springframework.*;
@SpringBootApplication
public class Demo1Application {

    public static void main(String[] args) throws UnknownHostException {
	SpringApplication.run(Demo1Application.class, args);
        
        MongodblabApplication obj=new MongodblabApplication();
        obj.mongoLab();
    }
}
