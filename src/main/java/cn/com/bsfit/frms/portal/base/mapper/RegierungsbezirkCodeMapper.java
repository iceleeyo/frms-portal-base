package cn.com.bsfit.frms.portal.base.mapper;

import cn.com.bsfit.frms.portal.base.pojo.RegierungsbezirkCode;
import cn.com.bsfit.frms.portal.base.pojo.RegierungsbezirkCodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RegierungsbezirkCodeMapper {
    int countByExample(RegierungsbezirkCodeExample example);

    int deleteByExample(RegierungsbezirkCodeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RegierungsbezirkCode record);

    int insertSelective(RegierungsbezirkCode record);

    List<RegierungsbezirkCode> selectByExample(RegierungsbezirkCodeExample example);

    RegierungsbezirkCode selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RegierungsbezirkCode record, @Param("example") RegierungsbezirkCodeExample example);

    int updateByExample(@Param("record") RegierungsbezirkCode record, @Param("example") RegierungsbezirkCodeExample example);

    int updateByPrimaryKeySelective(RegierungsbezirkCode record);

    int updateByPrimaryKey(RegierungsbezirkCode record);
}