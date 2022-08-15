package com.api.teste.unlimint.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

@Builder
@ApiModel(value = "Consulta Bancos", description = "Retorna lista de bancos")
@Data
public class RetornoModel {


	@ApiModelProperty(value = "ispb. Exemplo: 00000000")
	private String ispb;
	
	@ApiModelProperty(value = "name. Exemplo: BCO DO BRASIL S.A.")
	private String name;
	
	public String getIspb() {
		return ispb;
	}

	public void setIspb(String ispb) {
		this.ispb = ispb;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	@ApiModelProperty(value = "code. Exemplo: 1")
	private String code;
	
	@ApiModelProperty(value = "fullName. Exemplo: Banco do Brasil S.A.")
	private String fullName;

}
