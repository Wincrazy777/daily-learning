import numpy as np

#创建一个3x3x3的随机数组
arr = np.random.randn(3, 3, 3)
print(arr)

#创建一个10x10的随机数组并找到其最大值和最小值
arr2 = np.random.randn(10, 10)
print(arr2.max())
print(arr2.min())

#创建一个大小为30的随机向量并计算其平均值
arr3 = np.random.randn(30)
print(arr3.mean())

#计算矩阵A和B的逐元素加法与乘法
A = np.asmatrix([[1, 2], [3, 4]])
B = np.asmatrix([[5, 6], [7, 8]])
print(A + B)
print(A * B)

#计算气温数组[28,30,29,31,32,30,29]的平均值、最高值和最低值
arr4 = np.array([28, 30, 29, 31, 32, 30, 29])
print(arr4.mean())
print(arr4.max())
print(arr4.min())

#计算学生成绩[85,90,78,92,88]的平均分、中位数和标准差
arr5 = np.array([85, 90, 78, 92, 88])
print(arr5.mean())
print(np.median(arr5))
print(arr5.std())

#计算销售额[120,135,110,125,130,140]的总和、均值和方差
arr6 = np.array([120, 135, 110, 125, 130, 140])
print(arr6.sum())
print(arr6.mean())
print(arr6.var())

#计算两个一维数组[1,2,3]和[4,5,6]的点积
arr7 = np.array([1, 2, 3])
arr8 = np.array([4, 5, 6])
print(np.dot(arr7, arr8))

#计算数组[1,4,9]的自然对数
arr9 = np.array([1, 4, 9])
print(np.log(arr9))

#计算数组[4,16,25]的平方根
arr10 = np.array([4, 16, 25])
print(np.sqrt(arr10))
