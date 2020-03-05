package com.pd.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pd.mapper.PItemMapper;
import com.pd.mapper.PdItemDescMapper;
import com.pd.mapper.PdItemMapper;
import com.pd.mapper.PdItemParamItemMapper;
import com.pd.mapper.PdItemParamMapper;
import com.pd.pojo.PdItem;
import com.pd.pojo.PdItemDesc;
import com.pd.pojo.PdItemParam;
import com.pd.pojo.PdItemParamItem;
import com.pd.pojo.PdItemParamItemExample;
import com.pd.pojo.paramData.PdItemParamData;
import com.pd.pojo.paramData.Params;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.pd.common.utils.JsonUtils;
import com.pd.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {
	@Autowired
	PdItemMapper pdItemMapper;
	
	@Autowired PItemMapper pItemMapper;

	@Autowired
	PdItemParamItemMapper pdItemParamItemMapper;

	@Autowired
	PdItemDescMapper pdItemDescMapper;

	@Autowired
	PdItemParamMapper pdItemParamMapper;

	@Override
	public PdItemParam selectTypeParamByTypeId(Long itemParamId) throws Exception {

		PdItemParam pdItemParam = pdItemParamMapper.selectByPrimaryKey(itemParamId);

		return pdItemParam;
	}

	@Override
	public PdItemDesc selectDescById(Long itemId) throws Exception {
		PdItemDesc pdItemDesc = pdItemDescMapper.selectByPrimaryKey(itemId);
		return pdItemDesc;
	}

	@Override
	public PdItemParamItem getParamDataById(Long itemId) throws Exception {
		// where item_id=10000028;
		PdItemParamItemExample example = new PdItemParamItemExample();
		//标准
		PdItemParamItemExample.Criteria criteria = example.or();
		criteria.andItemIdEqualTo(itemId);
		List<PdItemParamItem> list = pdItemParamItemMapper.selectByExampleWithBLOBs(example);
		if (list != null && list.size() >= 1) {
			return list.get(0);
		}
		return null;
	}

	@Override
	public List<PdItem> selectAll() throws Exception {
		return pdItemMapper.selectByExample(null);
	}

	@Override
	public PdItem selectItemById(Long itemId) throws Exception {
		PdItem pdItem = pdItemMapper.selectByPrimaryKey(itemId);
		return pdItem;
	}

	@Override
	public Long selectItemByParams(String color, String model, String memory,Long itemParamId) throws Exception {
		// where item_param_id=111;
		PdItemParamItemExample example = new PdItemParamItemExample();

		PdItemParamItemExample.Criteria criteria = example.or();

		criteria.andItemParamIdEqualTo(itemParamId);
		List<PdItemParamItem> itemList = pdItemParamItemMapper.selectByExampleWithBLOBs(example);
		for (PdItemParamItem pdItemParamItem : itemList) {
			String paramData = pdItemParamItem.getParamData();
			List<PdItemParamData> paramList = JsonUtils.jsonToList(paramData, PdItemParamData.class);
			List<Params> list = paramList.get(0).getParams();
			boolean colorIsEquals = false, modelIsEquals = false,memoryIsEquals=false;
			for (Params params : list) {
				String value = params.getValues().get(0);
				String key = params.getKey();
				if ("颜色".equals(key) && value.equals(color)) {
					colorIsEquals = true;
				}
				if ("型号".equals(key) && value.equals(model)) {
					modelIsEquals = true;
				}
				if ("内存".equals(key) && value.equals(memory)) {
					memoryIsEquals = true;
				}
			}

			if (colorIsEquals && modelIsEquals&&memoryIsEquals) {
				return pdItemParamItem.getItemId();
			}
		}
		return 0L;
	}

	@Override
	public List<PdItem> searchBrand(Long cid) {
		QueryWrapper<PdItem> queryWrapper = new QueryWrapper<>();
		queryWrapper.groupBy("brand").having("brand is not null").eq("cid", cid);
		List<PdItem> list = pItemMapper.selectList(queryWrapper);
		return list;
	}

	@Override
	public List<PdItem> searchByBrand(String brand,Long cid) {
		QueryWrapper<PdItem> queryWrapper = new QueryWrapper<>();
		queryWrapper.eq("brand", brand).eq("cid", cid);
		List<PdItem> list = pItemMapper.selectList(queryWrapper);
		return list;
	}

}
