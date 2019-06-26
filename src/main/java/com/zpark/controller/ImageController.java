package com.zpark.controller;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class ImageController {

	@Value("${web.upload-path}")
	private String path;

	/*
	 * 上传图片 http://localhost:8082/testUpload
	 */
	@RequestMapping(value = "testUpload")
	public String testUpload(@RequestParam(value = "file", required = true) MultipartFile file) {

		/* 图片名随机生成 */
		String str = UUID.randomUUID().toString().replace("-", "");
		byte[] bytes;
		try {
			bytes = file.getBytes();
			File saveFile = new File(path + str + ".jpg");
			System.out.println("图片名称：" + str);
			FileCopyUtils.copy(bytes, saveFile);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "0";
		}

		return str;
	}

}
