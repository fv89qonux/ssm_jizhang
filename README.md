## 本项目实现的最终作用是基于SSM个人记账本
## 分为1个角色
### 第1个角色为用户角色，实现了如下功能：
 - 支出添加
 - 收入添加
 - 收支列表
 - 收支图表展示
 - 收支方式管理
 - 收支比例图表
 - 收支项目管理
 - 用户注册
 - 用户激活
 - 用户登录
## 数据库设计如下：
# 数据库设计文档

**数据库名：** ssm_jizhang

**文档版本：** 


| 表名                  | 说明       |
| :---: | :---: |
| [arrears](#arrears) |  |
| [balance](#balance) |  |
| [expenditure](#expenditure) |  |
| [huabei](#huabei) |  |
| [income](#income) |  |
| [info](#info) |  |
| [item](#item) |  |
| [pay_method](#pay_method) |  |
| [user](#user) | 用户表 |
| [wish](#wish) |  |

**表名：** <a id="arrears">arrears</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | userId |   int   | 10 |   0    |    Y     |  N   |   NULL    |   |
|  2   | bankName |   varchar   | 255 |   0    |    Y     |  N   |   NULL    |   |
|  3   | cardType |   varchar   | 255 |   0    |    Y     |  N   |   NULL    |   |
|  4   | cardMoney |   double   | 23 |   0    |    Y     |  N   |   NULL    |   |
|  5   | cardDate |   date   | 10 |   0    |    Y     |  N   |   NULL    |   |
|  6   | cardId |   varchar   | 255 |   0    |    Y     |  N   |   NULL    |   |
|  7   | cardFlag |   int   | 10 |   0    |    Y     |  N   |   NULL    |   |

**表名：** <a id="balance">balance</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       | 自增主键  |
|  2   | user_id |   int   | 10 |   0    |    N     |  N   |       | 用户ID  |
|  3   | month |   date   | 10 |   0    |    N     |  N   |       | 月份  |
|  4   | actual_balance |   float   | 256 |   2    |    N     |  N   |       | 本月末结余，即下月初结余  |

**表名：** <a id="expenditure">expenditure</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       | 自增主键  |
|  2   | item_id |   int   | 10 |   0    |    Y     |  N   |   NULL    |   |
|  3   | user_id |   int   | 10 |   0    |    N     |  N   |       | 用户ID  |
|  4   | money |   float   | 256 |   2    |    N     |  N   |       | 金额  |
|  5   | type_of_money |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 付款类型  |
|  6   | date |   date   | 10 |   0    |    N     |  N   |       | 日期  |
|  7   | remark |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 备注  |
|  8   | dele |   int   | 10 |   0    |    Y     |  N   |   NULL    | -1：删除；1未删除  |

**表名：** <a id="huabei">huabei</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | userId |   int   | 10 |   0    |    Y     |  N   |   NULL    |   |
|  2   | huabeiMoney |   double   | 23 |   0    |    Y     |  N   |   NULL    |   |
|  3   | huabeiDate |   date   | 10 |   0    |    Y     |  N   |   NULL    |   |

**表名：** <a id="income">income</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       | 自增主键  |
|  2   | item_id |   int   | 10 |   0    |    Y     |  N   |   NULL    |   |
|  3   | user_id |   int   | 10 |   0    |    N     |  N   |       | 用户ID  |
|  4   | money |   float   | 256 |   2    |    N     |  N   |       | 金额  |
|  5   | type_of_money |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 付款类型  |
|  6   | date |   date   | 10 |   0    |    N     |  N   |       | 日期  |
|  7   | remark |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 备注  |
|  8   | dele |   int   | 10 |   0    |    Y     |  N   |   NULL    | -1：删除；1未删除  |

**表名：** <a id="info">info</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | userId |   int   | 10 |   0    |    N     |  N   |       |   |
|  2   | motto |   varchar   | 255 |   0    |    Y     |  N   |   NULL    |   |
|  3   | birth |   date   | 10 |   0    |    Y     |  N   |   NULL    |   |
|  4   | target |   varchar   | 255 |   0    |    Y     |  N   |   NULL    |   |
|  5   | gender |   varchar   | 255 |   0    |    Y     |  N   |   NULL    |   |
|  6   | completion |   int   | 10 |   0    |    Y     |  N   |   NULL    |   |

**表名：** <a id="item">item</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       | 自增主键  |
|  2   | user_id |   int   | 10 |   0    |    N     |  N   |       | 表示此项对应哪个user，如果是1表示是公有项  |
|  3   | name |   char   | 50 |   0    |    Y     |  N   |   NULL    | 名字  |
|  4   | in_or_ex |   varchar   | 3 |   0    |    N     |  N   |       | in表示收入，ex表示支出  |
|  5   | remark |   char   | 200 |   0    |    Y     |  N   |   NULL    | 标记备注  |
|  6   | dele |   int   | 10 |   0    |    N     |  N   |       | -1：删除；1未删除  |
|  7   | sort |   int   | 10 |   0    |    Y     |  N   |   NULL    | 排序  |

**表名：** <a id="pay_method">pay_method</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       | 自增主键  |
|  2   | user_id |   int   | 10 |   0    |    N     |  N   |       | 用户ID  |
|  3   | name |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 名字  |
|  4   | is_count_in_this_month_ex |   int   | 10 |   0    |    Y     |  N   |   NULL    | 是否计入本月支出，1：是；0：否；（-1为收入，收入不考虑此字段）  |
|  5   | in_or_ex |   varchar   | 255 |   0    |    N     |  N   |       |   |
|  6   | remark |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 备注  |
|  7   | dele |   int   | 10 |   0    |    N     |  N   |       | -1：删除；1未删除  |
|  8   | sort |   int   | 10 |   0    |    Y     |  N   |   NULL    | 排序  |

**表名：** <a id="user">user</a>

**说明：** 用户表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       | 自增主键  |
|  2   | name |   varchar   | 255 |   0    |    N     |  N   |       | 名字  |
|  3   | email |   varchar   | 255 |   0    |    N     |  N   |       | 邮箱  |
|  4   | password |   varchar   | 255 |   0    |    N     |  N   |       | 密码  |
|  5   | age |   int   | 10 |   0    |    Y     |  N   |   NULL    | 年龄  |
|  6   | sex |   char   | 1 |   0    |    Y     |  N   |   NULL    | 性别  |
|  7   | remark |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 备注  |
|  8   | register_time |   datetime   | 19 |   0    |    Y     |  N   |   NULL    | 注册时间  |
|  9   | last_login_time |   datetime   | 19 |   0    |    Y     |  N   |   NULL    |   |
|  10   | is_active |   int   | 10 |   0    |    Y     |  N   |   NULL    | 1表示活跃用户，0表示非活跃用户（未激活或者注销）  |
|  11   | activation_code |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 验证码  |
|  12   | activation_code_time |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 验证码发送时间格式yyyy-mm-ddhh:mm:ss  |

**表名：** <a id="wish">wish</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | wishId |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | userId |   int   | 10 |   0    |    Y     |  N   |   NULL    |   |
|  3   | wishName |   varchar   | 255 |   0    |    Y     |  N   |   NULL    |   |
|  4   | wishDate |   date   | 10 |   0    |    Y     |  N   |   NULL    |   |
|  5   | wishMoney |   double   | 23 |   0    |    Y     |  N   |   NULL    |   |
|  6   | wishFlag |   int   | 10 |   0    |    Y     |  N   |   NULL    |   |

