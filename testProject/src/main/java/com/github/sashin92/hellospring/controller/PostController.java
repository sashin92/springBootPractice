package com.github.sashin92.hellospring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.sashin92.hellospring.data.dto.MemberDTO;

import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/v1/post-api")
public class PostController {
	
	@PostMapping("/default")
	public String postMethod() {
		
		return "Hello World!";
	}
	
	@PostMapping("/request")
	public String postRequest(@RequestBody Map<String, Object> postData) {
		StringBuilder sb = new StringBuilder();
		
		postData.entrySet().forEach(node -> {
			sb.append(node.getKey() + " : " + node.getValue() + "\n");
		});
		
		return sb.toString();		
	}
	
	@PostMapping("/dto")
	public String postDTO(@RequestBody MemberDTO memberDTO) {
		
		return memberDTO.toString();
	}
	
}
