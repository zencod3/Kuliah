import random


def generateRandomInt(max_value):
    return random.randint(0, max_value - 1)


def createBoard():
    print('~~Selamat datang dipermainan board game pemrograman fungsional~~')
    print("-" * 80)
    print('Anda (A) dapat berjalan secara horizontal dan vertikal untuk menuju target (O)\nGunakan keyboard ASDW untuk bergerak')
    print("-" * 80)
    print('~~Selamat bermain~~\n')
    width = int(input('Enter the board width: '))
    height = int(input('Enter the board height: '))
    print('\nNew board generated')

    boards = [['-' for _ in range(width)] for _ in range(height)]

    a_x, a_y = generateRandomInt(width), generateRandomInt(height)
    o_x, o_y = generateRandomInt(width), generateRandomInt(height)

    while (a_x, a_y) == (o_x, o_y):
        o_x, o_y = generateRandomInt(width), generateRandomInt(height)

    boards[a_y][a_x] = "A"
    boards[o_y][o_x] = "O"

    return boards, (a_x, a_y), (o_x, o_y)


def printBoard(board, a_position, o_position):
    boards = board
    # print("Len Board : ", len(boards[0]))
    print('\n' + '-' * (len(boards[0]) * 2 + 1))
    for row in boards:
        print('|' + ' '.join(row) + '|')
    print('-' * (len(boards[0]) * 2 + 1))
    print(f"Posisi Anda (A) adalah {a_position}")
    print(f"Tujuan (O) adalah {o_position}\n")


def move(board, a_position, direction):
    boards = board
    new_a_x, new_a_y = a_position

    if direction == 'w' and a_position[1] > 0:
        new_a_y = a_position[1] - 1
    elif direction == 'a' and a_position[0] > 0:
        new_a_x = a_position[0] - 1
    elif direction == 's' and a_position[1] < len(boards) - 1:
        new_a_y = a_position[1] + 1
    elif direction == 'd' and a_position[0] < len(boards[0]) - 1:
        new_a_x = a_position[0] + 1

    if (new_a_x, new_a_y) != a_position:
        boards[a_position[1]][a_position[0]] = '-'
        boards[new_a_y][new_a_x] = 'A'
        return True, (new_a_x, new_a_y)
    return False, a_position


def main():
    boards, a_position, o_position = createBoard()
    while True:
        printBoard(boards, a_position, o_position)
        direction = input("Pilih arah (WASD) atau q (quit): ").lower()

        if direction == 'q':
            break

        moved, a_position = move(boards, a_position, direction)
        if moved and a_position == o_position:
            print('Anda Menang !!!')
            break


if __name__ == "__main__":
    main()
