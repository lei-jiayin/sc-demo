package cn.xw.consurmer.pojo;

import lombok.Data;


/**
 * @author xw
 * @date 2019/5/23 11:25
 */
@Data
public class User {
    private Integer id;
    private String userName;
    private String password;

    private String email;
    private String phoneNum;
    private Integer status;

    private String note;
}
