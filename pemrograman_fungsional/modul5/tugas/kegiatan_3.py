import numpy as np
import matplotlib.pyplot as plt
from scipy.stats import norm

tinggi_badan = [165, 170, 155, 180, 160, 175, 165, 185, 175, 170, 160]

intervals = [(150, 160), (161, 170), (171, 180), (181, 190)]

frekuensi = [np.sum((np.array(tinggi_badan) >= low) & (np.array(tinggi_badan) <= high)) for low, high in intervals]

plt.subplot(2, 1, 1)
plt.bar([f"{low}-{high}" for low, high in intervals], frekuensi, color='blue')
plt.title('Histogram Frekuensi Tinggi Badan')
plt.xlabel('Interval Tinggi Badan (cm)')
plt.ylabel('Frekuensi')

plt.subplot(2, 1, 2)
mu, std = np.mean(tinggi_badan), np.std(tinggi_badan)

x = np.linspace(min(tinggi_badan), max(tinggi_badan), 100)
pdf = norm.pdf(x, mu, std)

plt.plot(x, pdf, label='PDF (Normal Distribution)', color='red')
plt.title('Kurva PDF Tinggi Badan')
plt.xlabel('Interval Tinggi Badan (cm)')
plt.ylabel('Frekuensi')
plt.legend()

plt.tight_layout()
plt.show()
