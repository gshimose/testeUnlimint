package com.api.teste.unlimint.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.teste.unlimint.consumer.BrasilAPIConsumer;
import com.api.teste.unlimint.model.RetornoModel;

@Service
public class TesteUnlimintService {
	
	@Autowired
	private BrasilAPIConsumer brasilAPIConsumer;
	
	public RetornoModel[] connsultaBancos () throws Exception {
		
		RetornoModel[] lista;
		
		lista= brasilAPIConsumer.consultaBancos();
		
		return lista;
	}

}
