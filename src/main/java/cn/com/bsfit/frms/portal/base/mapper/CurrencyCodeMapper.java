package cn.com.bsfit.frms.portal.base.mapper;

import cn.com.bsfit.frms.portal.base.pojo.CurrencyCode;
import cn.com.bsfit.frms.portal.base.pojo.CurrencyCodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CurrencyCodeMapper {
    int countByExample(CurrencyCodeExample example);

    int deleteByExample(CurrencyCodeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CurrencyCode record);

    int insertSelective(CurrencyCode record);

    List<CurrencyCode> selectByExample(CurrencyCodeExample example);

    CurrencyCode selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CurrencyCode record, @Param("example") CurrencyCodeExample example);

    int updateByExample(@Param("record") CurrencyCode record, @Param("example") CurrencyCodeExample example);

    int updateByPrimaryKeySelective(CurrencyCode record);

    int updateByPrimaryKey(CurrencyCode record);
}