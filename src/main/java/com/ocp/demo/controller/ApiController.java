package com.ocp.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ocp.demo.rspmodel.RspModel;

@RestController
public class ApiController {
	
	@GetMapping("/api/v1/hello")
	
	ResponseEntity<RspModel> hello(){
		
		
		RspModel rsp = new RspModel();
		
		rsp.setCode(200);
		rsp.setMsg("Ok");
		rsp.setData("hello openshift");
		
		return ResponseEntity.ok(rsp);
	}

}
