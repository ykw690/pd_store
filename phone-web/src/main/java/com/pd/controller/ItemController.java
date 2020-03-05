package com.pd.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.pd.pojo.PdItem;
import com.pd.pojo.PdItemDesc;
import com.pd.pojo.PdItemParam;
import com.pd.pojo.PdItemParamItem;
import com.pd.pojo.PdResult;
import com.pd.pojo.paramData.PdItemParamData;
import com.pd.pojo.paramData.Params;
import com.pd.common.utils.JsonUtils;
import com.pd.common.vo.JsonResult;
import com.pd.service.ItemService;

@RestController
@RequestMapping("/item")
public class ItemController {
	@Autowired
	ItemService itemService;
	//www.ajstore.com/item/getItemId.html
	public Long cid;
	
	@RequestMapping("/setcid")
	public void setCid(Long cid) {
		this.cid=cid;
		System.out.println(cid);
	}
	
	@RequestMapping("/getcid")
	public Long getCid() {
		System.out.println("getcid="+cid);
		return cid;
	}
	
	@RequestMapping("/searchByBrand")
	public JsonResult searchByBrand(String brand) {
		List<PdItem> list = itemService.searchByBrand(brand,cid);
		return new JsonResult(list);
	}
	
	@RequestMapping("/searchBrand")
	public JsonResult searchBrand() {
		List<PdItem> list = itemService.searchBrand(cid);
		return new JsonResult(list);
	}
	
	@RequestMapping("/getItemId.html")
	@ResponseBody
	public PdResult getItemId(HttpServletResponse response,String color,
			String model,String memory,
			String itemParamId) throws Exception
	{
		response.addHeader("Access-Control-Allow-Origin", "*");
		response.addHeader("Access-Control-Allow-credentials", "true");
		PdResult pdResult=new PdResult();
		//Long itemId=10000033L;
		
		Long i=itemService.selectItemByParams(color, model,memory,
				Long.parseLong(itemParamId));
		//查不到商品时设置状态为2
		if(i==0L) {
			pdResult.setStatus(2);
		}
		pdResult.setData(i);
		
		System.out.println("查询到的商品id为："+i);
		return pdResult;
	}
	@RequestMapping("/toItemInfo.html")
	public ModelAndView toItemInfo(Long itemId) throws Exception
	{
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("itemId", itemId);
		//System.out.println(itemId);
		
		PdItemParamItem pdItemParamItem=itemService
				.getParamDataById(itemId);
		String paramData=pdItemParamItem.getParamData();
		List<PdItemParamData> list=JsonUtils
				.jsonToList(paramData, PdItemParamData.class);
		Long itemParamId=pdItemParamItem.getItemParamId();
		modelAndView.addObject("itemParamId", itemParamId);
		//[{params:[{}]},{}]
		String itemColor="",itemModel="",itemMemory="";
		//定义标记，若只有颜色说明为配件
		int colorNum=0,modelNum=0,memoryNum=0;
		for (Params params:list.get(0).getParams())
		{
			if (params.getKey().equals("颜色") 
					&& params.getValues()!=null)
			{
				itemColor=params.getValues().get(0);
				colorNum=1;
			}
			if (params.getKey().equals("型号") 
					&& params.getValues()!=null)
			{
				itemModel=params.getValues().get(0);
				modelNum=0;
			}
			if (params.getKey().equals("内存") 
					&& params.getValues()!=null)
			{
				itemMemory=params.getValues().get(0);
				memoryNum=0;
			}
		}
		//若为配件 则设置一个标识
		if(colorNum==1&&memoryNum==0&&modelNum==0) {
			boolean isPart=true;
			modelAndView.addObject("isPart",isPart);
		}else {
			boolean isPart=false;
			modelAndView.addObject("isPart",isPart);
		}
		modelAndView.addObject("itemColor", itemColor);
		modelAndView.addObject("itemModel", itemModel);
		modelAndView.addObject("itemMemory", itemMemory);
		
		PdItem pdItem=itemService
				.selectItemById(itemId);
		modelAndView.addObject("pdItem", pdItem);
		
		PdItemDesc pdItemDesc=itemService
				.selectDescById(itemId);
		String desc=pdItemDesc.getItemDesc();
		modelAndView.addObject("desc", desc);
		
		itemParamId=pdItemParamItem
				.getItemParamId();
		PdItemParam pdItemParam=itemService
				.selectTypeParamByTypeId(itemParamId);
		String typeParamData=pdItemParam
				.getParamData();
		List<PdItemParamData> typeList=JsonUtils
				.jsonToList(typeParamData, 
						PdItemParamData.class);
		modelAndView.addObject("typeParamData",typeList);
		
		modelAndView.addObject("paramData", list);
		modelAndView.setViewName("/product_details.jsp");
		return modelAndView;
	}

}
