package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YaopinchukuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YaopinchukuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YaopinchukuView;


/**
 * 药品出库
 *
 * @author 
 * @email 
 * @date 2021-03-23 08:51:28
 */
public interface YaopinchukuService extends IService<YaopinchukuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YaopinchukuVO> selectListVO(Wrapper<YaopinchukuEntity> wrapper);
   	
   	YaopinchukuVO selectVO(@Param("ew") Wrapper<YaopinchukuEntity> wrapper);
   	
   	List<YaopinchukuView> selectListView(Wrapper<YaopinchukuEntity> wrapper);
   	
   	YaopinchukuView selectView(@Param("ew") Wrapper<YaopinchukuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YaopinchukuEntity> wrapper);
   	
}

