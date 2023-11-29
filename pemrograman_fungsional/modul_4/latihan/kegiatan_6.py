def point(x, y):
    return x, y

def line_equation_of(x1, y1, M):
    # Menghitung nilai C menggunakan rumus y-y1 = m(x-x1)
    C = y1 - M * x1

    # Membentuk persamaan garis lurus
    return f"y = {M:.2f}x + {C:.2f}"

# Menampilkan persamaan garis yang melalui titik (6,-2) dan bergradien -2
print("Persamaan garis yang melalui titik (3,2) dan bergradien -2:")
print(line_equation_of(3, 2, 1))
