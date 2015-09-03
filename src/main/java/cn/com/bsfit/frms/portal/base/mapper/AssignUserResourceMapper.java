package cn.com.bsfit.frms.portal.base.mapper;

import cn.com.bsfit.frms.portal.base.pojo.AssignUserResource;
import cn.com.bsfit.frms.portal.base.pojo.AssignUserResourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AssignUserResourceMapper {
    int countByExample(AssignUserResourceExample example);

    int deleteByExample(AssignUserResourceExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AssignUserResource record);

    int insertSelective(AssignUserResource record);

    List<AssignUserResource> selectByExample(AssignUserResourceExample example);

    AssignUserResource selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AssignUserResource record, @Param("example") AssignUserResourceExample example);

    int updateByExample(@Param("record") AssignUserResource record, @Param("example") AssignUserResourceExample example);

    int updateByPrimaryKeySelective(AssignUserResource record);

    int updateByPrimaryKey(AssignUserResource record);
}