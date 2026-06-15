import matplotlib.pyplot as plt
import numpy as np
import pandas as pd

#设置中文字体
plt.rcParams['font.sans-serif'] = ['SimHei']
plt.rcParams['axes.unicode_minus'] = False

#折线图 展示趋势
x = np.arange(1, 21)
y1 = 2 * x
y2 = 3 * x

plt.figure(figsize=(10, 5))
plt.title('线性函数对比', fontsize=16)
plt.xlabel('x')
plt.ylabel('y')
plt.grid(True, linestyle='--', alpha=0.5)
plt.plot(x, y1, label='2x', marker='o')
plt.plot(x, y2, label='3x', marker='s')
plt.legend()
plt.show()

#柱状图 分类对比 并排柱状图通过偏移x坐标实现
categories = ['老虎', '狮子', '大象']
data1 = [1, 2, 3]
data2 = [3, 2, 1]
x_pos = np.array([1, 2, 3])

plt.figure(figsize=(8, 5))
plt.title('柱状图示例', fontsize=16)
plt.xticks(x_pos, categories)
plt.bar(x_pos - 0.15, data1, width=0.3, label='数据集1')
plt.bar(x_pos + 0.15, data2, width=0.3, label='数据集2')
plt.legend()
plt.show()

#水平柱状图
plt.figure(figsize=(8, 5))
plt.title('水平柱状图')
plt.barh(categories, data1)
plt.show()

#饼图 explode突出某块
labels = ['Frogs', 'Hogs', 'Dogs', 'Logs']
sizes = [15, 30, 45, 10]
explode = (0, 0, 0.1, 0)

plt.figure(figsize=(6, 6))
plt.pie(sizes, labels=labels, explode=explode,
        autopct='%1.1f%%', shadow=True, startangle=90)
plt.title('饼图示例')
plt.show()

#散点图 展示分布
x = np.random.random(100)
y = np.random.random(100)

plt.figure(figsize=(8, 6))
plt.title('散点图')
plt.scatter(x, y, alpha=0.6, marker='o', c='blue')
plt.grid(True, alpha=0.3)
plt.show()

#多维度散点图 s=点大小(点击次数) c=颜色(用户等级)
np.random.seed(42)
data = {
    '浏览时长': np.random.normal(15, 5, 100),
    '购买金额': np.random.normal(200, 50, 100),
    '点击次数': np.random.randint(10, 100, 100),
    '用户等级': np.random.choice([1, 2, 3], 100)
}
df = pd.DataFrame(data)

plt.figure(figsize=(10, 6))
plt.scatter(x=df['浏览时长'], y=df['购买金额'],
            s=df['点击次数'], c=df['用户等级'],
            alpha=0.5, cmap='viridis')
plt.xlabel('浏览时长（分钟）')
plt.ylabel('购买金额（元）')
plt.title('用户行为分析')
plt.colorbar(label='用户等级')
plt.grid(True, alpha=0.3)
plt.show()

#subplots子图 flatten展平方便遍历 tight_layout自动调整间距
fig, axs = plt.subplots(2, 2, figsize=(10, 8))
axs = axs.flatten()

regions_sales = [
    [200, 400, 600, 800],
    [300, 500, 300, 700],
    [400, 600, 800, 500],
    [100, 300, 500, 900]
]
quarters = ['Q1', 'Q2', 'Q3', 'Q4']
titles = ['区域A', '区域B', '区域C', '区域D']

for i, ax in enumerate(axs):
    ax.plot(quarters, regions_sales[i], marker='o')
    ax.set_title(titles[i])
    ax.set_xlabel('季度')
    ax.set_ylabel('销售额（万元）')
    ax.set_ylim(0, 1000)
    ax.grid(True)

plt.tight_layout()
plt.show()

#箱线图 展示数据分布
scores = {
    '语文': [82, 85, 88, 70, 90, 76, 84, 83, 95],
    '数学': [75, 80, 79, 93, 88, 82, 87, 89, 92],
    '英语': [70, 72, 68, 65, 78, 80, 85, 90, 95],
}

plt.figure(figsize=(8, 6))
plt.boxplot(scores.values(), tick_labels=scores.keys())
plt.title('各科成绩分布')
plt.ylabel('分数')
plt.grid(True, axis='y', alpha=0.3)
plt.show()
