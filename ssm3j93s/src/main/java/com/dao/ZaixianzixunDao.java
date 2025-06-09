package com.dao;

import com.entity.ZaixianzixunEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZaixianzixunVO;
import com.entity.view.ZaixianzixunView;


/**
 * 在线咨询
 * 
 * @author 
 * @email 
 * @date 2021-03-23 08:51:28
 */
public interface ZaixianzixunDao extends BaseMapper<ZaixianzixunEntity> {
	
	List<ZaixianzixunVO> selectListVO(@Param("ew") Wrapper<ZaixianzixunEntity> wrapper);
	
	ZaixianzixunVO selectVO(@Param("ew") Wrapper<ZaixianzixunEntity> wrapper);
	
	List<ZaixianzixunView> selectListView(@Param("ew") Wrapper<ZaixianzixunEntity> wrapper);

	List<ZaixianzixunView> selectListView(Pagination page,@Param("ew") Wrapper<ZaixianzixunEntity> wrapper);
	
	ZaixianzixunView selectView(@Param("ew") Wrapper<ZaixianzixunEntity> wrapper);
	
}
