import matplotlib.pyplot as plt

# Data transaksi penjualan produk
data_transaksi = [
    ("Produk A", 50, 10),
    ("Produk B", 30, 25),
    ("Produk C", 20, 30),
    ("Produk D", 60, 8),
    ("Produk E", 40, 15),
    ("Produk F", 70, 5)
]

# Unpack data transaksi
produk, harga, jumlah_terjual = zip(*data_transaksi)

# Hitung pendapatan untuk setiap produk
pendapatan = [harga[i] * jumlah_terjual[i] for i in range(len(produk))]

# Membuat subplot dengan 1 baris dan 2 kolom
fig, (scatter_ax, bar_ax) = plt.subplots(1, 2, figsize=(12, 5))

# Scatter plot untuk hubungan antara harga dan jumlah terjual
scatter_ax.scatter(harga, jumlah_terjual, color='blue', label='Hubungan Harga Produk dan Jumlah Produk Terjual')
scatter_ax.set_xlabel('Harga Produk')
scatter_ax.set_ylabel('Jumlah Produk Terjual')
scatter_ax.set_title('Hubungan Harga Produk dan Jumlah Produk Terjual')
scatter_ax.legend()

# Bar plot untuk pendapatan produk
bar_ax.bar(produk, pendapatan, color='green', label='Pendapatan Produk')
bar_ax.set_xlabel('Nama Produk')
bar_ax.set_ylabel('Pendapatan Produk')
bar_ax.set_title('Pendapatan Produk')
bar_ax.legend()

# Menampilkan subplot
plt.tight_layout()
plt.show()
