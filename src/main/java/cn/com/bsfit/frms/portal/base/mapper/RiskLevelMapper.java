package cn.com.bsfit.frms.portal.base.mapper;

import cn.com.bsfit.frms.portal.base.pojo.RiskLevel;
import cn.com.bsfit.frms.portal.base.pojo.RiskLevelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RiskLevelMapper {
    int countByExample(RiskLevelExample example);

    int deleteByExample(RiskLevelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RiskLevel record);

    int insertSelective(RiskLevel record);

    List<RiskLevel> selectByExample(RiskLevelExample example);

    RiskLevel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RiskLevel record, @Param("example") RiskLevelExample example);

    int updateByExample(@Param("record") RiskLevel record, @Param("example") RiskLevelExample example);

    int updateByPrimaryKeySelective(RiskLevel record);

    int updateByPrimaryKey(RiskLevel record);
}