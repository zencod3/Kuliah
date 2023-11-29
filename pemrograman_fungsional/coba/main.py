board = [['R', 'N', 'B', 'Q', 'K', 'B', 'N', 'R'],
         ['.', '.', '.', '.', '.', '.', '.', '.'],
         ['.', '.', '.', '.', '.', '.', '.', '.'],
         ['.', '.', '.', '.', '.', '.', '.', '.'],
         ['.', '.', '.', '.', '.', '.', '.', '.'],
         ['.', '.', '.', '.', '.', '.', '.', '.'],
         ['.', '.', '.', '.', '.', '.', '.', '.'],
         ['P', 'P', 'P', 'P', 'P', 'P', 'P', 'P'],
         ['p', 'p', 'p', 'p', 'p', 'p', 'p', 'p'],
         ['.', '.', '.', '.', '.', '.', '.', '.'],
         ['.', '.', '.', '.', '.', '.', '.', '.'],
         ['.', '.', '.', '.', '.', '.', '.', '.'],
         ['.', '.', '.', '.', '.', '.', '.', '.'],
         ['.', '.', '.', '.', '.', '.', '.', '.'],
         ['.', '.', '.', '.', '.', '.', '.', '.'],
         ['P', 'P', 'P', 'P', 'P', 'P', 'P', 'P'],
         ['R', 'N', 'B', 'Q', 'K', 'B', 'N', 'R']]

def get_valid_moves(position, board):
    x, y = position
    piece = board[y][x]
    if piece == 'P':
        return get_valid_moves_pawn(position, board)
    elif piece == 'R':
        return get_valid_moves_rook(position, board)
    # and so on for other pieces

def get_valid_moves_pawn(position, board):
    x, y = position
    valid_moves = []
    if board[y+1][x] == '.':
        valid_moves.append((x, y+1))
    # and so on for other moves
    return valid_moves

def get_valid_moves_rook(position, board):
    x, y = position
    valid_moves = []
    for i in range(1, 8):
        if board[y][x+i] != '.':
            break
        valid_moves.append((x+i, y))
    # and so on for other moves
    return valid_moves

# and so on for other pieces

def main():
    # Get player input for piece to move
    piece_position = input("Enter the position of the piece to move: ")
    x, y = map(int, piece_position.split())
    x, y = x-1, y-1

    valid_moves = get_valid_moves((x, y), board)

    # Display valid moves
    for move in valid_moves:
        print(move)

if __name__ == "__main__":
    main()