import numpy as np

#创建一个长度为10的一维零数组，并将第5个元素设置为1
arr = np.zeros(10)
arr[4] = 1
print(arr)

#创建一个值域范围从10到49的向量
arr1 = np.arange(10, 50)
print(arr1)

#创建一个3x3的单位矩阵
arr2 = np.eye(3)
print(arr2)

#创建一个5x5的二维数组，边界值为1，内部为0
arr3 = np.zeros((5, 5))
arr3[0, :] = 1
arr3[-1, :] = 1
arr3[:, 0] = 1
arr3[:, -1] = 1
print(arr3)

#生成5x5随机数组（范围0-20），将大于10的元素替换为0
arr4 = np.random.randint(0, 21, size=(5, 5))
print(arr4)
arr4[arr4 > 10] = 0
print(arr4)

#生成一个3x4的随机整数数组（范围0-10），将所有奇数替换为-1
arr5 = np.random.randint(0, 10, (3, 4))
print(arr5)
arr5[arr5 % 2 == 1] = -1
print(arr5)
