package com.Shantanu.UserManegmentApp.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.Shantanu.UserManegmentApp.entities.Country;
import com.Shantanu.UserManegmentApp.service.ServiceIMPL;

@Controller
public class UserController {
	@Autowired
	private ServiceIMPL serviceIMPL;

	@GetMapping("/selectcountry")
	public ResponseEntity<Map<Integer, String>> selectcountry() {
		Map<Integer, String> gatCountrys = serviceIMPL.getCountrys();
		return new ResponseEntity<Map<Integer, String>>(gatCountrys, HttpStatus.OK);

	}

	@GetMapping("/selectstate/{countryId}")
	public ResponseEntity<Map<Integer, String>> selectstate(@PathVariable Integer countryId) {
		Map<Integer, String> states = serviceIMPL.getStates(countryId);
		return new ResponseEntity<Map<Integer, String>>(states, HttpStatus.OK);
	}

	@GetMapping("/selectcity/{stateId}")
	public ResponseEntity<Map<Integer, String>> selectcity(@PathVariable Integer stateId) {

		Map<Integer, String> city = serviceIMPL.getCity(stateId);
		return new ResponseEntity<Map<Integer, String>>(city, HttpStatus.OK);

	}

}
