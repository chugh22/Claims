package com.avizva;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.databind.ObjectMapper;

import bo.Claims;
import bo.Patient;
import bo.Provider;
import pojo.Claim;
import pojo.Info;

public class ClaimsObjectCreation {
	public static void main(String[] args) {
		try {
			byte[] jsonData = Files.readAllBytes(Paths.get("data.json")) ;
			ObjectMapper objectMapper = new ObjectMapper() ;
			//Claim claim = objectMapper.readValue(jsonData, Claim.class) ;
			Info inf = objectMapper.readValue(jsonData, Info.class) ;
			System.out.println("SUCCESS ");
//			System.out.println(inf);
			
			Claims claim;
			for (Claim i:inf.getInfo()) {
				claim = new Claims();
				claim.setId(i.getId());
				
				SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yyyy");
				Date d=formatter.parse(i.getDateOfService().getDisplayLabel());
				claim.setDateOfService(d);
				
				claim.setAmountBilled(Double.parseDouble(i.getAmountBilled().getDisplayLabel()));
				
				Patient p = new Patient();
				p.setFirstName(i.getPatientName().getDisplayLabel().split(" ")[0]);
				p.setMiddleName(i.getPatientName().getDisplayLabel().split(" ")[1]);
				p.setLastName(i.getPatientName().getDisplayLabel().split(" ")[2]);
				claim.setPatient(p);
				
				Provider pr = new Provider();
				pr.setName(i.getProvider().getDisplayLabel());
				claim.setProvider(pr);
				
				claim.setStage(i.getStage().getDisplayLabel());
				claim.setState(i.getState().getDisplayLabel());
			}
			
		} catch(Exception e){
			System.out.println("FAILED");
			e.printStackTrace();
		}
	}
}
