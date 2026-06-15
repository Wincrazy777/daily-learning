import pandas as pd

#根据字典{'A': [1,3,5], 'B': [2,4,6]}创建DataFrame，并添加列C=A+B
data = {'A': [1, 3, 5], 'B': [2, 4, 6]}
df = pd.DataFrame(data)
df['C'] = df['A'] + df['B']
print(df)

#加载sales.csv后，显示前3行、统计描述信息及列数据类型
# df = pd.read_csv('../data/sales_data.csv')
# print(df.head(3))
# print(df.describe())
# print(df.dtypes)
