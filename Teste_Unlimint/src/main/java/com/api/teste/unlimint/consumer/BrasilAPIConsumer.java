package com.api.teste.unlimint.consumer;


import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import com.api.teste.unlimint.model.RetornoModel;
import lombok.Data;
import reactor.core.publisher.Mono;

@Data
@Configuration
public class BrasilAPIConsumer {
	
	public RetornoModel[]  consultaBancos () throws Exception {
		
		RetornoModel[] retornos = null;
		
		try {
	
			Mono<RetornoModel[]> retornoModel =  WebClient
				    .create("https://brasilapi.com.br/api/banks/v1")
				    .get()
				    .retrieve()
				    .bodyToMono(RetornoModel[].class);
			
			retornos = retornoModel
				    .share().block();
			
			
			System.out.println ("");
			
			
		
		}
		catch(Exception e)
		{   
			throw e;
		}
		return retornos;
	}

}
