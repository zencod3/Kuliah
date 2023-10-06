random_list = [105, 3.1, "Hello", 737, "Python", 2.7, "World", 412, 5.5, "AI"]

str_list = []
float_tuple = ()
int_dict = {}

for item in random_list:
    if isinstance(item, int):        
        satuan = item % 10
        puluhan = (item % 100) // 10
        ratusan = item // 100
        int_dict[item] = {'ratusan': ratusan, 'puluhan': puluhan, 'satuan': satuan}
    elif isinstance(item, float):        
        float_tuple += (item,)
    elif isinstance(item, str):        
        str_list.append(item)


print("List of Strings:", str_list)
print("Tuple of Floats:", float_tuple)
print("Dictionary of Integers:", int_dict)