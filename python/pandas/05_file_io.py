import pandas as pd

#读取CSV文件
df = pd.read_csv('../data/sales_data.csv')
print(df.head())

#写出到CSV index=True保留行索引
df.to_csv('../data/output/sales_output.csv', index=True)

#读取Excel文件
# df_excel = pd.read_excel('../data/A2.xlsx')
# print(df_excel)

#写出到Excel
# df.to_excel('../data/output/sales_output.xlsx', index=False)

#SQL数据库读写 需要安装: pip install sqlalchemy pymysql
# from sqlalchemy import create_engine

#连接数据库
# engine = create_engine('mysql+pymysql://用户名:密码@localhost:3306/数据库名?charset=utf8')

#读取整张表
# df = pd.read_sql_table('表名', con=engine)
# print(df)

#执行SQL查询读取
# df = pd.read_sql_query('SELECT * FROM 表名 WHERE 条件', con=engine)
# print(df)

#查看数据库中的表
# print(pd.read_sql_query('show tables', con=engine))
