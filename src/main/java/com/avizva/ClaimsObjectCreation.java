package com.avizva;

import java.nio.file.Files;
import java.nio.file.Paths;

import com.fasterxml.jackson.databind.ObjectMapper;

import pojo.Claim;

public class ClaimsObjectCreation {
	public static void main(String[] args) {
		try {
			byte[] jsonData = Files.readAllBytes(Paths.get("smalldata.json")) ;
			ObjectMapper objectMapper = new ObjectMapper() ;
			Claim claim = objectMapper.readValue(jsonData, Claim.class) ;
			System.out.println("SUCCESS ");
			System.out.println(claim);
		} catch(Exception e){
			System.out.println("FAILED");
			e.printStackTrace();
		}
	}
}
