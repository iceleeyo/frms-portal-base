package cn.com.bsfit.frms.portal.base.mapper;

import cn.com.bsfit.frms.portal.base.pojo.AssignUserList;
import cn.com.bsfit.frms.portal.base.pojo.AssignUserListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AssignUserListMapper {
    int countByExample(AssignUserListExample example);

    int deleteByExample(AssignUserListExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AssignUserList record);

    int insertSelective(AssignUserList record);

    List<AssignUserList> selectByExample(AssignUserListExample example);

    AssignUserList selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AssignUserList record, @Param("example") AssignUserListExample example);

    int updateByExample(@Param("record") AssignUserList record, @Param("example") AssignUserListExample example);

    int updateByPrimaryKeySelective(AssignUserList record);

    int updateByPrimaryKey(AssignUserList record);
}