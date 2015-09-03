package cn.com.bsfit.frms.portal.base.mapper;

import cn.com.bsfit.frms.portal.base.pojo.RolesResources;
import cn.com.bsfit.frms.portal.base.pojo.RolesResourcesExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface RolesResourcesMapper {
    int countByExample(RolesResourcesExample example);

    int deleteByExample(RolesResourcesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RolesResources record);

    int insertSelective(RolesResources record);

    List<RolesResources> selectByExample(RolesResourcesExample example);

    RolesResources selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RolesResources record, @Param("example") RolesResourcesExample example);

    int updateByExample(@Param("record") RolesResources record, @Param("example") RolesResourcesExample example);

    int updateByPrimaryKeySelective(RolesResources record);

    int updateByPrimaryKey(RolesResources record);
    
    int insertBatch(List<RolesResources> rolesResourcesList);
}