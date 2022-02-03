package ru.job4j.condition;

public class ChessBoard2 {
    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (isValid(x1) && isValid(x2) && isValid(y1) && isValid(y2)) { //проверяем не превышает ли ход площадь игр.поля
            if (x1 == x2 || y1 == y2) { //проверяем движется ли фигура по прямой, если возвращает false, то метод вернёт "0"
                //если true считает количество клеток
                rsl = Math.abs(x2 - x1); //используем math для получения абсалютного значения
                rsl = rsl == 0 ? Math.abs(y2 - y1) : rsl; //если rsl равен нулю, значит движение было по оси Y,
                // рассчитываем абсалютное значение по кол-ву клеток , если не равно нулю значит rsl равно кол-ву клеток по оси x
            }
        }
        return rsl;
    }

    private static boolean isValid(int coordinate) {
        return coordinate >= 0 && coordinate <= 7;
    }

    public static void main(String[] args) {
        System.out.println(ChessBoard2.way(0, 0, 0, 6));
        //System.out.println(ChessBoard.way(0, 0, 9, 0));
        //System.out.println(ChessBoard.way(0, 0, 5, 6));
    }
}