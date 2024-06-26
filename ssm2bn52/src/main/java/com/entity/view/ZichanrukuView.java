package com.entity.view;

import com.entity.ZichanrukuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 资产入库
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-11 13:09:03
 */
@TableName("zichanruku")
public class ZichanrukuView  extends ZichanrukuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZichanrukuView(){
	}
 
 	public ZichanrukuView(ZichanrukuEntity zichanrukuEntity){
 	try {
			BeanUtils.copyProperties(this, zichanrukuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
