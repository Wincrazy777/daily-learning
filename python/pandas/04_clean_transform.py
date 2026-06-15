import pandas as pd
import numpy as np

#将字符串类型的价格（如"$1.99"）转换为浮点数
data = {
    'product': ['Apple', 'Banana', 'Milk'],
    'price': ["$1.99", "$0.99", "$3.49"]
}
df = pd.DataFrame(data)
df['price'] = df['price'].str.replace('$', '').astype(float)
print(df)

#将old_name改为new_name
df = pd.DataFrame({'old_name': [1, 2, 3]})
df.rename(columns={'old_name': 'new_name'}, inplace=True)
print(df)

#用各列中位数填充df中的NaN值
df = pd.DataFrame({
    'A': [1, 2, np.nan, 4],
    'B': [5, np.nan, np.nan, 8],
    'C': [10, 20, 30, np.nan]
})
print(df.fillna(df.median()))

#删除DataFrame中的完全重复行和全为NaN的列
df = pd.DataFrame({
    'A': [1, 1, 2, 2],
    'B': [5, 5, np.nan, 8],
    'C': [np.nan, np.nan, np.nan, np.nan]
})
df = df.drop_duplicates()
df = df.dropna(axis=1, how='all')
print(df)

#使用apply()函数将'text'列的所有字母转为大写
df = pd.DataFrame({
    'text': ['hello', 'world', 'pandas', 'apply'],
    'count': [1, 2, 3, 4]
})
df['text'] = df['text'].apply(lambda x: x.upper())
print(df)

#删除重复的order_id记录（每组只保留一个）
df = pd.DataFrame({
    'order_id': [1001, 1002, 1001, 1003, 1002],
    'amount': [50, 30, 20, 10, 60]
})
df.drop_duplicates(subset=['order_id'], inplace=True)
print(df)
