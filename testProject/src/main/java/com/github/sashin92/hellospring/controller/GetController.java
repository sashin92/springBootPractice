package com.github.sashin92.hellospring.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.sashin92.hellospring.DTO.MemberDTO;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("api/v1/get-api")
@Tag(name = "User API", description = "이건 GET API들 입니다.")
public class GetController {

	@Operation(summary = "인사", description = "정중히 인사드립니다.")
	@GetMapping("/hello")
	public String getHello() {
		return "Hello World!";
	}
	
	@GetMapping("/name")
	public String getName() {
		return "sashin";
	}
	
	@GetMapping("/variable/{variable}")
	public String getVariable(@PathVariable("variable") String var) {
		return var;
	}
	
	@GetMapping("/request")
	public String getRequestParam(@RequestParam Map<String, String> param) {
		StringBuilder sb = new StringBuilder();
		
		param.entrySet().forEach(node -> {
			sb.append(node.getKey() + " : " + node.getValue() + "\n");
		});
		return sb.toString();
	}
	
	@GetMapping("/dto")
	public String getDTO(MemberDTO dto) {
		
		
		return dto.toString();
	}

}
