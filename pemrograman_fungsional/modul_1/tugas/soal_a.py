import json
from tabulate import tabulate

def cek_status(nilai):
    return "Lolos" if nilai >= 75 else "Tidak Lolos"

def tambah_data_peserta(data_peserta):
    nama = input("\n[$] Masukkan nama peserta: ")
    nilai = int(input("\n[$] Masukkan nilai peserta: "))
    hasil = cek_status(nilai)

    try:
        with open("d:/Dev/kuliah/pemrograman_fungsional/modul_1/tugas/rapot.json", "r") as file:
            data_peserta = json.load(file)
    except FileNotFoundError:
        pass

    id_peserta = len(data_peserta)

    peserta = {"id": id_peserta, "nama": nama, "nilai": nilai, "hasil": hasil}
    data_peserta.append(peserta)
    print(f"Nama {peserta['nama']} dengan nilai {peserta['nilai']} berhasil ditambahkan.")

    with open("d:/Dev/kuliah/pemrograman_fungsional/modul_1/tugas/rapot.json", "w") as file:
        json.dump(data_peserta, file)

    return data_peserta

def edit_nilai_peserta(data_peserta):
    tampilkan_data_peserta(data_peserta)
    try:
        with open("d:/Dev/kuliah/pemrograman_fungsional/modul_1/tugas/rapot.json", "r") as file:
            data_peserta = json.load(file)
            peserta_ditemukan = False
            for peserta in data_peserta:
                if peserta["id"] == int(input("\n[$] Masukkan ID peserta yang akan diedit: ")):
                    peserta_ditemukan = True
                    nilai_baru = int(input("\n[$] Masukkan nilai baru: "))
                    peserta["nilai"] = nilai_baru
                    peserta["hasil"] = cek_status(nilai_baru)
                    with open("d:/Dev/kuliah/pemrograman_fungsional/modul_1/tugas/rapot.json", "w") as file:
                        json.dump(data_peserta, file)
                    print(f"[+] Nama {peserta['nama']} dengan nilai {peserta['nilai']} berhasil dirubah.")
                    break
            if not peserta_ditemukan:
                print("[!] ID peserta tidak ditemukan.")
    except FileNotFoundError:
        print("[!] Data peserta belum tersedia. Silakan hubungi admin.")

def tampilkan_data_peserta(data_peserta):
    try:
        with open("d:/Dev/kuliah/pemrograman_fungsional/modul_1/tugas/rapot.json", "r") as file:
            data_peserta = json.load(file)

        peserta_table = []
        for peserta in data_peserta:
            peserta_table.append([peserta['id'], peserta['nama'], peserta['nilai'], peserta['hasil']])

        print("\nData Peserta:")
        print(tabulate(peserta_table, headers=["ID", "Nama", "Nilai", "Hasil"], tablefmt="double_grid"))

    except FileNotFoundError:
        print("[!] Data peserta belum tersedia. Silakan hubungi admin.")

def login_admin():
    username = input("\n[$] Masukkan username: ")
    password = input("[$] Masukkan password: ")
    if username == "admin" and password == "admin":
        print(f"\n[+] Login berhasil sebagai admin.")
        menu_admin()
    else:
        print("\n[!] Login gagal. Coba lagi.")

def menu_admin():
    data_peserta = []
    while True:
        print("\n[#] Menu Admin:")
        print("[1] Tambah Data Peserta")
        print("[2] Edit Nilai Peserta")
        print("[3] Tampilkan Keseluruhan Data Peserta")
        print("[4] Log Out")
        pilihan = input("\n[$] Pilih menu: ")

        if pilihan == "1":
            data_peserta = tambah_data_peserta(data_peserta)
        elif pilihan == "2":
            data_peserta = edit_nilai_peserta(data_peserta)
        elif pilihan == "3":
            tampilkan_data_peserta(data_peserta)
        elif pilihan == "4":
            print("\n[+] Admin exit.")
            break
        else:
            print("\n[-] Pilihan tidak valid. Silakan coba lagi.")

def login_peserta():
    nama = input("\n[$] Masukkan nama Anda: ")
    try:
        with open("d:/Dev/kuliah/pemrograman_fungsional/modul_1/tugas/rapot.json", "r") as file:
            data_peserta = json.load(file)
        peserta_ditemukan = False
        for peserta in data_peserta:
            if peserta["nama"] == nama:
                peserta_ditemukan = True
                break
        if peserta_ditemukan:
            print(f"[+] Login berhasil sebagai peserta dengan nama: {nama}")
            menu_peserta(nama)
        else:
            print(f"[!] Nama {nama} tidak ditemukan. Silakan hubungi admin.")
    except FileNotFoundError:
        print("[!] Data peserta belum tersedia. Silakan hubungi admin.")

def menu_peserta(nama):
    while True:
        print("\n[#] Menu Peserta:")
        print("[1] Tampilkan Nilai dan Hasil Anda")
        print("[2] Log Out")
        pilihan = input("\n[$] Pilih menu: ")

        if pilihan == "1":
            tampilkan_nilai_dan_hasil(nama)
        elif pilihan == "2":
            print(f"{nama} exit")
            break
        else:
            print("[!] Pilihan tidak valid. Silakan coba lagi.")

def tampilkan_nilai_dan_hasil(nama):
    try:
        with open("d:/Dev/kuliah/pemrograman_fungsional/modul_1/tugas/rapot.json", "r") as file:
            data_peserta = json.load(file)

        peserta_table = []
        for peserta in data_peserta:
            if peserta["nama"] == nama:
                peserta_table.append([peserta['id'], peserta['nama'], peserta['nilai'], peserta['hasil']])
                print("\nData Peserta:")
                print(tabulate(peserta_table, headers=["ID", "Nama", "Nilai", "Hasil"], tablefmt="grid"))
                break

    except FileNotFoundError:
        print("[!] Data peserta belum tersedia. Silakan hubungi admin.")

if __name__ == "__main__":
    while True:
        print("\n[#] Selamat Datang!")
        print("[1] Login Admin")
        print("[2] Login Peserta")
        print("[3] Quit Program")
        pilihan_utama = input("\n[$] Pilih tipe login: ")

        if pilihan_utama == "1":
            login_admin()
        elif pilihan_utama == "2":
            login_peserta()
        elif pilihan_utama == "3":
            print("[+] Program Selesai. Bismillah A")
            break
        else:
            print("[!] Pilihan tidak valid. Silakan coba lagi.")