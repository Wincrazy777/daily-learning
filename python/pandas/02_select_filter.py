import pandas as pd

#从DataFrame中同时选取['product','price']列和第2-5行（使用loc/iloc）
data = {
    'product': ['Apple', 'Banana', 'Orange', 'Grape', 'Peach', 'Pear'],
    'price': [1.99, 0.99, 1.49, 2.99, 3.49, 1.79],
    'quantity': [100, 200, 150, 80, 60, 120]
}
df = pd.DataFrame(data)
print(df)
print(df.loc[1:4, ['product', 'price']])
print(df.iloc[1:5, [0, 1]])

#筛选出df中age>30且salary>5000的所有记录
data = {
    'name': ['Alice', 'Bob', 'Charlie', 'David', 'Eva'],
    'age': [25, 32, 28, 35, 40],
    'salary': [4500, 6000, 5200, 7000, 4800],
    'department': ['HR', 'IT', 'HR', 'Finance', 'IT']
}
df = pd.DataFrame(data)
print(df[(df['age'] > 30) & (df['salary'] > 5000)])
