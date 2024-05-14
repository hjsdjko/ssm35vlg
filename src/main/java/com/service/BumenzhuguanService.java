package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BumenzhuguanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BumenzhuguanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BumenzhuguanView;


/**
 * 部门主管
 *
 * @author 
 * @email 
 * @date 2022-05-14 10:59:21
 */
public interface BumenzhuguanService extends IService<BumenzhuguanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BumenzhuguanVO> selectListVO(Wrapper<BumenzhuguanEntity> wrapper);
   	
   	BumenzhuguanVO selectVO(@Param("ew") Wrapper<BumenzhuguanEntity> wrapper);
   	
   	List<BumenzhuguanView> selectListView(Wrapper<BumenzhuguanEntity> wrapper);
   	
   	BumenzhuguanView selectView(@Param("ew") Wrapper<BumenzhuguanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BumenzhuguanEntity> wrapper);
   	

}
