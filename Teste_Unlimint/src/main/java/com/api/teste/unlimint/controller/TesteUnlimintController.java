package com.api.teste.unlimint.controller;
 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.teste.unlimint.model.RetornoModel;
import com.api.teste.unlimint.service.TesteUnlimintService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/testeunlimint")
@Api(tags = { "Teste de API Unlimint" })
public class TesteUnlimintController {
	
	@Autowired
	private TesteUnlimintService testeUnlimintService;
	
	@ResponseBody
	@GetMapping("/consultabancos")
	@ApiOperation(value = "Consulta bancos", notes = "Retorna lista com todos os bancos")
	public RetornoModel[] consultabancos() throws Exception {
		RetornoModel[] listaBancos  = testeUnlimintService.connsultaBancos();
		return listaBancos;
	}
	
 
	

}
