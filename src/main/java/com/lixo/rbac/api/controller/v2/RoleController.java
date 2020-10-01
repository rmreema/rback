package com.lixo.rbac.api.controller.v2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/rest/rbac/")
public class RoleController {

	@GetMapping(value = "/getAll")
	public @ResponseBody int getAll()
	{
		return 1;
	}
	
}
