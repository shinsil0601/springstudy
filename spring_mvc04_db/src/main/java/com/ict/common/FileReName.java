package com.ict.common;

import java.io.File;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class FileReName {
	public String exec(String path, String file_name) {
		File dir = new File(path);
		String[] arr = dir.list();
		// 배열을 리스트로 변환
		List<String> k = Arrays.asList(arr);
		boolean result = k.contains(file_name);
		System.out.println(result);
		if(result) {
			// 000000.XXX(.확장자 생략 -> 파일 이름만 추출한다.)
			String[] names = file_name.split("\\.");
			file_name = names[0] + "1." + names[1];
		}
		return file_name;
	}
}
