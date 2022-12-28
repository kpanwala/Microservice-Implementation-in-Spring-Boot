package com.example.contact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class ContactApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContactApplication.class, args);
	}
	
	@Autowired
    private JdbcTemplate jdbcTemplate;
     
 
    public void run(String... args) throws Exception {
        String sql = "INSERT INTO users (fullname, email, password) VALUES (?, ?, ?)";
         
        int result = jdbcTemplate.update(sql, "Ravi Kumar", "ravi.kumar@gmail.com", "ravi2021");
         
        if (result > 0) {
            System.out.println("A new row has been inserted.");
        }
         
    }

}
