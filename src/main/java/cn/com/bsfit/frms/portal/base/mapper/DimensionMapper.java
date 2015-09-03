package cn.com.bsfit.frms.portal.base.mapper;

import cn.com.bsfit.frms.portal.base.pojo.Dimension;
import cn.com.bsfit.frms.portal.base.pojo.DimensionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DimensionMapper {
    int countByExample(DimensionExample example);

    int deleteByExample(DimensionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Dimension record);

    int insertSelective(Dimension record);

    List<Dimension> selectByExample(DimensionExample example);

    Dimension selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Dimension record, @Param("example") DimensionExample example);

    int updateByExample(@Param("record") Dimension record, @Param("example") DimensionExample example);

    int updateByPrimaryKeySelective(Dimension record);

    int updateByPrimaryKey(Dimension record);
}