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


import com.dao.LiaotianhuifuDao;
import com.entity.LiaotianhuifuEntity;
import com.service.LiaotianhuifuService;
import com.entity.vo.LiaotianhuifuVO;
import com.entity.view.LiaotianhuifuView;

@Service("liaotianhuifuService")
public class LiaotianhuifuServiceImpl extends ServiceImpl<LiaotianhuifuDao, LiaotianhuifuEntity> implements LiaotianhuifuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LiaotianhuifuEntity> page = this.selectPage(
                new Query<LiaotianhuifuEntity>(params).getPage(),
                new EntityWrapper<LiaotianhuifuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LiaotianhuifuEntity> wrapper) {
		  Page<LiaotianhuifuView> page =new Query<LiaotianhuifuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LiaotianhuifuVO> selectListVO(Wrapper<LiaotianhuifuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LiaotianhuifuVO selectVO(Wrapper<LiaotianhuifuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LiaotianhuifuView> selectListView(Wrapper<LiaotianhuifuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LiaotianhuifuView selectView(Wrapper<LiaotianhuifuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
