import matplotlib.pyplot as plt
import seaborn as sns
import numpy as np
import pandas as pd

#设置中文字体
plt.rcParams['font.sans-serif'] = ['SimHei']
plt.rcParams['axes.unicode_minus'] = False

#调色板 palplot可视化显示
sns.palplot(sns.color_palette('hls', 8))
plt.title('HLS 调色板 (8色)')
plt.show()

#Blues渐变色
sns.palplot(sns.color_palette('Blues', 8))
plt.title('Blues 渐变色')
plt.show()

#light_palette亮色渐变
sns.palplot(sns.light_palette('green', 8))
plt.title('light_palette: green')
plt.show()

#displot分布直方图
x = np.random.rand(100)
sns.displot(x, bins=20, color='red')
plt.title('分布图')
plt.show()

#heatmap热力图 annot显示数值 fmt整数格式 cmap配色
flights = sns.load_dataset('flights')
flights_pivot = flights.pivot(index='month', columns='year', values='passengers')
sns.heatmap(flights_pivot, annot=True, fmt='d', cmap='YlGnBu')
plt.title('航班乘客热力图')
plt.show()

#pairplot散点图矩阵 hue按类别着色 diag_kind对角线图类型
np.random.seed(42)
housing_data = pd.DataFrame({
    'price': np.random.normal(500, 200, 150),
    'area': np.random.normal(120, 30, 150),
    'floor': np.random.choice(['低', '中', '高'], 150),
    'age': np.random.randint(1, 30, 150)
})

sns.pairplot(housing_data,
             vars=['price', 'area', 'age'],
             hue='floor',
             diag_kind='hist',
             markers=['o', 's', 'D'],
             plot_kws={'alpha': 0.7})
plt.suptitle('房价与面积、房龄相关性分析（按楼层区分）', y=1.02)
plt.show()
