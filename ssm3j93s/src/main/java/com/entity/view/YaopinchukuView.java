package com.entity.view;

import com.entity.YaopinchukuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 药品出库
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-23 08:51:28
 */
@TableName("yaopinchuku")
public class YaopinchukuView  extends YaopinchukuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YaopinchukuView(){
	}
 
 	public YaopinchukuView(YaopinchukuEntity yaopinchukuEntity){
 	try {
			BeanUtils.copyProperties(this, yaopinchukuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
