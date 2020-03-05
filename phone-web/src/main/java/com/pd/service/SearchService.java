package com.pd.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pd.pojo.Item;
@Service
public interface SearchService {
	List<Item> findItemByKey(String key) throws Exception;
}
