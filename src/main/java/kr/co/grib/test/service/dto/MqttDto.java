package kr.co.grib.test.service.dto;

import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class MqttDto {
    private String code;
    private String message;
    private String request;
    private List<Map<String,Object>> param;
    private String deviceId;
}
