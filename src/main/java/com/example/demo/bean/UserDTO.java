package com.example.demo.bean;



import org.springframework.stereotype.Repository;

import lombok.Getter;
import lombok.Setter;

@Repository
@Getter
@Setter
public class UserDTO {
	private int seq;
	private String name;
}
