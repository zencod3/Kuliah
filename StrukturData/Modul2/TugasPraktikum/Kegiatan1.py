hewan = ["Angsa", "Bebek", "Cicak", "Domba", "Elang", "Gajah"]
kosong = []

hewan.append("Badak")
hewan.append("Bebek")

jumlahBebek = 0
for i in range(len(hewan)):
    if hewan[i] == "Bebek":
        jumlahBebek += 1
        if jumlahBebek != 0:
            kosong.append(str(i))

print("Output No 2:")
print(hewan)
print("Jumlah Bebek:", jumlahBebek)
print("Posisi Index Bebek:", kosong, "\n")

hewan.remove("Bebek")
print("Output No 3:")
print(hewan, "\n")

print("Output No 4:")
print("Elemen pada index ke-0:", hewan[0])
print("Elemen pada index ke-2:", hewan[2])
hewan.pop(0)
print(hewan, "\n")

print("Output No 5:")
hewan[0] = "Ular"
hewan.insert(2, "Itik")
print(hewan, "\n")

print("Output No 6:")
del hewan[1:5]
print(hewan, "\n")

print("Output No 7:")
print("Elemen pertama:", hewan[0])
print("Elemen terakhir:", hewan[-1], "\n")

print("Output No 8:")
print("Jumlah elemen:", len(hewan), "\n")

print("Output No 9:")
posisiBadak = hewan.index("Badak")
print("Posisi index Badak:", posisiBadak)
