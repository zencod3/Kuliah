def point(x, y):
    return x, y

def line_equation_of(p1, p2):
    # Inner function untuk menghitung nilai M (gradien)
    def calculate_m(point1, point2):
        x1, y1 = point1
        x2, y2 = point2
        return (y2 - y1) / (x2 - x1)

    # Menghitung nilai M (gradien) menggunakan inner function
    M = calculate_m(p1, p2)

    # Menghitung nilai C (konstanta) menggunakan rumus y = mx + c
    # Kita bisa menggunakan salah satu titik (misalnya p1) untuk mencari nilai C
    C = p1[1] - M * p1[0]

    # Membentuk persamaan garis lurus
    return f"y = {M:.2f}x + {C:.2f}"

# Titik A dan B
point_A = point(1, 3)
point_B = point(5, 9)

# Menampilkan persamaan garis yang melalui titik A dan B
print("Persamaan garis yang melalui titik A dan B:")
print(line_equation_of(point_A, point_B))
