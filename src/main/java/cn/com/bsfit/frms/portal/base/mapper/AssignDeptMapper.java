package cn.com.bsfit.frms.portal.base.mapper;

import cn.com.bsfit.frms.portal.base.pojo.AssignDept;
import cn.com.bsfit.frms.portal.base.pojo.AssignDeptExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AssignDeptMapper {
    int countByExample(AssignDeptExample example);

    int deleteByExample(AssignDeptExample example);

    int insert(AssignDept record);

    int insertSelective(AssignDept record);

    List<AssignDept> selectByExample(AssignDeptExample example);

    int updateByExampleSelective(@Param("record") AssignDept record, @Param("example") AssignDeptExample example);

    int updateByExample(@Param("record") AssignDept record, @Param("example") AssignDeptExample example);
}