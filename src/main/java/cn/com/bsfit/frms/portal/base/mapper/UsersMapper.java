package cn.com.bsfit.frms.portal.base.mapper;

import cn.com.bsfit.frms.portal.base.pojo.Users;
import cn.com.bsfit.frms.portal.base.pojo.UsersDetail;
import cn.com.bsfit.frms.portal.base.pojo.UsersExample;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface UsersMapper {
    int countByExample(UsersExample example);

    int deleteByExample(UsersExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Users record);

    int insertSelective(Users record);

    List<Users> selectByExample(UsersExample example);

    Users selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Users record, @Param("example") UsersExample example);

    int updateByExample(@Param("record") Users record, @Param("example") UsersExample example);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);
    
    List<String> selectResourceCodeByUserId(Integer userId);
    
    List<UsersDetail> selectUsersDetailByExample(UsersExample example);
    
    List<Users> selectUsersByResourceCode(String resourceCode);

	int insertUserRiskType(Map<String, Object> userRisk);

	int deleteUserRiskTypeByUserId(Integer id);

	List<String> selectUserRiskTypeById(Integer userId);
}