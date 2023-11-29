data = ["3 minggu 3 hari 7 jam 21 menit",
        "5 minggu 5 hari 8 jam 11 menit",
        "7 minggu 1 hari 5 jam 33 menit"]
filtered_data = []

for item in data:
    integers = [s for s in item.split() if s.isdigit()]
    filtered_data.append(integers)

for item in filtered_data:
    print(item)
