class Cinema {
    private val soldTickets = mutableListOf<Ticket>()

    fun sellTicket(movieTitle: String, seat: String, showTime: String) {
        val ticket = Ticket(movieTitle, seat, showTime)
        soldTickets.add(ticket)
        println("Билет на фильм '$movieTitle' продан на место '$seat' в '$showTime'.")
    }

    fun showSoldTickets() {
        if (soldTickets.isEmpty()) {
            println("Нет проданных билетов.")
        } else {
            println("Проданные билеты:")
            for (ticket in soldTickets) {
                println("Фильм: ${ticket.movieTitle}, Место: ${ticket.seat}, Время: ${ticket.showTime}")
            }
        }
    }
}