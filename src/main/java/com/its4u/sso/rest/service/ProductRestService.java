package com.its4u.sso.rest.service;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.its4u.sso.rest.model.Product;

@Path("/products")
@Consumes(MediaType.APPLICATION_JSON + ";charset=UTF-8")
@Produces(MediaType.APPLICATION_JSON + ";charset=UTF-8")
public class ProductRestService {

	@GET
	public List<Product> retrieveProducts() {

		final Product sbPhoneXl = new Product();
		sbPhoneXl.setId(101);
		sbPhoneXl.setName("JBoss EAP: Phone XL");
		sbPhoneXl.setDescription("A large phone with one of the best screens");

		final Product sbPhoneMini = new Product();
		sbPhoneMini.setId(102);
		sbPhoneMini.setName("JBoss EAP: Phone Mini");
		sbPhoneMini.setDescription(" A great phone with one of the best cameras");

		final Product sbPhoneStandard = new Product();
		sbPhoneStandard.setId(103);
		sbPhoneStandard.setName("JBoss EAP: Phone Standard");
		sbPhoneStandard.setDescription(" A stardard phone with no special feature ");

		return Arrays.asList(sbPhoneXl, sbPhoneMini, sbPhoneStandard);
	}

}