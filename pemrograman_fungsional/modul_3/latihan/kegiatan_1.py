def convert_to_minutes(weeks, days, hours, minutes):
    return weeks * 7 * 24 * 60 + days * 24 * 60 + hours * 60 + minutes


def curried_converter(weeks):
    def curried_converter_days(days):
        def curried_converter_hours(hours):
            def curried_converter_minutes(minutes):
                return convert_to_minutes(weeks, days, hours, minutes)
            return curried_converter_minutes
        return curried_converter_hours
    return curried_converter_days


data = ["3 minggu 3 hari 7 jam 21 menit",
        "5 minggu 5 hari 8 jam 11 menit", "7 minggu 1 hari 5 jam 33 menit"]
outputData = []

for item in data:
    values = [int(val) for val in item.split() if val.isdigit()]
    if len(values) == 4:
        minutes = curried_converter(values[0])(values[1])(values[2])(values[3])
        outputData.append(minutes)

print("Data : ", data)
print("outputData : ", outputData)
