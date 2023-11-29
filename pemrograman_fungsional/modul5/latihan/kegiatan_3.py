import matplotlib.pyplot as plt
import numpy as np

y1 = np.array([3, 8, 1, 10])
y2 = np.array([6, 2, 7, 11])
y3 = np.array([4, 9, 2, 8])

plt.plot(y1, label='Garis 1', color='blue')
plt.plot(y2, label='Garis 2', color='green')
plt.plot(y3, label='Garis 3', color='red')

plt.title('Plot Tiga Garis')
plt.xlabel('Nilai X')
plt.ylabel('Nilai y')

plt.legend()
plt.show()
