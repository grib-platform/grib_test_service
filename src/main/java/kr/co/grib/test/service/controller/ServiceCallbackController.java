package kr.co.grib.test.service.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

import kr.co.grib.test.service.dto.MqttDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/service")
public class ServiceCallbackController {

	@PostMapping("/callback")
	public void serviceCallback(@RequestBody MqttDto param) {
		try{
			ObjectMapper objectMapper = new ObjectMapper();
			String jsonString = objectMapper.writeValueAsString(param);
			System.out.println(jsonString);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	@PostMapping("/schedule/callback")
	public void serviceScheduleCallback(@RequestBody Map<String, Object> param) {
		try{
			ObjectMapper objectMapper = new ObjectMapper();
			String jsonString = objectMapper.writeValueAsString(param);
			System.out.println(jsonString);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}