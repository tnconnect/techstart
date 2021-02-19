package com.tn.provider.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.tn.provider.model.Provider;



@RestController
public class ProviderController {
	
	@GetMapping("/providers/{id}")
	public List<Provider> getProviders(@PathVariable String id){
		System.out.println("inside getProvider id "+id);
		List<Provider> providerList = getProvidersList();
		return providerList;
		
	}

	private List<Provider> getProvidersList() {
		List<Provider> providers = new ArrayList<Provider>();
		providers.add(new Provider("Tim", "fidler", "US", "MD"));
		providers.add(new Provider("Tom", "Cruz", "US", "MD"));
		providers.add(new Provider("Kim", "fidler", "US", "MD"));
		return providers;
	}

}
