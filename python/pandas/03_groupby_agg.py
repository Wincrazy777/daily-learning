import pandas as pd
import numpy as np

#对sales_data按category分组，计算每组的平均price和总quantity
data = {
    'product': ['Apple', 'Banana', 'Orange', 'Grape', 'Milk', 'Bread'],
    'category': ['Fruit', 'Fruit', 'Fruit', 'Fruit', 'Dairy', 'Bakery'],
    'price': [1.99, 0.99, 1.49, 2.99, 3.49, 2.49],
    'quantity': [100, 200, 150, 80, 120, 90]
}
df = pd.DataFrame(data)
print(df.groupby('category').agg(
    avg_price=('price', 'mean'),
    total_quantity=('quantity', 'sum')
))

#groupby对音乐行业数据分组，查看分组后的描述性统计
# md_from_file = pd.read_csv('../data/musicdata.csv')
# musicdataGroup = md_from_file[['format', 'metric', 'value_actual']].groupby(by='format')
# print(musicdataGroup.describe())
