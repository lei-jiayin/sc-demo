package cn.xw.user.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * @author xw
 * @date 2019/5/23 10:36
 */
@Data
@Table(name = "t_xw_s_user")
public class User {
    @Id
    @KeySql(useGeneratedKeys = true)
    private Integer id;
    private String userName;
    private String password;

    private String email;
    private String phoneNum;
    private Integer status;

    @Transient
    private String note;
}
