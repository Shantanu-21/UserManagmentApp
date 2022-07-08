package com.Shantanu.UserManegmentApp.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Shantanu.UserManegmentApp.bindings.Userloginbinding;
import com.Shantanu.UserManegmentApp.entities.Cities;
import com.Shantanu.UserManegmentApp.entities.Country;
import com.Shantanu.UserManegmentApp.entities.States;
import com.Shantanu.UserManegmentApp.entities.UserAccounts;
import com.Shantanu.UserManegmentApp.repositories.CitiesRepositories;
import com.Shantanu.UserManegmentApp.repositories.Conutryrepositories;
import com.Shantanu.UserManegmentApp.repositories.StatesRepositories;
import com.Shantanu.UserManegmentApp.repositories.UserAccountrepositories;

@Service
public class ServiceIMPL implements ServiceI {

	@Autowired
	private CitiesRepositories citiesRepositories;
	@Autowired
	private StatesRepositories statesRepositories;
	@Autowired
	private Conutryrepositories conutryrepositories;
	@Autowired
	private UserAccountrepositories userAccountrepositories;

	@Override
	public String login(Userloginbinding userloginbinding) {

		UserAccounts findByEmailAndPassword = userAccountrepositories
				.findByEmailAndPassword(userloginbinding.getEmail(), userloginbinding.getPassword());
		if (findByEmailAndPassword != null) {
			String accStatus = findByEmailAndPassword.getAccStatus();
			if (accStatus.equals("LOCK")) {

				return "ACCOUNT IS LOCK";
			}

			else {
				return "ACCOUNT LOGIN SUCCESSFULL";
			}

		} else {

			return "LOGIN FAIL";
		}

	}
	// --------------------------------------------------------------------------------//

	@Override
	public Map<Integer, String> getCountrys() {

		List<Country> findAll = conutryrepositories.findAll();
		Map<Integer, String> countrymap = new HashMap<>();
		for (Country country : findAll) {
			countrymap.put(country.getCountryId(), country.getContryName());
		}
		return countrymap;
	}

	@Override
	public Map<Integer, String> getStates(Integer countryId) {
		List<States> findByCountryId = statesRepositories.findByCountryId(countryId);
		Map<Integer, String> statesmap = new HashMap<>();
		for (States status : findByCountryId) {
			statesmap.put(status.getStateId(), status.getStateName());
		}

		return statesmap;
	}

	@Override
	public Map<Integer, String> getCity(Integer stateId) {
		List<Cities> findByStatesId = citiesRepositories.findByStateId(stateId);
		Map<Integer, String> citymap = new HashMap<>();
		for (Cities citis : findByStatesId) {
			citymap.put(citis.getCityId(), citis.getCityName());
		}

		return citymap;
	}

	}
