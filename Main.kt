fun main() {
    val cinema = Cinema()
    while (true) {
        println("Введите 1 для продажи билета, 2 для просмотра проданных билетов, 0 для выхода:")
        when (readLine()) {
            "1" -> {
                println("Введите название фильма:")
                val movieTitle = readLine() ?: ""
                println("Введите место:")
                val seat = readLine() ?: ""
                println("Введите время начала сеанса:")
                val showTime = readLine() ?: ""
                cinema.sellTicket(movieTitle, seat, showTime)
            }
            "2" -> {
                cinema.showSoldTickets()
            }
            "0" -> {
                println("Выход из программы.")
                return
            }
            else -> {
                println("Неверный ввод. Пожалуйста, попробуйте снова.")
            }
        }
    }
}