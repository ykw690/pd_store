package com.pd.service.impl;

import java.util.List;

import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pd.pojo.Item;
import com.pd.service.SearchService;

@Service
public class SearchServiceImpl implements SearchService{
	@Autowired
	private SolrClient solrClient;
	@Override
	public List<Item> findItemByKey(String key) throws Exception {
		SolrQuery query = new SolrQuery(key);
		query.setStart(0);
		query.setRows(20);
		QueryResponse qr = solrClient.query(query);
		List<Item> beans = qr.getBeans(Item.class);
		return beans;
	}

}
