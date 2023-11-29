data_list = [
    3.1, 2.7, 5.5,
    157, 373, 412,
    "Hello", "Python", "world", "AI",
    13, "LAB-IT", "UMM"
]


float_list = list(filter(lambda x: isinstance(x, float), data_list))
int_list = list(filter(lambda x: isinstance(x, int), data_list))
string_list = list(filter(lambda x: isinstance(x, str), data_list))
split_data = []

for number in int_list:
    satuan = number % 10
    puluhan = (number // 10) % 10
    ratusan = number // 100
    split_data.append(
        {'ratusan': ratusan, 'puluhan': puluhan, 'satuan': satuan})


print("Data Float:", float_list)

for i, item in enumerate(split_data):
    print(f"Data Int  {item}")

print("Data String:", string_list)
