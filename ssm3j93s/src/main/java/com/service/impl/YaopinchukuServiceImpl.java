package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.YaopinchukuDao;
import com.entity.YaopinchukuEntity;
import com.service.YaopinchukuService;
import com.entity.vo.YaopinchukuVO;
import com.entity.view.YaopinchukuView;

@Service("yaopinchukuService")
public class YaopinchukuServiceImpl extends ServiceImpl<YaopinchukuDao, YaopinchukuEntity> implements YaopinchukuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YaopinchukuEntity> page = this.selectPage(
                new Query<YaopinchukuEntity>(params).getPage(),
                new EntityWrapper<YaopinchukuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YaopinchukuEntity> wrapper) {
		  Page<YaopinchukuView> page =new Query<YaopinchukuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YaopinchukuVO> selectListVO(Wrapper<YaopinchukuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YaopinchukuVO selectVO(Wrapper<YaopinchukuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YaopinchukuView> selectListView(Wrapper<YaopinchukuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YaopinchukuView selectView(Wrapper<YaopinchukuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
