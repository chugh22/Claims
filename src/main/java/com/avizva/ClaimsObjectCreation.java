package com.avizva;

import java.nio.file.Files;
import java.nio.file.Paths;


import com.fasterxml.jackson.databind.ObjectMapper;

import pojo.Info;

public class ClaimsObjectCreation {
	public static void main(String[] args) {
		try {
			byte[] jsonData = Files.readAllBytes(Paths.get("data.json")) ;
			ObjectMapper objectMapper = new ObjectMapper() ;
			//Claim claim = objectMapper.readValue(jsonData, Claim.class) ;
			Info inf = objectMapper.readValue(jsonData, Info.class) ;
			System.out.println("SUCCESS ");
			System.out.println(inf);
			
		} catch(Exception e){
			System.out.println("FAILED");
			e.printStackTrace();
		}
	}
}
