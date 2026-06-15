import numpy as np

#反转一个向量（第一个元素变为最后一个）
arr = np.arange(10, 50)
arr2 = arr[::-1]
print(arr2)

#创建一个3x3矩阵，值从0到8
arr3 = np.arange(9).reshape((3, 3))
print(arr3)

#找到数组[1,2,0,0,4,0]中非零元素的位置索引
arr4 = np.array([1, 2, 0, 0, 4, 0])
print(np.where(arr4 != 0))

#将一维数组[1,8,2,6,4,10]中所有大于5的元素替换为5
arr5 = np.array([1, 8, 2, 6, 4, 10])
arr5[arr5 > 5] = 5
print(arr5)

#将一维数组[1,2,3,4,5]中奇数索引位置的元素取相反数
arr6 = np.array([1, 2, 3, 4, 5])
arr6[1] = arr6[1] * -1
arr6[3] = arr6[3] * -1
print(arr6)

#生成一个大小为10的随机数组，将大于0.5的元素替换为1，其余为0
np.random.seed(42)
arr7 = np.random.randn(10)
arr7 = np.where(arr7 > 0.5, 1, 0)
print(arr7)

#将float32类型数组转换为int32类型
arr8 = np.arange(10, dtype=np.float32)
arr8 = np.arange(10, dtype=np.int32)
print(arr8)

#创建一个5x5数组，每个元素值为行索引加列索引的和
arr9 = np.fromfunction(lambda i, j: i + j, (5, 5), dtype=int)
print(arr9)

#将1到12的一维数组转换为3x4二维数组，计算每行和与每列均值
arr10 = np.arange(1, 13)
arr11 = arr10.reshape(3, 4)
print(arr11)
print(arr11.sum(axis=0))
print(arr11.mean(axis=1))
