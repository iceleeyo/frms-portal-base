package cn.com.bsfit.frms.portal.base.mapper;

import cn.com.bsfit.frms.portal.base.pojo.CountriesCode;
import cn.com.bsfit.frms.portal.base.pojo.CountriesCodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CountriesCodeMapper {
    int countByExample(CountriesCodeExample example);

    int deleteByExample(CountriesCodeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CountriesCode record);

    int insertSelective(CountriesCode record);

    List<CountriesCode> selectByExample(CountriesCodeExample example);

    CountriesCode selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CountriesCode record, @Param("example") CountriesCodeExample example);

    int updateByExample(@Param("record") CountriesCode record, @Param("example") CountriesCodeExample example);

    int updateByPrimaryKeySelective(CountriesCode record);

    int updateByPrimaryKey(CountriesCode record);
}