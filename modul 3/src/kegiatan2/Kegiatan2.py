queue = []

while True:
    print("=== Antrian Pembelian Eskrim Mixue ===")
    print("1. Tambah Antrian")
    print("2. Proses Pembelian")
    print("3. Jumlah Antrian")
    print("4. Eskrim yang akan diproses selanjutnya")
    print("5. Tampilkan Antrian")
    print("6. Keluar")

    choice = input("Masukkan pilihan: ")

    if choice == "1":
        eskrim_name = input("Masukkan nama eskrim: ")
        queue.append(eskrim_name)
        print("Eskrim", eskrim_name, "telah ditambahkan ke dalam antrian")

    elif choice == "2":
        if not queue:
            print("Antrian kosong")
        else:
            print("Eskrim", queue.pop(0), "telah diproses")

    elif choice == "3":
        print("Jumlah antrian saat ini:", len(queue))

    elif choice == "4":
        if not queue:
            print("Tidak ada eskrim")
        else:
            print("Eskrim yang akan diproses selanjutnya:", queue[0])

    elif choice == "5":
        if not queue:
            print("Antrian kosong")
        else:
            print("Semua Antrian:")
            for i, eskrim in enumerate(queue, 1):
                print(i, ".", eskrim)

    elif choice == "6":
        print("Keluar dari sistem")
        break

    else:
        print("Pilihan tidak valid!")

    print()
