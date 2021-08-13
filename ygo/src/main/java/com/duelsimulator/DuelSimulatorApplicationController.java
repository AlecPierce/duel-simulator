package com.duelsimulator;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DuelSimulatorApplicationController {

    @RequestMapping("/")
	public String home() {
		return "hello world";
	}
	
	@RequestMapping("/search")
	public String search() {
		return "\n searching...";
	}
	
	@CrossOrigin
	@GetMapping("/cards")
	public String getCards() throws URISyntaxException {
	    try {
	    	String content1 = "";
	    	try {
	    	    content1 = new String(Files.readAllBytes(Paths.get("C:\\Users\\alecp\\dev\\duel-simulator\\ygo\\MOCK_DATA.json")));
	    	    System.out.println(content1);
	    	} catch (IOException e) {
	    	    e.printStackTrace();
	    	}
            return content1;
	    } catch (IllegalArgumentException ex) {
	        return HttpStatus.BAD_REQUEST.toString();
	    }
	}
    
    @GetMapping("/card/{id}")
	public String postCard(@PathVariable("id") String id) throws URISyntaxException {
        return "ID: " + id;
	    // try {
	    // 	String content1 = "";
	    // 	try {
	    // 	    content1 = new String(Files.readAllBytes(Paths.get("C:\\Users\\alecp\\dev\\duel-simulator\\ygo\\MOCK_DATA.json")));
	    // 	    System.out.println(content1);
	    // 	} catch (IOException e) {
	    // 	    e.printStackTrace();
	    // 	}
        //     return content1;
	    // } catch (IllegalArgumentException ex) {
	    //     return HttpStatus.BAD_REQUEST.toString();
	    // }
	}
}
