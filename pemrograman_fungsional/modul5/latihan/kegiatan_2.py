import matplotlib.pyplot as plt
import numpy as np

xpoints = np.array([1, 8, 10])
ypoints = np.array([3, 10, 5])

plt.figure(figsize=(5,5))
plt.plot(xpoints, ypoints, color='red')
plt.xlim([0,15])
plt.ylim([0,15])
plt.show()

# import matplotlib.pyplot as plt
# import numpy as np

# # Koordinat titik-titik
# xpoints = np.array([1, 8, 10])
# ypoints = np.array([3, 10, 5])

# # Ukuran figur
# plt.figure(figsize=(8, 6))

# # Plot garis dengan warna merah
# plt.plot(xpoints, ypoints, color='red', marker='o', linestyle='dashed', linewidth=2, markersize=8, label='Garis 1-2-3')

# # Menambahkan titik dengan warna biru
# plt.scatter(5, 7, color='blue', marker='^', s=100, label='Titik Tambahan')

# # Menambahkan teks pada titik (8, 10)
# plt.text(8, 10, '(8, 10)', fontsize=12, ha='right')

# # Menambahkan label pada sumbu x dan y
# plt.xlabel('Sumbu X')
# plt.ylabel('Sumbu Y')

# # Menambahkan judul
# plt.title('Grafik dengan Variasi')

# # Menampilkan legenda
# plt.legend()

# # Mengatur batas sumbu x dan y
# plt.xlim([0, 15])
# plt.ylim([0, 15])

# # Menampilkan grid
# plt.grid(True)

# # Menampilkan grafik
# plt.show()
