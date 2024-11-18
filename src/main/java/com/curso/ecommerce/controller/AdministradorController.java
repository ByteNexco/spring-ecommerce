package com.curso.ecommerce.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/administrador")
public class AdministradorController {

	@GetMapping("")
	public String home() {
		return "administrador/home";
	}
}
