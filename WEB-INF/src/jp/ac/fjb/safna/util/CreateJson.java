package jp.ac.fjb.safna.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CreateJson {
	/**
	 * MapからJSON文字列を作成する
	 * 
	 * @param valueMap Map<String, Object>
	 * @return String
	 */
	public static String makeJSONString(Map<String,Object> valueMap){
		
		ObjectMapper objectMapper = new ObjectMapper();
		String jsonString = null;
		
		try {
			jsonString = objectMapper.writeValueAsString(valueMap);
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return jsonString;
	}

}
