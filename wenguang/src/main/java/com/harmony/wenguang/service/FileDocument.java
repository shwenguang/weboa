package com.harmony.wenguang.service;

import java.io.File;
import java.io.InputStream;

import com.harmony.wenguang.constant.FileType;

public interface FileDocument {
	public FileType getSuffix();
	
	public InputStream getInputStream();
	
	public File getFile();
	
	public String getName();
}
