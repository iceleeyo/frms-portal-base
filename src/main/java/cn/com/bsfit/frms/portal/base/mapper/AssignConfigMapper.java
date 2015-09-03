package cn.com.bsfit.frms.portal.base.mapper;

import cn.com.bsfit.frms.portal.base.pojo.AssignConfig;
import cn.com.bsfit.frms.portal.base.pojo.AssignConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AssignConfigMapper {
    int countByExample(AssignConfigExample example);

    int deleteByExample(AssignConfigExample example);

    int deleteByPrimaryKey(Integer type);

    int insert(AssignConfig record);

    int insertSelective(AssignConfig record);

    List<AssignConfig> selectByExample(AssignConfigExample example);

    AssignConfig selectByPrimaryKey(Integer type);

    int updateByExampleSelective(@Param("record") AssignConfig record, @Param("example") AssignConfigExample example);

    int updateByExample(@Param("record") AssignConfig record, @Param("example") AssignConfigExample example);

    int updateByPrimaryKeySelective(AssignConfig record);

    int updateByPrimaryKey(AssignConfig record);
}