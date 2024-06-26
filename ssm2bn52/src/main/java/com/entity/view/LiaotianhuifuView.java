package com.entity.view;

import com.entity.LiaotianhuifuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 聊天回复
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-11 13:09:03
 */
@TableName("liaotianhuifu")
public class LiaotianhuifuView  extends LiaotianhuifuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public LiaotianhuifuView(){
	}
 
 	public LiaotianhuifuView(LiaotianhuifuEntity liaotianhuifuEntity){
 	try {
			BeanUtils.copyProperties(this, liaotianhuifuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
