package cn.com.bsfit.frms.portal.base.mapper;

import cn.com.bsfit.frms.portal.base.pojo.Resources;
import cn.com.bsfit.frms.portal.base.pojo.ResourcesExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ResourcesMapper {

	int countByExample(ResourcesExample example);

	int deleteByExample(ResourcesExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(Resources record);

	int insertSelective(Resources record);

	List<Resources> selectByExample(ResourcesExample example);

	Resources selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") Resources record, @Param("example") ResourcesExample example);

	int updateByExample(@Param("record") Resources record, @Param("example") ResourcesExample example);

	int updateByPrimaryKeySelective(Resources record);

	int updateByPrimaryKey(Resources record);
	
	List<Resources> selectByResourceId(Integer resourceId);

	List<Resources> selectByParentId(Integer parentId);
	
	List<Resources> selectByUsersId(@Param("usersId")Integer usersId, @Param("resourcesType")Integer resourcesType);
}